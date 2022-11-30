import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   double tutar;
        double kdv;
        double kdvsiz;
        System.out.println("tutarı gir");
   tutar = input.nextDouble();
        System.out.println("ürün tutarı :"+ tutar);
        if (tutar >= 1000) {
            kdv = tutar * 0.08;
            kdvsiz = tutar - kdv ;
            System.out.println("kdvsiz fiyat: " + kdvsiz );
            System.out.println("kdv tutarı: " + kdv );
        } else {
            kdv = tutar * 0.18;
            kdvsiz = tutar - kdv ;
            System.out.println("kdvsiz fiyat: " + kdvsiz );
            System.out.println("kdv tutarı: " + kdv );
        }
    }
}
