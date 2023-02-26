package topic2;

public class Main {

    public static void main(String[] args) {
        Persoana viorel = new Persoana();
        viorel.prenume = "Viorel";
        viorel.nume = "Celpan";
        viorel.virsta = 29;
        viorel.setGen('M');
        viorel.setGreutate(75.4f);

        System.out.println("Nume intreg: " + viorel.nume + " " + viorel.prenume);
        System.out.println("Virta: " + viorel.virsta);
        System.out.println("Gen: " + viorel.getGen());
        System.out.println("Greutate: " + viorel.getGreutate() + "kg");
    }
}
