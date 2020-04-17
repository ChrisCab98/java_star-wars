import java.lang.Math;
import java.awt.Point;

public class MilleniumFalcon extends Vaisseau {

    public MilleniumFalcon() {

        Point monPoint = new Point((int) (Math.random()*10), (int) (Math.random()*10));

        modele = "Millenium Falcon";
        attaque = 8;
        defense = 10;
        positionDeStationnement = monPoint;
        status = true;
    }

    public MilleniumFalcon(Point pPositionDeStationnement) {
        modele = "Millenium Falcon";
        attaque = 8;
        defense = 10;
        positionDeStationnement = pPositionDeStationnement;
        status = true;
    }

    public String toString() {
        return ("Modele : " + modele + "\nPosition : " + positionDeStationnement.x + "," + positionDeStationnement.y
                + "\nAtaque : " + attaque + "\nDefense : " + defense + "\nStatus" + status);
    }

}