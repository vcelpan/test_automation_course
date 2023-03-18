package topic6;

public class ContulPersoanei {
    private String numePersoana;
    private Long id;
    private Double sumaCurenta;

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public void extragereDeBani(double sumaDeExtras) throws IllegalArgumentException, NullPointerException{
        System.out.println("\n========== Extragere de bani ==========");

        try {
            System.out.println("Client: " + this.getNumePersoana());
            System.out.println("Soldul curent: " + this.getSumaCurenta());
            System.out.println("Extragere de bani: " + sumaDeExtras);

            if (sumaDeExtras > this.getSumaCurenta()) {
                throw new IllegalArgumentException("Mijloace insuficiente in cont!!!");
            } else {
                sumaCurenta -= sumaDeExtras;
                System.out.println("Operatiune de extragere bani cu succes.");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Soldul curent nu este initializat! Anulare extragere bani!");
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println("Soldul curent: " + sumaCurenta);
        }

        System.out.println("========== Extragere de bani ==========\n");
    }

    public void transferCatreOPersoana(ContulPersoanei persoana, double sumaTransferului){
        System.out.println("\n========== Transfer catre o persoana ==========");

        try {
            System.out.println("Expeditor: " + this.getNumePersoana());
            System.out.println("Soldul curent: " + this.getSumaCurenta());
            System.out.println("Suma spre transfer: " + sumaTransferului);

            System.out.println("------");
            System.out.println("Beneficiar: " + persoana.getNumePersoana());
            System.out.println("Soldul curent: " + persoana.getSumaCurenta());

            if (sumaTransferului > this.getSumaCurenta()) {
                throw new IllegalArgumentException("Mijloace insuficiente in cont!!!");
            } else {
                sumaCurenta -= sumaTransferului;
                persoana.setSumaCurenta(persoana.getSumaCurenta() + sumaTransferului);
                System.out.println("Operatiune de transfer de bani cu succes.");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Soldul curent nu este initializat! Anulare extragere bani!");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Soldul curent expeditor: " + this.getSumaCurenta());
            System.out.println("Soldul curent beneficiar: " + persoana.getSumaCurenta());
        }

        System.out.println("========== Transfer catre o persoana ==========\n");
    }
}
