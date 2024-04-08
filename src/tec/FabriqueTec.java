package tec;
public class FabriqueTec {
    public static Usager fairePassagerStandard(String nom, int destination) {
        Arret a = new ArretCalme();
        return new PassagerStandard(nom, destination, a);
    }

    public static Usager fairePassagerAnxieux(String nom, int destination) {
        Arret a = new ArretSportif();
        return new PassagerAnxieux(nom, destination, a);
    }

    public static Usager fairePassagerStresse(String nom, int destination) {
        Arret a = new ArretPrudent();
        return new PassagerStresse(nom, destination, a);
    }
}