package utils;

import knoten.Abwasserkanal;
import knoten.Haushalt;
import knoten.Kontrollschacht;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class Rohrsystem {

    ArrayList haushaelte = new ArrayList();
    ArrayList kontrollschaechte = new ArrayList();
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






}
