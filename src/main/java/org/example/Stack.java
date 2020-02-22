package org.example;

public class Stack {

    double[] table;
    int firstFree;

    public Stack(int MaxSize) {
        table = new double[MaxSize];
        firstFree = 0;
    }

    int getMaximumStackSize() { // Maksymalny rozmiar stosu;
        return table.length;
    }

    boolean isEmpty() {         // Zwraca "true" jeśli jest pusty;
        if (firstFree == 0) {
            return true;
        } else {
            return false;
        }
    }

    int getSize() {             // Zwraca rozmiar stosu;
        return firstFree;
    }

    void Push(double E) throws ArrayIndexOutOfBoundsException { // Dodaje na stos;
        if (firstFree < table.length) {
            table[firstFree] = E;
            firstFree++;
        } else  {
            throw new ArrayIndexOutOfBoundsException("Przepełnienie stosu, brak możliwości \"dodaj\".");
        }
    }
    double Pop() throws IndexOutOfBoundsException {             // Zdejmuje ze stosu;
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException("Stos jest pusty.");
        }
        double temp = table[firstFree-1];
        firstFree--;
        return temp;
    }
}
