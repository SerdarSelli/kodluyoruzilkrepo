import java.util.Scanner;

public class ucgenYildiz {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 1; j < (n - i); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(i);
        }
        for (int a = n-1;a>=1;a--){
            for (int b = 1;b<=(n-a);b++){
                System.out.print(".");
            }
            for(int c = 1;c<=(2 * a)-1;c++){
                System.out.print("*");
            }
            System.out.println(a);
        }
    }
}
