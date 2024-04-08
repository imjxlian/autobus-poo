package tec;
class ArretPrudent implements Arret {
    public void choixNouvelArret(FactoPassager p, DemandeArret t, int distanceDestination) {
        if (distanceDestination == 3) {
            t.arretDemanderDebout(p);
        }
    }
}