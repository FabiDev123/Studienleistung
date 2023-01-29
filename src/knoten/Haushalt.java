package knoten;

import rohrleitungen.Rohrtyp;
import utils.Punkt;

import java.util.List;

public class Haushalt extends Knoten{

    public Haushalt(double x, double y, double wasserabflussmenge, String ID){
        punkt = new Punkt(x, y);
        this.ID = ID;
        this.wasserabflussmenge = wasserabflussmenge;
    }

    @Override
    public void berechneVolumenstrom(double volumen) {
        nachfolger.berechneVolumenstrom(this.wasserabflussmenge);
    }

    @Override
    public void setRohrleitung(List<Rohrtyp> rohre) {

    }
}
