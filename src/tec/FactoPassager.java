package tec;

abstract class FactoPassager implements Passager, Usager {
    private String nom;
    private int destination;
    private Position monEtat;

    protected FactoPassager(String nom, int destination) {
        this.nom = nom;
        this.destination = destination;
        monEtat = Position.creer();
    }

    public String nom() {
        return this.nom;
    }

    public boolean estDehors() {
        return monEtat.estDehors();
    }

    public boolean estAssis() {
        return monEtat.estAssis();
    }

    public boolean estDebout() {
        return monEtat.estDebout();
    }

    public void changerEnDehors() {
        monEtat = monEtat.dehors();
    }

    public void changerEnAssis() {
        monEtat = monEtat.assis();
    }

    public void changerEnDebout() {
        monEtat = monEtat.debout();
    }

    public String toString() {
        return this.nom() + " " + this.monEtat.toString();
    }

    protected final void debout(DemandeMontee b) {
        if (b.aPlaceDebout()) {
            b.monteeDemanderDebout(this);
        }
    }

    protected final void assis(DemandeMontee b) {
        if (b.aPlaceAssise()) {
            b.monteeDemanderAssis(this);
        }
    }

    protected final void assisDebout(DemandeMontee b) {
        if (b.aPlaceAssise()) {
            b.monteeDemanderAssis(this);
        } else {
            b.monteeDemanderDebout(this);
        }
    }

    protected final void deboutAssis(DemandeMontee b) {
        if (b.aPlaceDebout()) {
            b.monteeDemanderDebout(this);
        } else {
            b.monteeDemanderAssis(this);
        }
    }

    protected boolean sortir(DemandeArret t, int numeroArret) {
        if (this.destination == numeroArret) {
            t.arretDemanderSortie(this);
            return true;
        }
        return false;
    }

    public void nouvelArret(DemandeArret t, int numeroArret) {
        this.sortir(t, numeroArret);
        if (!this.sortir(t, numeroArret)) {
            choixNouvelArret(t, numeroArret - this.destination);
        }
    }

    abstract protected void choixNouvelArret(DemandeArret t, int distanceDestination);
}