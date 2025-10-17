public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = "Windows"; // could be detected dynamically

        if (os.equalsIgnoreCase("Windows"))
            factory = new WindowsFactory();
        else
            factory = new MacFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}
