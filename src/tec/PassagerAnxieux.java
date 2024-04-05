package tec;

import tec.Autobus;

class PassagerAnxieux implements Passager, Usager {

  private String nom;
  private int destination;
  private Position monEtat;

  // constructor
  public PassagerAnxieux(String nom, int destination) {
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

  public void monterDans(Transport p) {
    DemandeMontee t = (DemandeMontee) p;
    if (t.aPlaceDebout()) {
      t.monteeDemanderDebout(this);
    }
  }

  public void nouvelArret(DemandeArret t, int numeroArret) {
    if (this.destination - 1 == numeroArret) {
      t.arretDemanderSortie(this);
    }
  }

  public String toString() {
    return this.nom() + " " + this.monEtat.toString();
  }
}
