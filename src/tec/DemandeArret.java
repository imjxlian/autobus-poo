package tec;
interface DemandeArret {
    public void arretDemanderAssis(Passager p);

    public void arretDemanderDebout(Passager p);

    public void arretDemanderSortie(Passager p);

    public boolean aPlaceAssise();

    public boolean aPlaceDebout();
}