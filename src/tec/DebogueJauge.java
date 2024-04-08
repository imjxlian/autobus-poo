package tec;
class DebogueJauge {
    public static void main(String[] args) {
        DebogueJauge debogueJauge = new DebogueJauge();
        debogueJauge.testDansIntervalle();
        debogueJauge.testAuDessusIntervalle();
        debogueJauge.testAuDessusIntervalleDecremente();
        debogueJauge.testDansIntervalleIncremente();
    }

    public void testDansIntervalle() {
        System.out.println("Valeur de départ dans l'intervalle");
        Jauge jauge = new Jauge(5, 1);
        boolean estVert = jauge.estVert();
        boolean estRouge = jauge.estRouge();
        System.out.println("estVert() : " + estVert);
        System.out.println("estRouge() : " + estRouge);
        if (estVert && !estRouge) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    public void testAuDessusIntervalle() {
        System.out.println("Valeur de départ au dessus de l'intervalle");
        Jauge jauge = new Jauge(5, 6);
        boolean estVert = jauge.estVert();
        boolean estRouge = jauge.estRouge();
        System.out.println("estVert() : " + estVert);
        System.out.println("estRouge() : " + estRouge);
        if (!estVert && estRouge) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
        // Incohérent car la jauge ne devrait pas être verte
    }

    public void testAuDessusIntervalleDecremente() {
        System.out.println("Valeur de départ au dessus de l'intervalle puis décrémenté");
        Jauge jauge = new Jauge(5, 6);
        jauge.decrementer();
        System.out.println(jauge.toString());
        boolean estVert = jauge.estVert();
        boolean estRouge = jauge.estRouge();
        System.out.println("estVert() : " + estVert);
        System.out.println("estRouge() : " + estRouge);
        if (!estVert && estRouge) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
        // Incohérent car la jauge ne devrait pas être rouge
    }

    public void testDansIntervalleIncremente() {
        System.out.println("Valeur de départ dans l'intervalle puis incrémenté");
        Jauge jauge = new Jauge(5, 5);
        jauge.incrementer();
        System.out.println(jauge.toString());
        boolean estVert = jauge.estVert();
        boolean estRouge = jauge.estRouge();
        System.out.println("estVert() : " + estVert);
        System.out.println("estRouge() : " + estRouge);
        if (!estVert && estRouge) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
        // Incohérent car la jauge devrait être rouge et pas verte
    }
}