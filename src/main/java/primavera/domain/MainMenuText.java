package primavera.domain;


public class  MainMenuText {

    public static String printWelcomeText(){
        String welcomeText = new String();
        welcomeText+= "Welcome \n";
        welcomeText+= "Please enter your name: \n";
        System.out.print(welcomeText);
        return welcomeText;
    }
}
