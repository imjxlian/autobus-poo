package tec;
class MonteeTetu extends FactoPassager {
    public MonteeTetu(String nom, int destination, Arret arret) {
        super(nom, destination, arret);
    }
    public void monterDans(Transport p) {
        this.debout((DemandeMontee) p);
    }
}