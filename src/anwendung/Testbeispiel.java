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

        rohrsystem.addKnoten("kontrollschacht", 120.0, 105.0, "7", 0);
        rohrsystem.addKnoten("kontrollschacht", 105.0, 180.0, "8", 0);
        rohrsystem.addKnoten("kontrollschacht", 200.0, 180.0, "9", 0);
        rohrsystem.addKnoten("kontrollschacht", 215.0, 200.0, "10", 0);

        rohrsystem.addKnoten("abwasser", 250.0, 180.0, "11", 0);

        rohrsystem.verbinde("1", "9");
        rohrsystem.verbinde("2", "7");
        rohrsystem.verbinde("3", "7");
        rohrsystem.verbinde("4", "8");
        rohrsystem.verbinde("5", "10");
        rohrsystem.verbinde("6", "10");
        rohrsystem.verbinde("7", "9");
        rohrsystem.verbinde("8", "9");
        rohrsystem.verbinde("9", "11");
        rohrsystem.verbinde("10", "11");

        rohrsystem.berechneVolumenstrom();

        rohrsystem.addKreisprofil(300, 98.69);
        rohrsystem.addKreisprofil(400, 210.2);
        rohrsystem.addKreisprofil(500, 378.28);
        rohrsystem.addKreisprofil(700, 920.15);
        rohrsystem.addKreisprofil(1000, 2355.0);
        rohrsystem.addKreisprofil(1200, 3800.0);

        rohrsystem.generiereRohrleitungen();


        rohrsystem.print();



    }



}
