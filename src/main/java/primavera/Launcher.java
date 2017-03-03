package primavera;


import primavera.domain.*;
import primavera.Servise.*;

public class Launcher {

    public static void main(String[] args){
        MainMenuText mainMenuText = new MainMenuText();
        mainMenuText.printWelcomeText();
        UserServise userServise= new UserServise();
        userServise.isUserHasDiscound(userServise);
        ServiseText serviseText= new ServiseText();
        serviseText.printServiseText();
        ServiseMenu serviseMenu =new ServiseMenu();
        serviseMenu.countTotalCheck();

    }

}

