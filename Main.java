import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        Account account1 = new Account(190909, 100.5, 4809);
        System.out.println("Please enter your ID and PIN.");
        int EnterID = in.nextInt();
        int EnterPin = in.nextInt();
        if (EnterID == account1.ID && EnterPin == account1.PIN) {
            System.out.println("Success! Now choose operation");
            System.out.println("0 - exit");
            System.out.println("1 - info");
            System.out.println("2 - money operation");
        } else {
            System.out.println("OOPS! Something wrong, please try again");
        }
        while (true) {
            int InputSymbol = in.nextInt();
            if (InputSymbol == 1) {
                account1.getInfo();
            }
            if (InputSymbol == 2) {
                boolean chosen;
                String choose = in.next();
                if (choose == "+") {
                    chosen = true;
                } else {
                    chosen = false;
                }
                double sum = in.nextDouble();
                account1.balanceOperation(chosen, sum);
            }
            if (InputSymbol == 0) {
                break;
            }
        }
        System.out.println("Bye!");
    }
}