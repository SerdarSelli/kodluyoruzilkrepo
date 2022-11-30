package javapatika;
import java.util.Scanner;

public class daireAlan {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double pi=3.14, a, r;
        System.out.print("daire diliminin açısını giriniz : ");
     a = input.nextDouble();
        System.out.print("dairenin yarı çapını giriniz :");
     r = input.nextDouble();

     double alan = ( pi * ( r * r ) * a ) / 360 ;
        System.out.println("daire diliminin alanı : "+ alan+ " br^2");

    }
}
