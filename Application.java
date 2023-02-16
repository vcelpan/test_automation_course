import abstraction.Patrat;
import abstraction.Triunghi;

public class Application {

    public static void main(String[] args) {
        Patrat patrat = new Patrat(4f);
        Triunghi triunghi = new Triunghi(4f, 3f);

        patrat.calculArie();
        triunghi.calculArie();

    }
}


