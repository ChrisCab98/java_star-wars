
public class AllianceRebelle extends Belligerant {

    public AllianceRebelle() {
        campDeRalliement = "Empire Galactique sur l'Etoile Noire";
        flotte = new Vaisseau[4];

        for (int i = 0; i < 3; i++) {
            flotte[i] = new XWing();
        }

        flotte[3] = new MilleniumFalcon();
    }

    public String toString() {

        String str = "";
        str += "Empire Galacic\n";
        str += "Description de la flotte\n";
        for (int i = 0; i < flotte.length; i++) {
            str += "\n\nVaisseau n°" + i;
            str += "\n";
            str += flotte[i];
        }

        return (str);
    }

    public static void main(String argument[]) {
        AllianceRebelle test = new AllianceRebelle();
        System.out.println(test);
    }

}