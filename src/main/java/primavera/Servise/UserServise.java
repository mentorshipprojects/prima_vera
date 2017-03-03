package primavera.Servise;
import java.util.Arrays;
import  java.util.Scanner;

public class UserServise {

    private boolean hasDiscount;

    public boolean getHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public boolean isUserHasDiscound(UserServise user) {
        Scanner nameuser = new Scanner(System.in);
        String[] lists = new String[]{"Vita", "Oksana", "Oleg", "Stepan", "Olga", "Marta"};
        Arrays.sort(lists);
        user.setUserName(nameuser.nextLine());
        for (String list : lists) {
            if (list.equals(userName)) {
                user.setHasDiscount(true);
            }
        }
        return user.getHasDiscount();


    }
}
