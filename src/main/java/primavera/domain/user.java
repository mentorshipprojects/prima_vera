package primavera.domain;
import java.util.Arrays;
import  java.util.Scanner;

public  class user {

    static boolean  disc;
    static String us;

     public static boolean user() {
         Scanner nameuser=new Scanner(System.in);
        String[] lists = new String[]{"Vita", "Oksana", "Oleg", "Stepan", "Olga", "Marta"};
        Arrays.sort(lists);
        us= nameuser.nextLine();
        for(String list: lists){
            if(list.equals(us)){
               disc = true;

            }
        }

    }
}
