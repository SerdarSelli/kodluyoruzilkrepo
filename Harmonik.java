import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("sayı giriniz");
        double a= inp.nextDouble();
        double b=0;
        for (double i =1;i<=a;i++){
            b+=1/i;
            System.out.println(b);
        }
    }
}
