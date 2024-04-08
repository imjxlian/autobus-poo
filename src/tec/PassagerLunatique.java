package tec;

class PassagerLunatique extends FactoPassager {

    public PassagerLunatique(String nom, int destination) {
        super(nom, destination);
    }

    public void monterDans(Transport p) {
        this.assisDebout((DemandeMontee) p);
    }

    public void choixNouvelArret(DemandeArret t, int distanceDestination) {
        if (this.estAssis()) {
            t.arretDemanderDebout(this);
        } else if (this.estDebout()) {
            t.arretDemanderAssis(this);
        }
    }
}