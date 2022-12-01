package javapatika;

import java.util.Scanner;

public class sifre {
    public static void main(String[] args) {
        String kadi, sifre, sifirla;
        Scanner inp = new Scanner(System.in);
        System.out.print("kullanıcı adını gir");
        kadi = inp.nextLine();
        System.out.print("şifreni gir gir");
        sifre = inp.nextLine();

        if (kadi.equals("a") && sifre.equals("1")) {
            System.out.println("sisteme girdin");
        } else {
            System.out.print("kullanıcı adın veya şifre yanlış sıfırlamak ister misin?");
            sifirla = inp.nextLine();
            if (sifirla.equals("evet")) {
                System.out.println("şifreni gir");
                sifre = inp.nextLine();
                if (sifre.equals("1")) {
                    System.out.println("şifre oluşturulamadı lütfen başka şifre giriniz");
                }
                System.out.println("şifre oluşturuldu");
            } else System.out.println("sisteme giremedin ve şifre oluşturmakta istemedin");
        }


    }
}
