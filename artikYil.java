import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl giriniz :");
        int yil = inp.nextInt();
        int a = yil;

        if ((yil%=4)==0){
            System.out.println(a+" artık yildır");
        } else if ((yil%=100)==0 && (yil%=400)==0  ) {
            System.out.println(a+" artık yildır");
        } else {
            System.out.println(a+" artık yıl değil");
        }

    }
}
