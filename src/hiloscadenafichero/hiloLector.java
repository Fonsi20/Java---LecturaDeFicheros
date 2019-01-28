package hiloscadenafichero;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.TreeSet;

/**
 *
 * @author a16alfonsofa
 */
public class hiloLector extends Thread {

    private BufferedReader br;
    private long lonxitude = 0;
    private String iniciais = "";
    TreeSet ts;

    @Override
    public void run() {
        try {
            while (br.ready()) {
                String[] fraccion = br.readLine().split(" ");
                for (String d1 : fraccion) {
                    iniciais += d1.charAt(0);
                    lonxitude += d1.length();
                }
                iniciais = "";
                lonxitude = 0;
                gardado(br.readLine(), iniciais, lonxitude);
                System.out.println(iniciais + "  " + lonxitude);
            }
        } catch (IOException ioe1) {
            ioe1.getMessage();
        }
    }

    public synchronized void gardado(String cadea, String iniciais, double lonxude) {
        String l1 = " ";
        byte repeticion = 1;
        l1 = iniciais + " " + String.valueOf(lonxude) + " " + cadea + " " + repeticion;
        if (ts.contains(l1)) {
            repeticion++;
            l1 = iniciais + " " + String.valueOf(lonxude) + " " + cadea + " " + repeticion;
            ts.remove(l1);
            ts.add(l1);
            repeticion = 1;
        }
    }

    public hiloLector(BufferedReader br, TreeSet ts) {
        this.br = br;
        this.ts = ts;
        run();
    }

}
