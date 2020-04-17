
public class EmpireGalactique extends Belligerant {

    public EmpireGalactique() {
        campDeRalliement = "Empire Galactique sur l'Etoile Noire";
        flotte = new Vaisseau[4];

        for (int i = 0; i < 4; i++) {
            flotte[i] = new TFighter();
        }
    }

    public static void main(String argument[]) {
        EmpireGalactique test = new EmpireGalactique();
        System.out.println(test);
    }

}