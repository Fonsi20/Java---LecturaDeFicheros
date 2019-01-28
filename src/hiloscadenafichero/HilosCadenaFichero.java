package hiloscadenafichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author a16alfonsofa
 */
public class HilosCadenaFichero {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        List lista = new ArrayList();
        int largo;
        Objeto objeto = null;
        String cadena1, cadena2, cadena3, cadena4;

        FileReader f1 = new FileReader("C:/Users/a16alfonsofa/Documents/NetBeansProjects/HilosCadenaFichero/FICHERO1.txt");
        BufferedReader read1 = new BufferedReader(f1);

        FileReader f2 = new FileReader("C:/Users/a16alfonsofa/Documents/NetBeansProjects/HilosCadenaFichero/FICHERO2.txt");
        BufferedReader read2 = new BufferedReader(f2);

        FileReader f3 = new FileReader("C:/Users/a16alfonsofa/Documents/NetBeansProjects/HilosCadenaFichero/FICHERO3.txt");
        BufferedReader read3 = new BufferedReader(f3);

        FileReader f4 = new FileReader("C:/Users/a16alfonsofa/Documents/NetBeansProjects/HilosCadenaFichero/FICHERO4.txt");
        BufferedReader read4 = new BufferedReader(f4);

        while ((cadena1 = read1.readLine()) != null) {
            // System.out.println(cadena1);
            largo = cadena1.length();
            String ini = " ";
            String xx = cadena1.substring(0, 1);
            String x = "";
            String xxx = "";
            for (int i = 0; i < largo; i++) {
                x = cadena1.substring(i, i + 1);
                if (x.equals(ini)) {
                    xxx = cadena1.substring(i + 1, i + 2);
                    xx = xx + xxx;
                }
            }
            //System.out.println(xx);
            objeto = new Objeto(xx, largo);
            //Productor productor1=new Productor(mensaje); 
            lista.add(objeto);
        }

        while ((cadena2 = read2.readLine()) != null) {
            // System.out.println(cadena2);
            largo = cadena2.length();
            String ini = " ";
            String xx = cadena2.substring(0, 1);
            String x = "";
            String xxx = "";
            for (int i = 0; i < largo; i++) {
                x = cadena2.substring(i, i + 1);
                if (x.equals(ini)) {
                    xxx = cadena2.substring(i + 1, i + 2);
                    xx = xx + xxx;
                }
            }
            //System.out.println(xx);
            objeto = new Objeto(xx, largo);
            lista.add(objeto);
        }

        while ((cadena3 = read3.readLine()) != null) {
            // System.out.println(cadena3);
            largo = cadena3.length();
            String ini = " ";
            String xx = cadena3.substring(0, 1);
            String x = "";
            String xxx = "";
            for (int i = 0; i < largo; i++) {
                x = cadena3.substring(i, i + 1);
                if (x.equals(ini)) {
                    xxx = cadena3.substring(i + 1, i + 2);
                    xx = xx + xxx;
                }
            }
            //System.out.println(xx);
            objeto = new Objeto(xx, largo);
            lista.add(objeto);
        }

        while ((cadena4 = read4.readLine()) != null) {
            // System.out.println(cadena4);
            largo = cadena4.length();
            String ini = " ";
            String xx = cadena4.substring(0, 1);
            String x = "";
            String xxx = "";
            for (int i = 0; i < largo; i++) {
                x = cadena4.substring(i, i + 1);
                if (x.equals(ini)) {
                    xxx = cadena4.substring(i + 1, i + 2);
                    xx = xx + xxx;
                }
            }
            //System.out.println(xx);
            objeto = new Objeto(xx, largo);
            lista.add(objeto);
        }

        read1.close();
        read2.close();
        read3.close();
        read4.close();

        Collections.sort(lista, (Objeto p1, Objeto p2) -> new Integer(p1.getNumeroCaracteres()).compareTo(new Integer(p2.getNumeroCaracteres())));

        Objeto ob;
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            ob = (Objeto) iter.next();
            /* Cast del Objeto a la Clase Persona*/
            System.out.println("La longitud es: " + ob.getNumeroCaracteres() + "\tLas iniciales son: " + ob.getIniciales());/* Accedo a los atributos de la clase 
                                           por medio de sus Getters*/
        }

    }

}
