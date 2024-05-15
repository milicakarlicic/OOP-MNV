package cas11;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak01 {

    public static void main(String[] args) {
        // metodu get mozemo proslediti relativnu putanju u odnosu na direktorijum projekta
        // npr. ako je relativna putanja: DirProjekta/src/cas07/1.txt
        // onda: Path putanja = Paths.get("src", "cas07", "1.txt");
        Path putanja = Paths.get("1.txt");
        System.out.println("naziv datoteke: " + putanja.getFileName());
        System.out.println("roditelj: " + putanja.getParent());
        System.out.println("koren: " + putanja.getRoot());

        System.out.println("===========================================");

        Path apsolutnaPutanja = putanja.toAbsolutePath();
        System.out.println("naziv datoteke: " + apsolutnaPutanja.getFileName());
        System.out.println("roditelj: " + apsolutnaPutanja.getParent());
        System.out.println("koren: " + apsolutnaPutanja.getRoot());

        try (Scanner ulaz = new Scanner(putanja.toFile())) {
            // ako je sadrzaj reda datoteke: Marko Markovic 20 9.5
            String ime = ulaz.next();
            String prezime = ulaz.next();
            int godine = ulaz.nextInt();
            double prosek = ulaz.nextDouble();

            System.out.println();
            System.out.println(ime + " " + prezime + " " + godine + " " + prosek);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("neocekivana greska");
            System.exit(1);
        }
    }
}
