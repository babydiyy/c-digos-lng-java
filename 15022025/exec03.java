public class exec03 {
    public static void main(String[] args) {
        int x = 13;
        System.out.print(x);

        while (x != 1){
            if (x % 2 == 0){
                x = x / 2;
            } else {
                x = 3 * x + 1;

            }
            System.out.println(" ->" + x);

        }
        System.err.println();
    }
}