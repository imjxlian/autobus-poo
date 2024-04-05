package tec;

import tec.Autobus;

class PassagerStresse extends PassagerStandard {

  private int destination;
  public PassagerStresse(String nom, int destination) {
    super(nom, destination);
    this.destination = destination;
  }

  @Override
  public void monterDans(Transport p) {
    DemandeMontee t = (DemandeMontee) p;
    if (t.aPlaceAssise()) {
      t.monteeDemanderAssis(this);
    }
  }

  @Override
  public void nouvelArret(DemandeArret t, int numeroArret) {
    if (this.destination - 3 == numeroArret) {
      t.arretDemanderDebout(this);
    }
    if (this.destination == numeroArret) {
      t.arretDemanderSortie(this);
    }
  }
}
