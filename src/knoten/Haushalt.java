package knoten;

import utils.Punkt;

public class Haushalt extends Knoten{

    public Haushalt(double x, double y, double wasserabflussmenge, String ID){
        punkt = new Punkt(x, y);
        this.ID = ID;
        this.wasserabflussmenge = wasserabflussmenge;
    }




}
