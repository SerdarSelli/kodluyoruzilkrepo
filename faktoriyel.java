import java.util.Scanner;
import java.math.BigInteger;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner faktori = new Scanner(System.in);
        System.out.println("faktoriyelin n küme sayısını gir");
        long n = faktori.nextInt();
        System.out.println("faktoriyelin r kombinasyon sayısını gir");
        long r = faktori.nextInt();
        long a=1,b=1,c=1;
    for(int i = 1; i <= n;i++){
        System.out.println(i);
        a=i*a;
    }
    for (int j = 1;j<=r;j++){
        b*=j;
    }
    for(int l =1;l<=(n-r);l++){
        c*=l;
    }
    long fekterivel =  a/(c*b);
        System.out.println("faktöriyel= "+fekterivel);
    }
    /* !!!!!  19 karakterden fazla olan sayıları hesaplayamıyor çünkü long un belleği yetersiz geliyor !!!!!!!*/

}
