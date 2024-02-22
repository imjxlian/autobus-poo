package tec;
//source without documentation for javadoc

import tec.Autobus;

public class PassagerStandard {

  private String nom;
  private int destination;
  private Position monEtat;

  // constructor
  public PassagerStandard(String nom, int destination) {
    this.nom = nom;
    this.destination = destination;
    monEtat = Position.creer();
  }

  // methods
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

  public void monterDans(Autobus t) {
    if (t.aPlaceAssise()) {
      t.monteeDemanderAssis(this);
    } else {
      t.monteeDemanderDebout(this);
    }
  }

  public void nouvelArret(Autobus t, int numeroArret) {
    if (this.destination == numeroArret) {
      t.arretDemanderSortie(this);
    }
  }

  public String toString() {
    return this.nom() + " " + this.monEtat.toString();
  }
}
