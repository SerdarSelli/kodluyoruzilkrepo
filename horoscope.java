import java.util.Scanner;

public class horoscope {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month, day;
        boolean acday = true, acmonth = true;
        String horoscopee = " ";

        System.out.println("hangi ayda doğdun? ");
        month = inp.nextInt();
        System.out.println("hangi gün doğdun? ");
        day = inp.nextInt();

        if (month >= 1 && month <= 12) {
            if (day >= 1 && day <= 31) {
                if (month == 1) {
                    if (day >= 22) {
                        horoscopee = "kova";
                    } else {
                        horoscopee = "oğlak";
                    }
                }
                if (month == 2) {
                    if (day >= 20) {
                        horoscopee = "balık";
                    } else {
                        horoscopee = "kova";
                    }
                }
                if (month == 3) {
                    if (day >= 21) {
                        horoscopee = "koç";
                    } else {
                        horoscopee = "balık";
                    }
                }
                if (month == 4) {
                    if (day >= 21) {
                        horoscopee = "boğa";
                    } else {
                        horoscopee = "koç";
                    }
                }
                if (month == 5) {
                    if (day >= 22) {
                        horoscopee = "ikizler";
                    } else {
                        horoscopee = "boğa";
                    }
                }
                if (month == 6) {
                    if (day >= 23) {
                        horoscopee = "yengeç";
                    } else {
                        horoscopee = "ikizler";
                    }
                }
                if (month == 7) {
                    if (day >= 23) {
                        horoscopee = "aslan";
                    } else {
                        horoscopee = "yengeç";
                    }
                }
                if (month == 8) {
                    if (day >= 23) {
                        horoscopee = "başak";
                    } else {
                        horoscopee = "aslan";
                    }
                }
                if (month == 9) {
                    if (day >= 23) {
                        horoscopee = "terazi";
                    } else {
                        horoscopee = "başak";
                    }
                }
                if (month == 10) {
                    if (day >= 23) {
                        horoscopee = "akrep";
                    } else {
                        horoscopee = "terazi";
                    }
                }
                if (month == 11) {
                    if (day >= 22) {
                        horoscopee = "yay";
                    } else {
                        horoscopee = "akrep";
                    }
                }
                if (month == 12) {
                    if (day >= 22) {
                        horoscopee = "oğlak";
                    } else {
                        horoscopee = "yay";
                    }
                }
            } else {
                acday = false;
            }
        } else {
            acmonth = false;
        }

        if (acday == true && acmonth == true) {
            System.out.println("your horoscope is " + horoscopee);
        } else if (!acmonth) {
            System.out.println("yanlış ay girdiniz");
        } else {
            System.out.println("yanlış gün girdiniz");
        }

    }
}
