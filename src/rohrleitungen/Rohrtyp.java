package rohrleitungen;

public class Rohrtyp {

    int innendurchmesser;
    String bezeichnung;
    double maxdurchfluss;

    public Rohrtyp(int innendurchmesser, double maxdurchfluss){
        this.innendurchmesser = innendurchmesser;
        bezeichnung = "DN" + innendurchmesser;
        this.maxdurchfluss = maxdurchfluss;
    }

    public double getMaxdurchfluss() {
        return maxdurchfluss;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
