package inheritance;

public class Vehicul {

    private String culoare;
    private Integer nrRoti;

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }
    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void afiseazaDetaliiVehicul(){
        System.out.println("culoare: " + culoare);
        System.out.println("nrRoti: " + nrRoti);
    }
}
