package utils;

import knoten.Abwasserkanal;
import knoten.Haushalt;
import knoten.Knoten;
import knoten.Kontrollschacht;
import rohrleitungen.Rohrtyp;

import java.util.ArrayList;

public class Rohrsystem {

    boolean volumenstromberechnet = false;

    ArrayList<Haushalt> haushaelte = new ArrayList<>();
    ArrayList<Kontrollschacht> kontrollschaechte = new ArrayList<>();
    Abwasserkanal abw;

    public Rohrsystem(){

    }

    public void addKnoten(String knotenart, double x, double y, String ID, double wassermenge){

        switch (knotenart){
            case "haushalt": knoten.put(ID, new Haushalt(x, y, wassermenge, ID)); break;
            case "kontrollschacht": knoten.put(ID, new Kontrollschacht(x,y, ID)); break;
            case "abwasser": knoten.put(ID, new Abwasserkanal(x,y, ID)); break;
        }
    }

    public void berechneVolumenstrom(){
        for (Knoten k : knoten.values()){
            if(k instanceof Haushalt h){
                h.berechneVolumenstrom(0);
            }
        }
        volumenstromberechnet = true;
    }






}
