package hiloscadenafichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeSet;

/**
 *
 * @author a16alfonsofa
 */
public class InicioHilos {

    public static void hilosmain(BufferedReader args) {
        TreeSet<String> ts = new TreeSet();
        hiloLector f1 = new hiloLector(args, ts);
    }
}
