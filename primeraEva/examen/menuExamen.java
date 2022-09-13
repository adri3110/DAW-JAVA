
package primeraEva.examen;

import java.util.Scanner;

public class menuExamen {
    public static void main (String [] arg)
    {
        Scanner teclado=new Scanner (System.in);
        int numero1, numero2, opc=0;
        System.out.println ("Introduce numero 1: ");
        numero1=teclado.nextInt();
        System.out.println ("Introduce numero 2: ");
        numero2=teclado.nextInt();
        salir:
        while (opc!=3)
        {
        menu();
        opc=teclado.nextInt();
            switch (opc)
            {
                case 1:System.out.println ("El resultado "+numero1+"*"+numero2+"="+potencia(numero1,numero2));break;
                    
                case 2:System.out.println ("El resultado "+numero1+"*"+numero2+"="+multiplicar(numero1,numero2));break;
                
                default:break salir;
            }
        }
}
    public static int multiplicar (int a, int b)
    {
        int cont, mult=0;
        for (cont=0;cont<b;cont++)
        {
            mult=mult+a;
        }
        return mult;
    }
    public static int potencia (int a, int b)
    {
        int cont, potencia=1;
        for (cont=0; cont<b;cont++)
        {
            potencia=potencia*a;
        }
        return potencia;
    }
    public static void menu()
    {
        System.out.println ("Menu");
        System.out.println("----------------------------------");
        System.out.println ("1. Potencia num1 elevado a num2");
        System.out.println ("2. Multipicar sumando");
        System.out.println ("3. Salir");
        System.out.println ("Elige una opcion");
    }
}