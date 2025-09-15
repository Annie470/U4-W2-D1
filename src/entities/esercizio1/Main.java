package entities.esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import exceptions.InputNumberException;
import exceptions.InputTypeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        int array[] = new int[5];
        Random rndm = new Random();
        for(int i =0;  i < array.length; i++){
            array[i] = rndm.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Inserisci un numero o 0 per terminare: ");
                int scelta;
                try {
                    scelta = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    throw new InputTypeException("Solo numeri, non caratteri");
                }
            if (scelta != 0){
                System.out.print("Inserisci 1-5 per posizionare il numero: ");
                int posizione = Integer.parseInt(scanner.nextLine());
                if (posizione < 0 || posizione > array.length) {
                    throw new InputNumberException("Posizione errata!");
                } else {
                    array[posizione-1] = scelta;
                    System.out.println(Arrays.toString(array));
                }
            } else {
                scanner.close();
                break;
            }
            } catch (InputNumberException ex) {
                logger.error("Errore! Insereisci un numero corretto!", ex.getMessage());
            } catch (InputTypeException ex) {
            logger.error("Errore! DIGITA SOLO NUMERI", ex.getMessage());
            }
        } while (true);

        System.out.println("L'array definitivo è : " + Arrays.toString(array));
    }

}
