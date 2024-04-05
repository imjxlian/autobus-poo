package tec;
import java.util.ArrayList;
public class Autobus implements DemandeArret, DemandeMontee, Transport {

  private int numeroArret;
  private ArrayList<Passager> passagers;
  private ArrayList<Passager> passagersAllantDehors;
  private Jauge assis;
  private Jauge debout;

  // constructor
  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    this.passagers = new ArrayList<>(nbPlaceAssise + nbPlaceDebout);
    this.passagersAllantDehors = new ArrayList<>(nbPlaceAssise + nbPlaceDebout);
    this.assis = new Jauge(nbPlaceAssise, 0);
    this.debout = new Jauge(nbPlaceDebout, 0);
  }

  //methods
  public boolean aPlaceAssise() {
    return assis.estVert();
  }

  public boolean aPlaceDebout() {
    return debout.estVert();
  }

  public void monteeDemanderAssis(Passager p) {
    passagers.add(p);
    assis.incrementer();
    p.changerEnAssis();
  }

  public void monteeDemanderDebout(Passager p) {
    passagers.add(p);
    debout.incrementer();
    p.changerEnDebout();
  }

  public void allerArretSuivant() {
    this.numeroArret++;
    // Parcours des passagers stockés dans l'autobus
    for (Passager passager : passagers) {
      passager.nouvelArret(this, this.numeroArret);
    }
    passagers.removeAll(passagersAllantDehors);
    passagersAllantDehors.clear();
  }

  public void arretDemanderAssis(Passager p) {
    debout.decrementer();
    assis.incrementer();
    p.changerEnAssis();
  }

  public void arretDemanderDebout(Passager p) {
    assis.decrementer();
    debout.incrementer();
    p.changerEnDebout();
  }

  public void arretDemanderSortie(Passager p) {
    if (p.estAssis())
      assis.decrementer();
    else if (p.estDebout())
      debout.decrementer();

    passagersAllantDehors.add(p);
    p.changerEnDehors();
  }

  public String toString() {
    return "[arret:" + this.numeroArret + ", assis:" + assis.toString() + ", debout:" + debout.toString() + "]";
  }
}
