package topic8;

public class Carte {

    public Carte(String titlu, String autor, Integer numarDeSerie, Integer pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.numarDeSerie = numarDeSerie;
        this.pagini = pagini;
    }

    private String titlu;
    private String autor;
    private Integer numarDeSerie;
    private Integer pagini;

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumarDeSerie() {
        return numarDeSerie;
    }

    public void setNumarDeSerie(Integer numarDeSerie) {
        this.numarDeSerie = numarDeSerie;
    }

    public Integer getPagini() {
        return pagini;
    }

    public void setPagini(Integer pagini) {
        this.pagini = pagini;
    }

    public String toString() {
        return "\"Titlu: " + titlu + ", Autor: " + autor + ", Numar de serie: " + numarDeSerie + ", pagini: " + pagini + "\"";
    }
}
