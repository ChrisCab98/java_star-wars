import java.lang.Math;
import java.awt.Point;

public class TFighter extends Vaisseau {

    public TFighter() {

        Point monPoint = new Point((int) (Math.random() * 10), (int) (Math.random() * 10));

        modele = "T-Fighter";
        attaque = 2;
        defense = 4;
        positionDeStationnement = monPoint;
        status = true;
    }

    public TFighter(Point pPositionDeStationnement) {
        modele = "T-Fighter";
        attaque = 2;
        defense = 4;
        positionDeStationnement = pPositionDeStationnement;
        status = true;
    }

    public String toString() {
        return ("Modele : " + modele + "\nPosition : " + positionDeStationnement.x + "," + positionDeStationnement.y
                + "\nAtaque : " + attaque + "\nDefense : " + defense + "\nStatus" + status);
    }

}