package entities.esercizio3;
import exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ContoCorrente contoCorrente1 = new ContoCorrente("Me Medesima", 200.0);
        ContoOnline contoOnline1 = new ContoOnline("Te StessaOnline", 100.0, 50.0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Preleva da ContoCorrente somma: ");
                double scelta = scanner.nextDouble();
                contoCorrente1.preleva(scelta);
                System.out.println(contoCorrente1.restituisciSaldo());

                System.out.print("Preleva da ContoOnline somma: ");
                double sceltaOnline = scanner.nextDouble();
                contoOnline1.preleva(sceltaOnline);
                System.out.println(contoOnline1.restituisciSaldo());

            } catch (BancaException e) {
                logger.error("Errore: {}", e.getMessage());
            }

        }

    }
}
