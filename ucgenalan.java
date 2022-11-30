package javapatika;
import  java.util.Scanner;
import java.lang.Math;
public class ucgenalan {
    public static void main(String[] args) {
        int a , b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("a kenarının uzunluğunu gir :");
        a = input.nextInt();
        System.out.println("b kenarının uzunluğunu gir");
        b = input.nextInt();
        System.out.println("c kenarının uzunluğunu gir: ");
        c = input.nextInt();
        double u = (a + b + c) / 2 , Alan = u * (u - a)* (u -b) * (u - c);
        System.out.println(Math.sqrt(Alan)+"  üçgenin alanı");




    }
}
