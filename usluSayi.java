import java.util.Scanner;
public class usluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("üssü alınacak sayı");
        int a = scanner.nextInt();
        System.out.print("üs olacak sayı giriniz");
        int b = scanner.nextInt();
        int us=1;
        for(int i = 1;i<=b;i++){
            us*=a;
        }
        System.out.println(us);

    }
}
