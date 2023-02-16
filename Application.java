import polymorphism.Animal;
import polymorphism.Caine;
import polymorphism.Pisica;

public class Application {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emiteSunet();

        Caine caine = new Caine();
        caine.emiteSunet();

        Pisica pisica = new Pisica();
        pisica.emiteSunet();

    }
}


