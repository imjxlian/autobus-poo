package tec;

import tec.Autobus;

class PassagerAnxieux extends FactoPassager {

  public PassagerAnxieux(String nom, int destination) {
    super(nom, destination);
  }

  public void monterDans(Transport p) {
    this.debout((DemandeMontee) p);
  }

  public void choixNouvelArret(DemandeArret t, int distanceDestination) {
    if (distanceDestination == 1) {
      t.arretDemanderSortie(this);
    }
  }
}
