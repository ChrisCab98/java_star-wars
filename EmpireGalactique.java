
public class EmpireGalactique extends Belligerant {

    public EmpireGalactique() {
        campDeRalliement = "Empire Galactique sur l'Etoile Noire";
        flotte = new Vaisseau[4];

        for (int i = 0; i < 4; i++) {
            flotte[i] = new TFighter();
        }
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
        EmpireGalactique test = new EmpireGalactique();
        System.out.println(test);
    }

}