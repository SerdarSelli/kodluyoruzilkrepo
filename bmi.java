package javapatika;
import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
     int kilo;
     float boy;
     Scanner input = new Scanner(System.in);
        System.out.print("kilonuz nedir?");
     kilo = input.nextInt();
        System.out.print(" boyunuz nedir?");
        boy = input.nextFloat();
        double bmi = kilo/(boy * boy);
        System.out.println("bmi indexiniz budur => "+ bmi);
    }
}
