package primavera;


import java.time.LocalDate;
import java.util.*;

public class PrimaVera {

    public static void main(String[] args) {
        double sum = 0;
        double dic;
        LocalDate d = LocalDate.now();

        Scanner a = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Please enter the service");
        System.out.println("Hairdressing saloon");
        System.out.println("11 Washing and styling");
        System.out.println("12 Decorative weaving");
        System.out.println("13 Coloration");
        System.out.println("14 Haircut for children");
        System.out.println("15 Haircut for woman");
        System.out.println("16 Cut the bang");
        System.out.println("17 Haircut for man");
        System.out.println("18 Coloration gray");
        System.out.println("19 Ceratine");

        System.out.println("Nails saloon");
        System.out.println("21 Classic nails art");
        System.out.println("22 Aparat nails ");
        System.out.println("23 Europenian nails");

        System.out.println("Massage");
        System.out.println("31 Body massage");
        System.out.println("32 honey massage ");
        System.out.println("33 SPA massage");

        System.out.println("35 Print check");


         int i = a.nextInt();
        switch (i) {

            case 11:
                sum += 100;
                break;
            case 12:
                sum += 100;
                break;
            case 13:
                sum += 150;
                break;
            case 14:
                sum += 60;
                break;
            case 15:
                sum += 130;
                break;
            case 16:
                sum += 30;
                break;
            case 17:
                sum += 90;
                break;
            case 18:
                sum += 150;
                break;
            case 19:
                sum += 350;
                break;
            case 21:
                sum += 170;
                break;
            case 22:
                sum += 240;
                break;
            case 23:
                sum += 100;
                break;
            case 31:
                sum += 240;
                break;
            case 32:
                sum += 270;
                break;
            case 33:
                sum += 300;
                break;
            case 35:
                System.out.println("Do you have discount?");
                System.out.println("Please enter 1 if you have dicount");
                System.out.println("Please enter 2 if you don't have dicount");
                int s = a.nextInt();
                System.out.println("Check");
                System.out.println(d);
                switch (s) {
                    case 1:
                        dic = sum * 0.1;
                        System.out.println("Your discount = " + dic);
                        sum = sum * 0.9;
                        System.out.println("Your sum = " + sum);
                        break;
                    case 2:
                        System.out.println("Your sum = " + sum);
                        break;
                    default:
                        System.out.println("Please enter 1 or 2");
                        break;

                }
            default:
                System.out.println("Please enter the service");
                break;

        }
    }
}














