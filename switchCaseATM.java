import java.util.Scanner;

public class switchCaseATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password, userName;
        int kalanDeneme = 3;
        int girdi;
        int balance=30;
        int cekilenPara;
        int moduloo=0;
        boolean shouldBreake = false;
        do {
                System.out.print("kullanıcı adı giriniz : ");
                userName = scan.nextLine();
                System.out.print("şifre giriniz : ");
                password = scan.nextLine();
                switch (userName){
                    case "çat":
                        switch (password){
                            case "pat":
                                System.out.println("sisteme girişiniz başarılı! Kodluyoruz " +
                                        "bankasına hoş gelmişsiniz!");
                                do {
                                    System.out.println("yapmak istediğiniz işlemi seçiniz\n"+"1. para yatır hesaba\n"+
                                            "2. hesaptan para çek\n"+
                                            "3. güncel bakiyeyi göster\n"+"4. çıkış yapasan \n");
                                    girdi = scan.nextInt();
                                    switch (girdi){
                                        case 1:
                                            System.out.print("hesaba ne kadar para yatıracaksınız? ");
                                            balance+= scan.nextInt();
                                            System.out.println("yeni bakiye : "+balance);
                                            break;
                                        case 2:
                                            System.out.println("nekadar para çekmek istersiniz?");
                                            cekilenPara = scan.nextInt();
                                            moduloo=balance-cekilenPara;
                                            if (moduloo<0){
                                                System.out.println("yetersiz bakiye!");
                                            }else {balance-=cekilenPara;}

                                            break;
                                        case 3:
                                            System.out.println("güncel baiyeniz : "+balance);
                                            break;
                                        case 4:
                                            System.out.println("bizi seçtiğiniz için teşekkür ederiz");
                                            shouldBreake=true;
                                            break;
                                    }
                                }while (girdi!=4);

                                break;
                        }
                        break;
                    default:
                        System.out.println("kullanıcı adı veya şifreniz yanlışdır lo! kalan deneme hakınız "+ --kalanDeneme);
                }
            if (shouldBreake) break;
switch (kalanDeneme){
    case 0:
        System.out.println("hesabınız bloke olmuştur! Bank of america ile iletişime geçiniz!");
        break;
}


        }while (kalanDeneme>0);

    }
}
