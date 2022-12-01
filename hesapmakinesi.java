package javapatika;
import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double x,y;
      String islem;
        System.out.print("hangi işlemi yapmak istersin: toplama çıkarma çarpma bölme ? ");
        islem = input.nextLine();
        System.out.print("birinci sayıyı gir");
      x = input.nextDouble();
        System.out.print("ikinci sayıyı gir");
        y = input.nextDouble();



        switch (islem) {
            case "toplama":
                System.out.println("işlem sonucu");
                System.out.println(x+y);
                break;
            case "çıkarma":
                System.out.println("işlem sonucu");
                System.out.println(x-y);
                break;
            case "çarpma":
                System.out.println("işlem sonucu");
                System.out.println(x*y);
                break;
            case "bölme":
                System.out.println("işlem sonucu");
                System.out.println(x/y);
                break;
            default:
                System.out.println("hatalı işlem seçtin");
                break;
        }

    }
}
