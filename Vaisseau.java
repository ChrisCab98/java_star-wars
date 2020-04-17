import java.awt.Point;
import java.lang.Math;

public abstract class Vaisseau {

    protected String modele;
    protected Point positionDeStationnement;
    protected int attaque;
    protected int defense;
    protected boolean status;

    public Vaisseau() {

        Point monPoint = new Point((int) (Math.random()*10), (int) (Math.random()*10));

        modele = "undefined";
        positionDeStationnement = monPoint;
        attaque = 1;
        defense = 1;
        status = true;
    }

    public Vaisseau(String pModele, Point pPositionDeStationnement, int pAttaque, int pDefense, boolean pStatus) {
        modele = pModele;
        positionDeStationnement = pPositionDeStationnement;
        attaque = pAttaque;
        defense = pDefense;
        status = pStatus;
    }

    public boolean estOperationnel() {
        return status;
    }

    public String toString() {
        return ("Modele : " + modele + " / Position : " + positionDeStationnement.x + "," + positionDeStationnement.y
                + " / Ataque : " + attaque + " / Defense : " + defense + " / Status " + status);
    }

}