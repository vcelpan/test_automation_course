package topic7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    static void scriereaInformatieTextInFisier(String caleaCatreFisier, String date) throws IOException {
        File fisier = new File(caleaCatreFisier);
        try {
            if (fisier.createNewFile()) {
                System.out.println("File created: " + fisier.getName());
            } else {
                System.out.println("File already exists!");
            }

            FileWriter fileWriter = new FileWriter(caleaCatreFisier);
            fileWriter.write(date);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static void alipireaInformatieiLaFisier(String caleaCatreFisier, String date) throws IOException {
        try (FileWriter fileWriter = new FileWriter(caleaCatreFisier, true)) {
            fileWriter.append("\n");
            fileWriter.append(date);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static String citireDateDinFisier(String caleaCatreFisier){
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(caleaCatreFisier)));
        } catch (IOException e){
            e.printStackTrace();
        }

        return content;
    }
}
