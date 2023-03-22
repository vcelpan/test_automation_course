package topic8;

import java.util.ArrayList;
import java.util.List;

public class Stoc {

    public Stoc(int stocId, String adresaMagazin) {
        this.stocId = stocId;
        this.adresaMagazin = adresaMagazin;
    }

    private int stocId;
    private String adresaMagazin;
    List<Carte> cartileDinStoc = new ArrayList<>();

    public int getStocId() {
        return stocId;
    }

    public void setStocId(int stocId) {
        this.stocId = stocId;
    }

    public String getAdresaMagazin() {
        return adresaMagazin;
    }

    public void setAdresaMagazin(String adresaMagazin) {
        this.adresaMagazin = adresaMagazin;
    }

    public void listaDeCartiInStoc(){
        System.out.println("Lista de carti in stoc:");
        for (Carte carte : cartileDinStoc) {
            System.out.println(carte.toString());
        }
    }

    public void adaugaCarteInStoc(Carte carte){
        System.out.println("Adaugare in stoc: " + carte.toString());
        cartileDinStoc.add(carte);
    }

    public void stergeCarteDinStoc(Carte carte){
        System.out.println("Stergere din stoc: " + carte.toString());
        cartileDinStoc.remove(carte);
    }

    public boolean existaCarteInStoc(Carte carte){
        return cartileDinStoc.contains(carte);
    }

    public int nrDeCartiInStoc(){
        return cartileDinStoc.size();
    }

    public boolean esteStoculGol(){
        return cartileDinStoc.isEmpty();
    }
}
