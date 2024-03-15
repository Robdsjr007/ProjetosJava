import java.util.Date;

public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        Date time = new Date();
        System.out.println("São exatamente: " + time.getHours() + ":" + time.getMinutes());
    }
}
