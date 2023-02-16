package abstraction;

public class Triunghi extends FormaGeometrica{

    private Float latura;
    private Float inaltimeLatura;

    public Triunghi(Float latura, Float inaltimeLatura){
        this.latura = latura;
        this.inaltimeLatura = inaltimeLatura;
    }

    @Override
    public void calculArie() {
        System.out.println("Arie triunghi = " + String.valueOf((this.latura*this.inaltimeLatura)/2));
    }
}
