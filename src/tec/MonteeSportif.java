package tec;
class MonteeSportif extends FactoPassager {
    public MonteeSportif(String nom, int destination, Arret arret) {
        super(nom, destination, arret);
    }
    public void monterDans(Transport p) {
        this.debout((DemandeMontee) p);
    }
}