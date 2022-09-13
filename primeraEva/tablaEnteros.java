
package primeraEva;

import clases.libreria;

public class tablaEnteros {
    public static void main(String[] args) {
        int tab[][]=new int[10][20];
        
        libreria.rellenar(tab,8);
        
        libreria.mostrar(tab,3);
        
        libreria.incrementar(tab);
        
        libreria.mostrar(tab,0);
    }
}
