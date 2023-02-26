package rohrleitungen;

import utils.Punkt;


public class Rohrleitung {
    int laenge;
    Rohrtyp rohrtyp;
    double auslastung;



    public Rohrleitung(Punkt punkt1, Punkt punkt2, Rohrtyp typ, double durchfluss){
        calculateDistance(punkt1, punkt2);
        rohrtyp = typ;
        this.auslastung = durchfluss / rohrtyp.getMaxdurchfluss();
    }

    private void calculateDistance(Punkt p1, Punkt p2){
        laenge = (int) Math.round(Math.sqrt((p2.getX() - p1.getX())*(p2.getX() - p1.getX()) + (p2.getY() - p1.getY())*(p2.getY() - p1.getY())));
    }

    public String getAuslastungProzent() {
        return String.format("%.2f", auslastung * 100) + "%";
    }

    public Rohrtyp getRohrtyp() {
        return rohrtyp;
    }
}
