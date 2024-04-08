package tec;
class ArretSportif implements Arret {
    public void choixNouvelArret(FactoPassager p, DemandeArret t, int distanceDestination) {
        if (distanceDestination == 1) {
            t.arretDemanderSortie(p);
        }
    }
}