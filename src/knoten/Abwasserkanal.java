package knoten;

import rohrleitungen.Rohrtyp;
import utils.Punkt;

import java.util.List;

public class Abwasserkanal extends Knoten{

    public Abwasserkanal(double x, double y, String ID){
        punkt = new Punkt(x, y);
        this.ID = ID;
        this.nachfolger = null;
    }

    @Override
    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = null;
    }

    @Override
    public void berechneVolumenstrom(double volumen) {
        this.wasserabflussmenge +=volumen;
    }

    @Override
    public void setRohrleitung(List<Rohrtyp> rohre) {
        return;
    }
}
