package org.example;

public class Baum {

    public Baum() {

    }
    public void Baum(){

        int anzahlSterne = 10;

        for (int i = 0; i < anzahlSterne; i++) {

            for (int j = 0; j < anzahlSterne-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
            
        }
    }
}
