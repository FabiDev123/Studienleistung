package knoten;

import utils.Punkt;

public class Kontrollschacht extends Knoten{


    public Kontrollschacht(double x, double y, String ID){
        punkt = new Punkt(x, y);
        this.ID = ID;
    }


    @Override
    public void berechneVolumenstrom(double volumen) {

        if(volumen == 0){
            nachfolger.berechneVolumenstrom(this.wasserabflussmenge);
            return;
        }

        this.wasserabflussmenge += volumen;

    }
}
