package polymorphism;

public class Pisica extends Animal {

    public Pisica(){
        super();
    }

    @Override
    public void emiteSunet() {
        System.out.println("Pisica face miau");
    }
}
