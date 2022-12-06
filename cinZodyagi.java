import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] cinZodyagi = {"Maymun","Horoz","köpek","domuz","fare","öküz","kaplan","tavşan","ejderha","yılan","at","koyun"};
        System.out.println("doğum yılını gir");
        int yil= inp.nextInt();
        yil %=12;
        System.out.println(yil);
        System.out.println("çin zodyağı burcunuz :"+cinZodyagi[yil]);
    }
}
