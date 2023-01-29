package anwendung;

import utils.Rohrsystem;

public class Testbeispiel {



    public static void main(String[] args) {
        /*
        1, 2, 3, 4, 5, 6 Haushalt
        7, 8, 9, 10 Kontrollschacht
        11 Abwasserkanal
         */

        Rohrsystem rohrsystem = new Rohrsystem();
        //3 2 3

        rohrsystem.addKnoten("haushalt", 90.0, 70.0, "1", 323.1);
        rohrsystem.addKnoten("haushalt", 50.0, 80.0, "2", 350.7);
        rohrsystem.addKnoten("haushalt", 50.0, 100.0, "3", 264.8);
        rohrsystem.addKnoten("haushalt", 53.0, 140.0, "4", 123.2);
        rohrsystem.addKnoten("haushalt", 120.0, 190.0, "5", 64.5);
        rohrsystem.addKnoten("haushalt", 160.0, 232.0, "6", 97.6);


        rohrsystem.addKnoten("kontrollschacht", 120.0, 105.0, "7", null);
        rohrsystem.addKnoten("kontrollschacht", 105.0, 180.0, "8", null);
        rohrsystem.addKnoten("kontrollschacht", 200.0, 180.0, "9", null);
        rohrsystem.addKnoten("kontrollschacht", 215.0, 200.0, "10", null);


        rohrsystem.addKnoten("abwasser", 250.0, 180.0, "11", null);




    }



}
