package entities.esercizio2;

import java.util.Scanner;
import exceptions.InputNumberException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Inserisci km: ");
            double km = scanner.nextDouble();
            System.out.print("Inserisci litri: ");
            double litri = scanner.nextDouble();

            if (litri == 0) {
                throw new InputNumberException("Inserisci numero litri valido!");
            } else {
                double risultato =  litri/km;
                System.out.println("Consumato " + risultato + " litri per km.");
            }
        } catch (InputNumberException e) {
            logger.error("ERRORE", e.getMessage());
        } finally {
            scanner.close();
        }
    }
    }
