package primavera.domain;

import  primavera.Servise.UserServise;
import  java.util.Scanner;
import java.time.LocalDate;




public class ServiseMenu {



    public static void countTotalCheck(){
        UserServise userServise = new UserServise();
        userServise.getHasDiscount();

        float [] priceHairServises = new float[9];
        String [] nameHairServises = new String[9];
        float [] priceNailsServises = new float[3];
        String [] nameNailsServises = new String[3];
        float [] priceMassageServises = new float[3];
        String [] nameMassageServises = new String[3];
        float sumHairServises=0;
        float sumNailsServises=0;
        float sumMassageServises=0;
        float sum=0;
        float discount=0;
        float totalsum = 0;

        Scanner choose = new Scanner(System.in);
        int choose1=0;
        do {

            choose1 = choose.nextInt();
            switch (choose1)
            {
                case 11: {
                    nameHairServises[0] = "Washing and styling - 100";
                    priceHairServises[0] = 100;
                    break;
                }
                case 12: {
                    nameHairServises[1] = "Decorative weaving - 100";
                    priceHairServises[1] = 100;
                    break;
                }
                case 13: {
                    nameHairServises[2] = "Coloration - 150";
                    priceHairServises[2] = 150;
                    break;
                }
                case 14: {
                    nameHairServises[3] = "Haircut for children - 60";
                    priceHairServises[3] = 60;
                    break;
                }
                case 15: {
                    nameHairServises[4] = "Haircut for woman - 130";
                    priceHairServises[4] = 130;
                    break;
                }
                case 16: {
                    nameHairServises[5] = "Cut the bang - 30";
                    priceHairServises[5] = 30;
                    break;
                }
                case 17: {
                    nameHairServises[6] = "Haircut for man - 90";
                    priceHairServises[6] = 90;
                    break;
                }
                case 18: {
                    nameHairServises[7] = "Coloration gray - 150";
                    priceHairServises[7] = 150;
                    break;
                }
                case 19: {
                    nameHairServises[8] = "Ceratine - 350";
                    priceHairServises[8] = 350;
                    break;
                }
                case 21: {
                    nameNailsServises[0] = "Classic nails art - 170";
                    priceNailsServises[0] = 170;
                    break;
                }
                case 22: {
                    nameNailsServises[1] = "Aparat nails - 240";
                    priceNailsServises[1] = 240;
                    break;
                }
                case 23: {
                    nameNailsServises[2] = "Europenian nails - 100";
                    priceNailsServises[2] = 100;
                    break;
                }
                case 31: {
                    nameMassageServises[0] = "Body massage - 240";
                    priceMassageServises[0] = 240;
                    break;
                }
                case 32: {
                    nameMassageServises[1] = "Honey massage - 270";
                    priceMassageServises[1] = 270;
                    break;
                }
                case 33: {
                    nameMassageServises[2] = "SPA massage - 300";
                    priceMassageServises[2] = 300;
                    break;
                }
                default: {
                    System.out.println("Please enter the servis");
                }
            }
        }
        while (choose1 ==35);
        String checkText=new String();
        checkText+="Yours order: \n";
        checkText+="__________________________ \n";

        checkText+="Hairdressing saloon \n";
        checkText+="__________________________ \n";
        for (int i=0; i < nameHairServises.length; i++){
            checkText+=nameHairServises[i] + "\n";
        }

        for(int i=0; i <  priceHairServises.length; i++){
            sumHairServises = sumHairServises + priceHairServises[i];
        }
        checkText+="Sum " +sumHairServises  +"\n";
        checkText+="__________________________ \n";

        checkText+="Nails saloon \n";
        checkText+="__________________________ \n";
        for (int i=0; i < nameNailsServises.length; i++){
            checkText+=nameNailsServises[i] + "\n";
        }

        for(int i=0; i <  priceNailsServises.length; i++){
            sumNailsServises=sumNailsServises + priceNailsServises[i];
        }
        checkText+="Sum " +sumNailsServises  +"\n";
        checkText+="__________________________ \n";

        checkText+="Massage saloon \n";
        checkText+="__________________________ \n";
        for (int i=0; i < nameMassageServises.length; i++){
            checkText+=nameMassageServises[i] + "\n";
        }

        for(int i=0; i <  priceMassageServises.length; i++) {
            sumMassageServises = sumMassageServises + priceMassageServises[i];
        }
        checkText+="Sum " +sumMassageServises  +"\n";
        checkText+="__________________________ \n";

        sum=sumHairServises+sumNailsServises+sumMassageServises;


        if ((userServise.getHasDiscount()==true) ){
            sum=sumHairServises+sumNailsServises+sumMassageServises;
            checkText+= "Sum all order:" + sum + "\n";
            discount=sum*0.95f;
            checkText+="Your discount: " +  discount + "\n" ;
        }
        else { discount=0;}

        totalsum = sum-discount;
        checkText+="Total sum: "+ totalsum+"\n";
        System.out.println(checkText);

    }

}
