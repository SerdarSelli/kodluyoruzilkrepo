import java.util.Scanner;
public class ucDortBolunen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, tpl=0;
        int sayac=0;
        int ort;

        System.out.print("sayı giriniz");
        a = scanner.nextInt();

        for(int i=1;i<=a;i++){
            if (i%3==0 && i%4==0){
                tpl+=i;
                System.out.println("tpl= "+tpl);
                System.out.println(tpl+"toplam");

                sayac++;
                System.out.println("sayaç "+ sayac);
            }
        }
        System.out.println("girilen sayılardan 3 ve 4 e tam bölünen sayıların ortalaması= "+(tpl/sayac));


    }
}
