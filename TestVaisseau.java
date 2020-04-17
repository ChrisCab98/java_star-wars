import java.awt.Point;

public class TestVaisseau {

    private Vaisseau[] vaisseaux;

    public TestVaisseau() {
        vaisseaux = new Vaisseau[6];
        vaisseaux[0] = new XWing();
        vaisseaux[1] = new TFighter();
        vaisseaux[2] = new MilleniumFalcon();
        vaisseaux[3] = new XWing(new Point(1, 2));
        vaisseaux[4] = new TFighter(new Point(3, 4));
        vaisseaux[5] = new MilleniumFalcon(new Point(5, 6));
    }

    public void testVaisseaux() {
        for (int i = 0; i < vaisseaux.length; i++) {
            Vaisseau vaisseau = vaisseaux[i];
            System.out.print(vaisseau);/* System.out.print(vaisseau.toString()) */
            System.out.println(" operationnel : " + vaisseau.estOperationnel());
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        System.out.println(" -=- TEST VAISSEAU -=-");
        System.out.println("");
        TestVaisseau test = new TestVaisseau();
        test.testVaisseaux();
    }

}