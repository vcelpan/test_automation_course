package topic7;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "\\Users\\ICG\\Desktop\\test.txt";
        FileManager.scriereaInformatieTextInFisier(filePath, "salut, sunt eu!");
        FileManager.alipireaInformatieiLaFisier(filePath, "huinea");
        String dateFisier = FileManager.citireDateDinFisier(filePath);
        System.out.println(dateFisier);
    }
}
