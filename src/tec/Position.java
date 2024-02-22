package tec;
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
  private static final Position INSTANCE_DEHORS = new Position();
  private static final Position INSTANCE_ASSIS  = new Position();
  private static final Position INSTANCE_DEBOUT = new Position();

  private Position() {  }

  public static Position creer() {
    return INSTANCE_DEHORS;
  }

  /**
   * La position est-elle dehors ?
   *
   * @return vrai si l''etat de l'instance est dehors;
   */
  public boolean estDehors() {
    return INSTANCE_DEHORS == this;
  }

  /**
   * La position est-elle assis ?
   *
   * @return vrai si l''etat de l'instance est assis;
   */
  public boolean estAssis() {
    return INSTANCE_ASSIS == this;
  }

  /**
   * La position est-elle debout ?
   *
   * @return vrai si l''etat de l'instance est debout;
   */
  public boolean estDebout() {
    return INSTANCE_DEBOUT == this;
  }

  /**
   * La position est-elle assis ou debout ?
   *
   * @return vrai la position est assis ou debout.
   */
  public boolean estInterieur() {
    return this != INSTANCE_DEBOUT;
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
    if (this == INSTANCE_DEHORS)
      nom = "endehors";
    else if (this == INSTANCE_ASSIS)
      nom = "assis";
    else
      nom = "debout";
    return "<" + nom + ">";
  }
}
