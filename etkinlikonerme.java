import java.util.Scanner;

public class etkinlikonerme {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sicaklik;
        System.out.print("sıcaklık kaç derece?");
        sicaklik = inp.nextInt();

        if (sicaklik < 5) {
            System.out.println("kayak yapabilirsin");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("sinemaya gidebilirsin");
            if (sicaklik >= 10 && sicaklik <= 15) {
                System.out.println("pikniğede gidebilirsin");
            }

        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("pikniğe gidebilirsin");
            if (sicaklik >= 10 && sicaklik <= 15) {
                System.out.println("sinemayada gidebilirsin");
            }
        } else System.out.println("yüzmeye gidebilirsin");

    }

}

