
package Entity;

public class Numbers {
    
    private int number;

    public Numbers() {
    }

    public Numbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Numbers { \n" + "number: " + number + "\n}";
    }
    
    
    
}

//Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList 
//de tipo Integer. La lectura de números termina cuando se introduzca el valor -99. Este valor no se guarda en 
//el ArrayList. A continuación, el programa mostrará por pantalla el número de valores que se han leído, su suma 
//y su media (promedio).