package primavera.domain;

import  java.util.Scanner;
import java.time.LocalDate;




public class Servisesmenu {
    private String name;
    private float price;
    float [] pr = new float[15];

    static float sum=0;
    static float discount=0;
    static float totalsum = 0;
    static LocalDate date = LocalDate.now();



    public static Servisesmenu(){
        String name;
        float price;
        float pr [];
        float sum=0;
         float discount=0;
        float totalsum = 0;
        LocalDate date = LocalDate.now();

        do {
            Scanner choose = new Scanner(System.in);
            int choose1 = choose.nextInt();
            switch (choose1){
            case 11: {
                name = "Washing and styling";
                price = 100;
                pr[0]=100;
                break;
            }
            case 12: {
                name = "Decorative weaving";
                price = 100;
                pr[1]=100;
                break;
            }
            case 13: {
                name = "Coloration";
                price = 150;
                pr[2]=150;
                break;
            }
            case 14: {
                name = "Haircut for children";
                price = 60;
                pr[3]=60;
                break;
            }
            case 15: {
                name = "Haircut for woman";
                price = 130;
                pr[4]=130;
                break;
            }
            case 16: {
                name = "Cut the bang";
                price = 30;
                pr[5]=30;
                break;
            }
            case 17: {
                name = "Haircut for man";
                price = 90;
                pr[6]=90;
                break;
            }
            case 18: {
                name = "Coloration gray";
                price = 150;
                pr[7]=150;
                break;
            }
            case 19: {
                name = "Ceratine";
                price = 350;
                pr[8]=350;
                break;
            }
            case 21: {
                name = "Classic nails art";
                price = 170;
                pr[9]=170;
                break;
            }
            case 22: {
                name = "Aparat nails";
                price = 240;
                pr[10]=240;
                break;
            }
            case 23: {
                name = "Europenian nails";
                price = 100;
                pr[11]=100;
                break;
            }
            case 31: {
                name = "Body massage";
                price = 240;
                pr[12]=240;
                break;
            }
            case 32: {
                name = "Honey massage";
                price = 270;
                pr[13]=270;
                break;
            }
            case 33: {
                name = "SPA massage";
                price = 300;
                pr[14]=300;
                break;
            }
            default: {
                System.out.println("Please enter the servis");
            }
            }
            while (choose1==35);        }
        for(int i=0; i <  pr.length; i++){
            sum +=pr;
        }
        if ((user.disc==true) ){
            discount=sum*0.95;
        }
        else { discount=0;}

        totalsum = sum-discount;

    }
}
