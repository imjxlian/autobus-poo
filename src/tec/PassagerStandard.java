package tec;

import tec.Autobus;

class PassagerStandard extends FactoPassager {

  public PassagerStandard(String nom, int destination) {
    super(nom, destination);
  }

  public void monterDans(Transport p) {
    this.assisDebout((DemandeMontee) p);
  }

  public void choixNouvelArret(DemandeArret t, int distanceDestination) {
    return;
  }
}
