import java.util.Scanner;

public class dortvebesinkatlari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("sayı gir");
        a= scan.nextInt();
        int sayac5=0, sayac4=0;

        for(int i=1;i<=a;){
            i*=4;
            sayac4++;
            System.out.println("4 ün " +sayac4+ ". kuvveti= "+i);
        }

        for(int j=1;j<=a;){
            j*=5;
            sayac5++;
            System.out.println("5 in "+ sayac5 + ". kuvveti= "+j);
        }
    }
}
