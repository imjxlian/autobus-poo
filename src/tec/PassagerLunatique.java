package tec;

class PassagerLunatique extends PassagerStandard {

    public PassagerLunatique(String nom, int destination) {
        super(nom, destination);
    }

    @Override
    public void nouvelArret(DemandeArret bus, int numeroArret) {
        super.nouvelArret(bus, numeroArret);

        if (!this.estDehors()) {
            if (this.estAssis()) {
                this.changerEnDebout();
                bus.arretDemanderDebout(this);
            } else if (this.estDebout()) {
                this.changerEnAssis();
                bus.arretDemanderAssis(this);
            }
        }
    }
}