import java.util.Scanner;

public class ucakBiletiHesaplama {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("kaç yaşındasınız?");
        int age = inp.nextInt();
        System.out.println("tek yön bilet için 1 gidiş dönüş bilet için 2 giriniz");
        int type = inp.nextInt();
        System.out.println("yolculuk kaç KM");
        double km = inp.nextDouble();
        double kmbasina = 0.10, discount = 0, typrDiscount = 0;

        if ((km > 0 && age > 0) && (type >= 1 && type <= 2)) {
            if (age < 12) {
                discount = 0.50;
            } else if (age >= 12 && age <= 24) {
                discount = 0.10;
            } else if (age > 65) {
                discount = 0.3;
            } else {
                discount = 0;
            }
            //gidiş dönüş için indirim hakediyor mu?
            if (type == 1) {
                typrDiscount = 0;
            } else {
                typrDiscount = 0.2;
            }

            // değişkenler belirlendikten sonra hesabın yapılması
            double normal = km * kmbasina;
            double agediscount = normal * discount;
            double discountedPrice = normal - agediscount;
            double typeIndirimi = discountedPrice * typrDiscount;
            double total = (discountedPrice - typeIndirimi) * type;
            System.out.println("toplam ücret" + total + "TL");
        } else {
            System.out.print("hatalı veri girdiniz");
        }


    }
}
