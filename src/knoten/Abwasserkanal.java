package knoten;

import utils.Punkt;

public class Abwasserkanal extends Knoten{

    public Abwasserkanal(double x, double y, String ID){
        punkt = new Punkt(x, y);
        this.ID = ID;
    }


}
