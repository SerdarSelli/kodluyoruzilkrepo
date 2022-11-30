package javapatika;

import java.util.Scanner;



public class javapatika {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int fizik, kimya, mat, turkce, tarih, muzik;

        System.out.print("fizk notunu gir");
        fizik = input.nextInt();
        System.out.println("fizk notun:"+ fizik);

        System.out.print("kimya notunu gir: ");
        kimya = input.nextInt();
        System.out.println("kimya notun: "+ kimya);

        System.out.print("mat notunu gir: ");
        mat = input.nextInt();
        System.out.println("mat notun: " + mat);

        System.out.print("türkçe notunu gir: ");
        turkce = input.nextInt();
        System.out.println("turkçe notun: "+ turkce);

        System.out.print("muzik notunu gir: ");
        muzik = input.nextInt();
        System.out.println("turkçe notun: "+ muzik);

        System.out.print("tarih notunu gir: ");
        tarih = input.nextInt();
        System.out.println("tarih notun: "+ tarih);

        double ortalama = (turkce+tarih+mat+muzik+fizik+kimya)/6;
        System.out.print("ortalaman: "+ortalama);

        String sonuc = (ortalama >= 55) ? "geçti" : "kaldı";
                //b = (a == 1) ? 1 : 0
        System.out.println(" " + sonuc );
    }
}