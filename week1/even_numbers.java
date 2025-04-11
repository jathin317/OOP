public class even_numbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 != 0 && i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

/*
 * Sample Output:
 * 2 4 6 8 12 14 16 18 22 24 26 28 32 34 36 38 42 44 46 48
 */