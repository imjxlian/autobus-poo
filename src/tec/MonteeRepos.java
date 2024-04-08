package tec;
class MonteeRepos extends FactoPassager {
    public MonteeRepos(String nom, int destination, Arret arret) {
        super(nom, destination, arret);
    }

    public void monterDans(Transport p) {
        this.assisDebout((DemandeMontee) p);
    }
}