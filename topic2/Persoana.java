package topic2;

public class Persoana {

    public String prenume;
    public String nume;
    protected Byte virsta;
    private Character gen;
    private Float greutate;

    public Character getGen() {
        return gen;
    }

    public void setGen(Character gen) {
        this.gen = gen;
    }

    public Float getGreutate() {
        return greutate;
    }

    public void setGreutate(Float greutate) {
        this.greutate = greutate;
    }

    public void infoPersoana(){
        System.out.println("Nume intreg: " + this.nume + " " + this.prenume);
        System.out.println("Virta: " + this.virsta);
        System.out.println("Gen: " + this.gen);
        System.out.println("Greutate: " + this.greutate);
    }
}
