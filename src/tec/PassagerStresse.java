package tec;

import tec.Autobus;

class PassagerStresse extends FactoPassager {

  public PassagerStresse(String nom, int destination) {
    super(nom, destination);
  }

  public void monterDans(Transport p) {
    this.assis((DemandeMontee) p);
  }

  public void choixNouvelArret(DemandeArret t, int distanceDestination) {
    if (distanceDestination == 3) {
      t.arretDemanderDebout(this);
    }
  }
}
