package tec;
import tec.Position;
class DeboguePosition {
    public static void main(String[] args) {
        DeboguePosition deboguePosition = new DeboguePosition();
        deboguePosition.testDehorsInitial();
        deboguePosition.testDehorsPuisAssis();
        deboguePosition.testDehorsPuisDebout();
        deboguePosition.testDehorsPuisAssisPuisDehors();
    }

    void testDehorsInitial() {
        System.out.println("Dans l'état dehors");
        Position position = Position.creer();
        boolean estAssis = position.estAssis();
        boolean estDebout = position.estDebout();
        boolean estDehors = position.estDehors();
        boolean estInterieur = position.estInterieur();
        System.out.println("estAssis() : " + estAssis);
        System.out.println("estDebout() : " + estDebout);
        System.out.println("estDehors() : " + estDehors);
        System.out.println("estInterieur() : " + estInterieur);

        if (estDehors && (!estAssis && !estDebout && !estInterieur)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    void testDehorsPuisAssis() {
        System.out.println("Dans l'état dehors puis assis");
        Position position = Position.creer();
        position = position.assis();
        boolean estAssis = position.estAssis();
        boolean estDebout = position.estDebout();
        boolean estDehors = position.estDehors();
        boolean estInterieur = position.estInterieur();
        System.out.println("estAssis() : " + estAssis);
        System.out.println("estDebout() : " + estDebout);
        System.out.println("estDehors() : " + estDehors);
        System.out.println("estInterieur() : " + estInterieur);

        if (estAssis && estInterieur && (!estDehors && !estDebout)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
            System.out.println(position.toString());
            // Incohérent, estInterieur devrait être vrai
        }
    }

    void testDehorsPuisDebout() {
        System.out.println("Dans l'état dehors puis debout");
        Position position = Position.creer();
        position = position.debout();
        boolean estAssis = position.estAssis();
        boolean estDebout = position.estDebout();
        boolean estDehors = position.estDehors();
        boolean estInterieur = position.estInterieur();
        System.out.println("estAssis() : " + estAssis);
        System.out.println("estDebout() : " + estDebout);
        System.out.println("estDehors() : " + estDehors);
        System.out.println("estInterieur() : " + estInterieur);

        if (estDebout && estInterieur && (!estDehors && !estAssis)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
            System.out.println(position.toString());
            // Incohérent l'état est <endehors> or il devrait être <debout>
        }
    }

    void testDehorsPuisAssisPuisDehors() {
        System.out.println("Dans l'état dehors puis assis puis dehors");
        Position position = Position.creer();
        position.assis();
        position.dehors();
        boolean estAssis = position.estAssis();
        boolean estDebout = position.estDebout();
        boolean estDehors = position.estDehors();
        boolean estInterieur = position.estInterieur();
        System.out.println("estAssis() : " + estAssis);
        System.out.println("estDebout() : " + estDebout);
        System.out.println("estDehors() : " + estDehors);
        System.out.println("estInterieur() : " + estInterieur);

        if (estDehors && (!estInterieur && !estAssis && !estDebout)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }
}
