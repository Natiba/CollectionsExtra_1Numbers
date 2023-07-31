package collectiosextra1_numeros;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectiosExtra1_numeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int ints;
        int counter = 0;
        int sum = 0;
        double average = 0;

        ArrayList<Integer> numbersList = new ArrayList<>();

        do {

            System.out.println("Ingrese numeros enteros, por favor");
            ints = sc.nextInt();

            numbersList.add(ints);

            counter += 1;

        } while (ints != (-99));

        if (ints == -99) {
            numbersList.remove(numbersList.size() - 1);
        }

        System.out.println("Los números ingresados son " + numbersList);
        System.out.println("La cantidad de valores ingresados fue " + counter);

        for (Integer integer : numbersList) {
            sum += integer;
            average = sum / (counter - 1);
        }
        System.out.println("La suma de los números ingresados da: " + sum);
        System.out.println("El promedio de los números ingresados da: " + average + "\n");
    }

}

//Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList 
//de tipo Integer. La lectura de números termina cuando se introduzca el valor -99. Este valor no se guarda en 
//el ArrayList. A continuación, el programa mostrará por pantalla el número de valores que se han leído, su suma 
//y su media (promedio).
