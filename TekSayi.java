import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int toplam=0;

        do{
            System.out.println("sayı giriniz");
            a = scan.nextInt();
            if (a%2==0 && a%4==0){
                toplam+=a;
            }
        }while(a%2==0);
        System.out.println("girilen sayılardan çift ve 4 e tam bölünenlerin  toplamı= "+toplam);
    }
}
