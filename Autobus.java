//source without documentation for javadoc

import java.util.ArrayList;
class Autobus {

  private int numeroArret;
  private ArrayList<PassagerStandard> passagers;
  private Jauge assis;
  private Jauge debout;

  // constructor
  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    this.passagers = new ArrayList<>(nbPlaceAssise + nbPlaceDebout);
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

  public void monteeDemanderAssis(PassagerStandard p) {
    passagers.add(p);
    assis.incrementer();
    p.changerEnAssis();
  }

  public void monteeDemanderDebout(PassagerStandard p) {
    passagers.add(p);
    debout.incrementer();
    p.changerEnDebout();
  }

  public void allerArretSuivant() {
    this.numeroArret++;
    // Parcours des passagers stockés dans l'autobus
    ArrayList<PassagerStandard> passagersCopie = new ArrayList<PassagerStandard>(passagers);
    for (PassagerStandard passager : passagersCopie) {
      passager.nouvelArret(this, this.numeroArret);
    }
  }

  public void arretDemanderAssis(PassagerStandard p) {
    debout.decrementer();
    assis.incrementer();
    p.changerEnAssis();
  }

  public void arretDemanderDebout(PassagerStandard p) {
    assis.decrementer();
    debout.incrementer();
    p.changerEnDebout();
  }

  public void arretDemanderSortie(PassagerStandard p) {
    if (p.estAssis())
      assis.decrementer();
    else if (p.estDebout())
      debout.decrementer();

    passagers.remove(p);
    p.changerEnDehors();
  }

  public String toString() {
    return "[arret:" + this.numeroArret + ", assis:" + assis.toString() + ", debout:" + debout.toString() + "]";
  }
}
