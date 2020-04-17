
public abstract class Belligerant {

    protected String campDeRalliement;
    protected Vaisseau[] flotte;

    public Belligerant() {
        campDeRalliement = "Undefined";
        flotte = new Vaisseau[4];
    }

    public String campDeRalliement() {
        return campDeRalliement;
    }

    public int etatFlotte() {

        int n = 0;

        for (int i = 0; i < flotte.length; i++) {
            if (flotte[i].status == true) {
                n++;
            }
        }
        return n;
    }

    public String toString() {

        String str = "";
        str += "Détail du belligéran : ";
        str += campDeRalliement;
        str += " ";
        str += etatFlotte();
        str += "Vaisseau opérationnels\n";

        for (int i = 0; i < flotte.length; i++) {
            str += "\tVaisseau {modele : ";
            str += flotte[i].modele;
            str += " Force : ";
            str += flotte[i].attaque;
            str += " defense : ";
            str += flotte[i].defense;
            str += " positon : ";
            str += flotte[i].positionDeStationnement;
            str += "}\n";

        }

        return (str);
    }
}