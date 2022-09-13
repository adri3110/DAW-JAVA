package primeraEva;

import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        //declaracion e inicializacion de variables
        int num=0,nDesde=0,nHasta=0,nLineas=0;
        Scanner tec=new Scanner(System.in);
        
        
        //Entrada de datos
        System.out.println("Numero entre 0 y 10: ");
        num=tec.nextInt();
        System.out.println("Numero desde: ");
        nDesde=tec.nextInt();
        System.out.println("Numero hasta: ");
        nHasta=tec.nextInt();
        
        //calculos
        nLineas=nHasta-nDesde+1;
        
        //salida
        for(int i=0;i<nLineas;i++)
        {
            System.out.println(nDesde+"x"+num+"="+(nDesde*num));
            nDesde++;
        }
    }
}
