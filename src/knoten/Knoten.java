package knoten;

import rohrleitungen.Rohrleitung;
import rohrleitungen.Rohrtyp;
import utils.Punkt;

import java.util.List;

public abstract class Knoten {

    Punkt punkt;
    String ID;
    double wasserabflussmenge;
    Knoten nachfolger;
    Rohrleitung leitung;

    public abstract void berechneVolumenstrom(double volumen);

    public void setRohrleitung(List<Rohrtyp> rohre) {
        Rohrtyp typ = rohre.get(0);
        for (int i = 1; i < rohre.size(); i++) {
            if (typ.getMaxdurchfluss() >= wasserabflussmenge)
                break;

            typ = rohre.get(i);
        }
        // Jetzt ist Typ die passende Größe oder auf die Größte falls alle Leitungen zu klein sein sollten

        this.leitung = new Rohrleitung(punkt, nachfolger.punkt, typ, wasserabflussmenge);
    }

    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = nachfolger;
    }

    public Punkt getPunkt() {
        return punkt;
    }

    public String getID() {
        return ID;
    }

    public double getWasserabflussmenge() {
        return wasserabflussmenge;
    }

    public Rohrleitung getLeitung() {
        return leitung;
    }
}
