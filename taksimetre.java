package javapatika;
import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        double km, kmbasina=2.2, acilis=10;
        Scanner input = new Scanner(System.in);
        System.out.println("kaç km yol gettin? ha buraya yaz:");
        km = input.nextDouble();

        double tutar = (kmbasina * km) + acilis;
        tutar = (tutar<20) ? 20:tutar;
        System.out.println("bunu ödeyeceksin: "+ tutar);

    }
}
