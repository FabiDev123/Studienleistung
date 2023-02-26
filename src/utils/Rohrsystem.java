package utils;

import knoten.Abwasserkanal;
import knoten.Haushalt;
import knoten.Knoten;
import knoten.Kontrollschacht;
import rohrleitungen.Rohrtyp;

import java.util.*;

public class Rohrsystem {

    boolean volumenstromberechnet = false;

    Map<String, Knoten> knoten = new HashMap<>();

    List<Rohrtyp> kreisprofile = new ArrayList<>();

    public Rohrsystem(){

    }

    public void addKnoten(String knotenart, double x, double y, String ID, double wassermenge){

        switch (knotenart){
            case "haushalt": knoten.put(ID, new Haushalt(x, y, wassermenge, ID)); break;
            case "kontrollschacht": knoten.put(ID, new Kontrollschacht(x,y, ID)); break;
            case "abwasser": knoten.put(ID, new Abwasserkanal(x,y, ID)); break;
        }
    }

    public void verbinde(String id1, String id2) {
        Knoten start = knoten.get(id1);
        Knoten ende = knoten.get(id2);
        start.setNachfolger(ende);
    }

    public void addKreisprofil(int durchmesser, double durchfluss){
        kreisprofile.add(new Rohrtyp(durchmesser, durchfluss));
    }


    public void berechneVolumenstrom(){
        for (Knoten k : knoten.values()){
            if(k instanceof Haushalt h){
                h.berechneVolumenstrom(0);
            }else if (k instanceof Kontrollschacht ko){
                ko.berechneVolumenstrom(0);
            }
        }
        volumenstromberechnet = true;
    }

    public void generiereRohrleitungen() {
        kreisprofile.sort(Comparator.comparingDouble(Rohrtyp::getMaxdurchfluss));
        for (Knoten k : knoten.values()) {
            k.setRohrleitung(kreisprofile);
        }

    }

    public void print() {
        for (Knoten k : knoten.values()) {
            System.out.println(k.getID() + ": " + k.getPunkt() + "; Menge: " + k.getWasserabflussmenge());
            if(!(k instanceof Abwasserkanal)) {
                System.out.println("Typ: " + k.getLeitung().getRohrtyp().getBezeichnung()+ " Auslastung: " + k.getLeitung().getAuslastungProzent());
            }
        }
    }




}
