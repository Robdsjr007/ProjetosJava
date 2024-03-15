import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale currentLocale = Locale.getDefault();
        String idioma = currentLocale.getDisplayLanguage(currentLocale);
        System.out.println("O idioma da sua máquina é " + idioma);
    }
}
