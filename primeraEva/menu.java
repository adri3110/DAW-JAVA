package primeraEva;

import clases.libreria;
        
import java.util.Scanner;

public class menu {
    public static void main(String[] args)throws InterruptedException{
        int opcionElegida=0;
        Scanner tec=new Scanner(System.in);
        
        salir:
        while(true)
        {
            libreria.saltarLinea(100);
            System.out.println("1.carrera de caballos");
            System.out.println("2.meses");
            System.out.println("3.tabla de multiplicar");
            System.out.println("4.rectangulo");
            System.out.println("Terminar");


            System.out.println("Opcion elegida: ");
            opcionElegida=tec.nextInt();
            libreria.saltarLinea(100);
            switch(opcionElegida)
            {
                case 1: libreria.carreraCaballos();break;
                case 2: libreria.meses();break;
                case 3: libreria.tabla();break;
                case 4: libreria.rectangulo();break;
                default:break salir;
                
            }
            libreria.detenerControl("Pulsa una tecla para volver al menu ");
        }
        libreria.saltarLinea(100);
        System.out.println("PROGRAMA TERMINADO!!!");
    }    
}
