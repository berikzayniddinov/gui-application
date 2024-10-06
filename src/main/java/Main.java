public class Main {
    public static void main(String[] args) {
        System.out.println("Creating......");
    ThemeFactory lightFactory = new LightThemeFactory();
    Button lightButton = lightFactory.createButton();;
    Checkbox lightCheckbox = lightFactory.createCheckbox();
    lightButton.paint();
    lightCheckbox.paint();



    ThemeFactory darkFactory = new DarkThemeFactory();
    Button darkButton = darkFactory.createButton();
    Checkbox darkCheckbox = darkFactory.createCheckbox();
    darkButton.paint();
    darkCheckbox.paint();
    }
}
