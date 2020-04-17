import java.awt.Point;
import java.lang.Math;

public class XWing extends Vaisseau {

    public XWing() {

        Point monPoint = new Point((int) (Math.random() * 10), (int) (Math.random() * 10));
        modele = "X-Wing";
        attaque = 4;
        defense = 2;
        positionDeStationnement = monPoint;
        status = true;
    }

    public XWing(Point pPositionDeStationnement) {
        modele = "X-Wing";
        attaque = 4;
        defense = 2;
        positionDeStationnement = pPositionDeStationnement;
        status = true;
    }

    public String toString() {
        return ("Modele : " + modele + "\nPosition : " + positionDeStationnement.x + "," + positionDeStationnement.y
                + "\nAtaque : " + attaque + "\nDefense : " + defense + "\nStatus" + status);
    }

    public static void main(String arguments[]) {
        System.out.println("Test XWing");
        XWing monVaisseau = new XWing();
        System.out.println(monVaisseau);
    }

}