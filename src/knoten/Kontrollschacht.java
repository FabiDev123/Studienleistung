package knoten;

import utils.Punkt;

import java.util.ArrayList;

public class Kontrollschacht extends Knoten{

    ;

    public Kontrollschacht(double x, double y, String ID){
        punkt = new Punkt(x, y);
        this.ID = ID;
    }


    @Override
    public void berechneVolumenstrom() {

    }
}
