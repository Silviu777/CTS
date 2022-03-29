package sem2;

import java.util.Scanner;

public class ApplicantReader {

    public static void citireAplicant( Scanner scanner,Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nrProiecte = scanner.nextInt();
        String[] denumiri = new String[nrProiecte];

        for (int i = 0; i < nrProiecte; i++)
            denumiri[i] = scanner.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setProiecteDenumire(nrProiecte, denumiri);

    }
}
