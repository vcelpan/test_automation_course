package topic8;

public class ServiciuStoc {

    public static void main(String[] args) {
        Carte carte1 = new Carte("Septembrie", "Tom Sawyer", 4515528, 189);
        Carte carte2 = new Carte("Octombrie", "Mihai Sadoveanu", 487214584, 120);
        Carte carte3 = new Carte("Noiembrie", "Mircea cel Batran", 87541465, 45);
        Carte carte4 = new Carte("Decembrie", "Puskinr", 451236, 654);
        Carte carte5 = new Carte("Ianuarie", "Salma Haiec", 12312, 154);
        Carte carte6 = new Carte("Februarie", "Stefan Neaga", 1238769, 134);
        Carte carte7 = new Carte("Martie", "Mihai Eminescu", 97897897, 245);
        Carte carte8 = new Carte("Aprilie", "Bullvick Ralph", 1123123, 369);

        Stoc stoc1 = new Stoc(1, "Mircea cel Batran 24");
        Stoc stoc2 = new Stoc(2, "Moscova 21");

        System.out.println("stoc1 este gol? : " + stoc1.esteStoculGol());
        System.out.println("stoc1 numarul de carti? : " + stoc1.nrDeCartiInStoc());
        stoc1.adaugaCarteInStoc(carte1);
        stoc1.adaugaCarteInStoc(carte2);
        stoc1.adaugaCarteInStoc(carte3);
        stoc1.adaugaCarteInStoc(carte4);
        System.out.println("stoc1 este gol? : " + stoc1.esteStoculGol());
        System.out.println("stoc1 numarul de carti? : " + stoc1.nrDeCartiInStoc());
        System.out.println("Exista cartea " + carte2 + " in stoc1? : " + stoc1.existaCarteInStoc(carte2));
        System.out.println("Exista cartea " + carte7 + " in stoc1? : " + stoc1.existaCarteInStoc(carte7));
        stoc1.listaDeCartiInStoc();
        stoc1.stergeCarteDinStoc(carte2);
        System.out.println("stoc1 numarul de carti? : " + stoc1.nrDeCartiInStoc());
        stoc1.listaDeCartiInStoc();
    }
}
