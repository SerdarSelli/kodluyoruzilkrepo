import java.util.Scanner;

public class basamakSayisiHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayıgiriniz");
       int  girilenSayi=input.nextInt();
        int kopyaGirilenSayii= girilenSayi;
        int basamakSayisi=0;

        for (int i =1;kopyaGirilenSayii!=0;i++){
            kopyaGirilenSayii/=10;
            basamakSayisi++;
        }
        kopyaGirilenSayii=girilenSayi;
        int total=0, basamakValue=0;
     for(int j =1;kopyaGirilenSayii!=0;j++){
         basamakValue=kopyaGirilenSayii%10;
         total+=basamakValue;
         kopyaGirilenSayii/=10;
     }
        System.out.println(total);
    }
}
