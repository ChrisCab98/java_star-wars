public class TestBelligerant {

    public static void tester(Belligerant b) {
        System.out.println(" - Belligerant - ");
        System.out.println("Camp de ralliement : " + b.campDeRalliement());
        System.out.println("Vaisseaux opérationnels : " + b.etatFlotte());
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(" -=- TEST BELLIGERANT -=- ");
        EmpireGalactique empire = new EmpireGalactique();
        AllianceRebelle alliance = new AllianceRebelle();
        tester(empire);
        System.out.println("");
        tester(alliance);
    }
}