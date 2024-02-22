/**
 * Cette classe repr'esente la position d'un passager par rapport 'a un transport.
 * Une position a trois 'etats possibles : assis dans un transport, 
 * debout dans un transport et dehors d'un transport.
 *
 * Les instances de cette classe sont des objets constants.
 *
 * @author Georgy
 * @since 2007-2019
 **/
class Position {

  private final int DEHORS = 1;
  private final int ASSIS  = 2;
  private final int DEBOUT = 3;
  private static final Position INSTANCE_DEHORS = new Position(1);
  private static final Position INSTANCE_ASSIS  = new Position(2);
  private static final Position INSTANCE_DEBOUT = new Position(3);
  private final int COURANT;

  /**
   * initialise l'instance 'a dehors.
   * 
   */
  private Position() {
    COURANT = DEHORS;
  }

  /**
   * Initialise l'instance 'a une des trois positions.
   * 
   * @param e valeur d'une des positions.
   */
  private Position(int e) {
    COURANT = e;
  }

  public static Position creer() {
    return INSTANCE_DEHORS;
  }

  /**
   * La position est-elle dehors ?
   *
   * @return vrai si l''etat de l'instance est dehors;
   */
  public boolean estDehors() {
    return COURANT == DEHORS;
  }

  /**
   * La position est-elle assis ?
   *
   * @return vrai si l''etat de l'instance est assis;
   */
  public boolean estAssis() {
    return COURANT == ASSIS;
  }

  /**
   * La position est-elle debout ?
   *
   * @return vrai si l''etat de l'instance est debout;
   */
  public boolean estDebout() {
    return COURANT == DEBOUT;
  }

  /**
   * La position est-elle assis ou debout ?
   *
   * @return vrai la position est assis ou debout.
   */
  public boolean estInterieur() {
    return !estDehors();
  }


  /**
   * Fournit une instance de Position assis.
   *
   * @return instance dans l''etat assis.
   */
  public Position assis() {
    return INSTANCE_ASSIS;
  }

  /**
   * Fournit une instance de Position debout.
   *
   * @return instance dans l''etat debout.
   */
  public Position debout() {
    return INSTANCE_DEBOUT;
  }

  /**
   * Fournit une instance de Position dehors.
   *
   * @return instance dans l''etat dehors.
   */
  public Position dehors() {
    return INSTANCE_DEHORS;
  }

  /**
   * Cette m'ethode est h'erit'ee de la classe {@link java.lang.Object}.
   * Tr`es utile pour le d'ebogage, elle permet de fournir une 
   * cha^ine de caract`eres correspondant 'a l''etat d'un objet.
   * Mais, il faut adapter son code 'a chaque classe.
   */
  public String toString() {
    String nom = null;
    switch(COURANT) {
    case DEHORS :
      nom = "endehors";
      break;
    case ASSIS :
      nom = "assis";
      break;
    case DEBOUT :
      nom = "debout";
      break;
    }
    return "<" + nom + ">";
  }
}
