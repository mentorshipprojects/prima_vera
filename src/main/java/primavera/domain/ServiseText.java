package primavera.domain;

public class ServiseText {

    public static String printServiseText(){
        String serviseText= new String();

        serviseText+="Please enter the service \n \n \n";
        serviseText+="Hairdressing saloon \n";
        serviseText+="__________________________ \n";
        serviseText+="11 Washing and styling \n";
        serviseText+="12 Decorative weaving \n";
        serviseText+="13 Coloration \n";
        serviseText+="14 Haircut for children \n";
        serviseText+="15 Haircut for woman \n";
        serviseText+="16 Cut the bang \n";
        serviseText+="17 Haircut for man \n";
        serviseText+="18 Coloration gray \n";
        serviseText+="19 Ceratine \n \n \n";

        serviseText+="Nails saloon \n";
        serviseText+="__________________________ \n";
        serviseText+="21 Classic nails art \n";
        serviseText+="22 Aparat nails \n";
        serviseText+="23 Europenian nails \n \n \n";


        serviseText+="Massage \n";
        serviseText+="__________________________ \n";
        serviseText+="31 Body massage \n";
        serviseText+="32 honey massage \n";
        serviseText+="33 SPA massage \n \n \n";

        serviseText+="__________________________  \n";
        serviseText+="35 Print check \n";
        serviseText+="__________________________ ";
        System.out.println(serviseText);
        return serviseText;
    }
}
