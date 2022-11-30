package javapatika;
import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut= 2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5;
        int ak, ek, dk, mk,pk;
        Scanner input = new Scanner(System.in);
        System.out.print(" armut kaç kilo? :");
        ak = input.nextInt();
        System.out.print(" elma kaç kilo? :");
        ek = input.nextInt();
        System.out.print(" domateskaç kilo? :");
        dk = input.nextInt();
        System.out.print(" muz kaç kilo? :");
        mk = input.nextInt();
        System.out.print(" patlıcan kaç kilo? :");
        pk = input.nextInt();

        double tutar= (armut*ak)+(elma*ek)+(domates*dk)+(muz*mk)+(patlıcan*mk);
        System.out.println("toplam tutar :"+tutar);
    }
}
