package tec;
class ArretNerveux implements Arret {
    public void choixNouvelArret(FactoPassager p, DemandeArret t, int distanceDestination) {
        if (p.estAssis()) {
            t.arretDemanderDebout(p);
        } else {
            t.arretDemanderAssis(p);
        }
    }
}