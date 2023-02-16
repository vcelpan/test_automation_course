package inheritance;

public class Masina extends Vehicul{

    private String marca;

    public Masina(String marca, String culoare, Integer nrRoti){
        super();
        this.marca = marca;
        super.setCuloare(culoare);
        super.setNrRoti(nrRoti);
    }

    public void afiseazaDetaliiVehicul(){
        System.out.println("marca: " + this.marca);
        System.out.println("culoare: " + super.getCuloare());
        System.out.println("nrRoti: " + super.getNrRoti());
    }

}
