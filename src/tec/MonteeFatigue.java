package tec;
class MonteeFatigue extends FactoPassager {
    public MonteeFatigue(String nom, int destination, Arret arret) {
        super(nom, destination, arret);
    }

    public void monterDans(Transport p) {
        this.assis((DemandeMontee) p);
    }
}