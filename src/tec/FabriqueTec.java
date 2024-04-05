package tec;
public class FabriqueTec {
    public static Usager fairePassagerStandard(String nom, int destination) {
        return new PassagerStandard(nom, destination);
    }

    public static Usager fairePassagerAnxieux(String nom, int destination) {
        return new PassagerAnxieux(nom, destination);
    }

    public static Usager fairePassagerStresse(String nom, int destination) {
        return new PassagerStresse(nom, destination);
    }
}