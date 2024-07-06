public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 8 ; ++i) {
            for (int j = 0; j <= 8; ++j){
                System.out.print(" # ");
            }
            System.out.println();
        }
        System.out.println();
        for (int a = 0; a <= 8 ; a++) {
            for (int b = 0; b <= a; b++){
                System.out.print(" @ ");
            }
            System.out.println();
        }
    }
}

