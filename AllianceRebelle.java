
public class AllianceRebelle extends Belligerant {

    public AllianceRebelle() {
        campDeRalliement = "Alliance Rebelle sur Endor";
        flotte = new Vaisseau[4];

        for (int i = 0; i < 3; i++) {
            flotte[i] = new XWing();
        }

        flotte[3] = new MilleniumFalcon();
    }

    public static void main(String argument[]) {
        AllianceRebelle test = new AllianceRebelle();
        System.out.println(test);
    }

}