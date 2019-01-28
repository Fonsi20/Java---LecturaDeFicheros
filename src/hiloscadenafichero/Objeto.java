package hiloscadenafichero;

/**
 *
 * @author a16alfonsofa
 */
public class Objeto {

    private String iniciales;
    private int numeroCaracteres;
    private boolean disponible = false;

    public Objeto() {
    }

    public Objeto(String iniciales, int numeroCaracteres) {
        this.iniciales = iniciales;
        this.numeroCaracteres = numeroCaracteres;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }

    public void setNumeroCaracteres(int numeroCaracteres) {
        this.numeroCaracteres = numeroCaracteres;
    }

    public synchronized void almacenar(String ini, int lon) {

        while (disponible == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        iniciales = ini;
        numeroCaracteres = lon;
        disponible = true;
        notifyAll();
    }

}
