package javapatika;
import java.util.Scanner;
public class sinifgecmedurumu {
    public static void main(String[] args) {
        int mat,tur,fiz,kim,muz;
        Scanner inp=new Scanner(System.in);

        System.out.print("matematik notunu gir: ");
        mat = inp.nextInt();
        mat = (mat < 0 || mat > 100) ? 0 : mat;

        System.out.print("tur notunu gir: ");
        tur = inp.nextInt();
        tur = (tur < 0 || tur > 100) ? 0 : tur;

        System.out.print("fiz notunu gir: ");
        fiz = inp.nextInt();
        fiz = (fiz < 0 || fiz > 100) ? 0 : fiz;

        System.out.print("kim notunu gir: ");
        kim = inp.nextInt();
        kim = (kim < 0 || kim > 100) ? 0 : kim;

        System.out.print("müzik notunu gir: ");
        muz = inp.nextInt();
        muz = (muz < 0 || muz > 100) ? 0 : muz;

        double ortalama=(mat + fiz+ tur+ kim+muz)/5;
        System.out.println("ortalamanız :"+ortalama);
           if (ortalama<55) {
            System.out.println("kaldınız");
        } else System.out.println("geçtiniz");
    }
}
