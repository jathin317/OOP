public class even_numbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 != 0 && i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}