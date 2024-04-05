class Aiguillage {
    private int nbAiguillage;
    Aiguillage(int max) {
        nbAiguillage = max - 1;
    }

    void executer(Operation operation) {
        if (estHorsLimite()) {
            System.out.println("limite depassee");
            return;
        }

        operation.effectuer();
        nbAiguillage--;
    }

    boolean estHorsLimite() {
        return nbAiguillage < 0;
    }
}

class A implements Operation {
    public void jeter() {
        System.out.print("<Hop Hop>");
    }

    public void rattrapper() {
        System.out.println("<Poh Poh>");
    }

    @Override
    public void effectuer() {
        jeter();
        rattrapper();
    }
}


class B implements Operation {
    public void lancer() {
        System.out.println("shazammm");
    }

    @Override
    public void effectuer() {
        lancer();
    }
}

interface Operation {
    void effectuer();
}

class RetI implements Operation {
    public void caster() {
        System.out.println("Conversion de type");
    }
    @Override
    public void effectuer() {
        caster();
    }
}

class TestAiguillage {
    static public void main(String[] args) {
        Aiguillage g = new Aiguillage(10);
        Operation operation;

        operation = new B();
        g.executer(operation);

        operation = new A();
        g.executer(operation);

        operation = new B();
        g.executer(operation);

        operation = new A();
        g.executer(operation);

        operation = new RetI();
        g.executer(operation);
    }
}
