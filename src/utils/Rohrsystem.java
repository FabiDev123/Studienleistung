package utils;

import knoten.Abwasserkanal;
import knoten.Haushalt;
import knoten.Knoten;
import knoten.Kontrollschacht;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class Rohrsystem {

    boolean volumenstromberechnet = false;

    ArrayList<Haushalt> haushaelte = new ArrayList<>();
    ArrayList<Kontrollschacht> kontrollschaechte = new ArrayList<>();
    Abwasserkanal abw;

    public Rohrsystem(){

    }

    public void addKnoten(String knotenart, double x, double y, String ID, @Nullable Double wassermenge){
        switch (knotenart){
            case "haushalt": haushaelte.add(new Haushalt(x, y, wassermenge, ID));
            case "kontrollschacht": kontrollschaechte.add(new Kontrollschacht(x,y, ID));
            case "abwasser": abw = new Abwasserkanal(x,y, ID);
        }
    }

    public void berechneVolumenstrom(){
        for(Haushalt h : haushaelte){
            h.berechneVolumenstrom();
        }
    }






}
