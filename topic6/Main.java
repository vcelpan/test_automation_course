package topic6;

public class Main {

    public static void main(String[] args) {
        ContulPersoanei viorel = new ContulPersoanei();
        viorel.setNumePersoana("Viorel");
        viorel.setId(79118040);
        viorel.setSumaCurenta(10000);

        ContulPersoanei ana = new ContulPersoanei();
        ana.setNumePersoana("Ana");
        ana.setId(78482589);
        ana.setSumaCurenta(15000);

        ContulPersoanei olesea = new ContulPersoanei();
        olesea.setNumePersoana("Olesea");
        olesea.setId(684879251);
        olesea.setSumaCurenta(50);

        ContulPersoanei daniela = new ContulPersoanei();
        daniela.setNumePersoana("Daniela");
        daniela.setId(49898941);
        daniela.setSumaCurenta(750);

        // Operatiuni executate
        viorel.extragereDeBani(5484787);
        viorel.transferCatreOPersoana(daniela, 150);
        daniela.transferCatreOPersoana(viorel, 750);
        daniela.extragereDeBani(500);
    }
}
