package week8;

/*You are tasked with developing a Online shopping cart system. The system must perform the following
 * 1. Add products to the cart
 * 2. Remove products from the cart
 * 3. Search for the product in the cart
 * 4. Display the products in the cart
 * 5. Apply discounts(use vector to manage)
 * 6. Checkout and calculate the total price of cost
 * 7. Track recently viewed products(last 5 products).
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;

public class ShoppingCart {
    public static void Display1(ArrayList<String> products, ArrayList<Integer> productPrice) {
        Iterator<String> itr1 = products.iterator();
        Iterator<Integer> itr2 = productPrice.iterator();
        int i = 1;
        while (itr1.hasNext()) {
            System.out.println(i + ". " + itr1.next() + "\t" + itr2.next());
            i++;
        }
        System.out.println();
    }

    public static void Display2(LinkedList<String> products, LinkedList<Integer> productPrice) {
        Iterator<String> itr1 = products.iterator();
        Iterator<Integer> itr2 = productPrice.iterator();
        int i = 1;
        while (itr1.hasNext()) {
            System.out.println(i + ". " + itr1.next() + "\t" + itr2.next());
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> productPrice = new ArrayList<>();
        LinkedList<String> cart = new LinkedList<>();
        LinkedList<Integer> cartPrice = new LinkedList<>();
        Vector<String> recentlyViewed = new Vector<>();
        Vector<String> discounts = new Vector<>();

        products.add("Laptop");
        productPrice.add(90000);
        products.add("Smart phone");
        productPrice.add(20000);
        products.add("Headphones");
        productPrice.add(2000);
        products.add("Smart watch");
        productPrice.add(1500);
        products.add("Tab");
        productPrice.add(15000);

        discounts.add("ELECTRONICS");
        discounts.add("STUDENT");
        discounts.add("SUMMER");

        int total = 0;
        int ch;
        do {
            System.out.println(
                    "1. Add products to the cart\n2. Remove products from the cart\n3. Search for the product in the cart\n4. Display the products in the cart\n5. Checkout\n6. Discount coupons\n7. Recently viewed products(last 5 products)\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Display1(products, productPrice);
                    System.out.println("Enter the product number to add to cart:");
                    int index = sc.nextInt() - 1;
                    total += productPrice.get(index);
                    cart.add(products.get(index));
                    cartPrice.add(productPrice.get(index));
                    recentlyViewed.addFirst(products.get(index));
                    if (recentlyViewed.size() > 5) {
                        recentlyViewed.removeLast();
                    }
                    break;
                case 2:
                    System.out.println("Enter the product name to remove:");
                    String product1 = sc.next();
                    int index1 = cart.indexOf(product1);
                    if (index1 == -1) {
                        System.out.println("Product not found in the cart");
                    } else {
                        total -= cartPrice.get(index1);
                        cart.remove(index1);
                        cartPrice.remove(index1);
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the product to search: ");
                    String product2 = sc.next();
                    if (cart.contains(product2)) {
                        System.out.println("The product is present at index " + cart.indexOf(product2));
                        System.out.println(product2 + "\t" + cartPrice.get(cart.indexOf(product2)));
                    } else {
                        System.out.println("Product not found in the cart");
                    }
                    break;
                case 4:
                    Display2(cart, cartPrice);
                    break;
                case 5:
                    System.out.println("Items in the cart");
                    Display2(cart, cartPrice);
                    System.out.println("Total price = " + total);
                    break;
                case 6:
                    System.out.println("Available coupon codes: " + discounts);
                    System.out.println("Enter coupon code: ");
                    sc.nextLine();
                    String couponCode = sc.nextLine();
                    System.out.println("Enter the product name to apply the discount to:");
                    String productToDiscount = sc.nextLine();
                    int discountIndex = cart.indexOf(productToDiscount);
                    if (discountIndex == -1) {
                        System.out.println("Product not found in the cart");
                        break;
                    }
                    int discount = 0;
                    switch (couponCode) {
                        case "ELECTRONICS":
                            if (cartPrice.get(discountIndex) >= 90000) {
                                discount = 20;
                                System.out.println("20% discount applied");
                            } else {
                                System.out.println("Coupon not applicable");
                            }
                            break;
                        case "STUDENT":
                            if (cartPrice.get(discountIndex) >= 30000) {
                                discount = 10;
                                System.out.println("10% discount applied");
                            } else {
                                System.out.println("Coupon not applicable");
                            }
                            break;
                        case "SUMMER":
                            if (cartPrice.get(discountIndex) >= 1500) {
                                discount = 5;
                                System.out.println("5% discount applied");
                            } else {
                                System.out.println("Coupon not applicable");
                            }
                            break;
                        default:
                            System.out.println("Invalid coupon code");
                            break;
                    }
                    int discountedPrice = cartPrice.get(discountIndex)
                            - (cartPrice.get(discountIndex) * discount) / 100;
                    total -= cartPrice.get(discountIndex) - discountedPrice;
                    cartPrice.set(discountIndex, discountedPrice);
                    System.out.println("New Total = " + total);
                    break;
                case 7:
                    System.out.println("Recently viewed products (last 5):");
                    for (String product : recentlyViewed) {
                        System.out.println(product);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 5);
        sc.close();
    }
}

/*
 * Sample Input:
 * Enter items to add to the cart (comma-separated): Apple, Banana, Orange
 * Enter an item to remove: Banana
 * Output:
 * Original Cart: [Apple, Banana, Orange]
 * Cart after removing Banana: [Apple, Orange]
 * Total items in the cart: 2
 */