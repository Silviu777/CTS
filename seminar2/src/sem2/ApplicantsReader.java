package sem2;

import java.io.FileNotFoundException;
import java.util.List;

public interface ApplicantsReader {
    List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}
