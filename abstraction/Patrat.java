package abstraction;

public class Patrat extends FormaGeometrica{

    private Float latura;

    public Patrat(Float latura){
        this.latura = latura;
    }

    @Override
    public void calculArie() {
        System.out.println("Arie patrat = " + String.valueOf(Math.pow(this.latura, 2)));
    }
}
