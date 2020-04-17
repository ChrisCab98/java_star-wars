
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
        return ("Camp : " + campDeRalliement + "\nflotte " + flotte.length + "\nVesseau Op : " + flotte);
    }
}