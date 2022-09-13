
package primeraEva;

import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args) {
        int base=0,altura=0;
        Scanner tec=new Scanner(System.in);
        System.out.println("Introduce la base y la altura: ");
        base=tec.nextInt();
        altura=tec.nextInt();
        System.out.println("");
        //triangulo con borde de asteriscos(triangulo rectangulo)
        for(int i=0;i<altura;i++)//rellenar linea i
        {
            for(int j=0;j<base;j++)//rellenar caracteres de la linea i
            {
                if(j==0||i==altura-1||i==j)System.out.print("* ");
                else System.out.print("  ");
                
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        
        //triangulo relleno de asteriscos(triangulo rectangulo)
        for(int i=0;i<altura;i++)//rellenar linea i
        {
            for(int j=0;j<base;j++)//rellenar caracteres de la linea i
            {
                if(i>=j)System.out.print("* ");
                else System.out.print("  ");
                
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        //rectangulo con borde de asteriscos
        for(int i=0;i<altura;i++)//rellenar linea i
        {
            for(int j=0;j<base;j++)//rellenar caracteres de la linea i
            {
                if(i==0)System.out.print("* ");
                else if(j==0)System.out.print("* ");
                else if(i==altura-1)System.out.print("* ");
                else if(j==base-1)System.out.print("* ");
                else System.out.print("  ");
                
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //rectangulo relleno de asteriscos
        for(int i=0;i<altura;i++)//rellenar linea i
        {
            for(int j=0;j<base;j++)//rellenar caracteres de la linea i
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //rectangulo con borde de asteriscos y +
        for(int i=0;i<altura;i++)//rellenar linea i
        {
            for(int j=0;j<base;j++)//rellenar caracteres de la linea i
            {
                if(i==0)System.out.print("* ");
                else if(i==altura-1)System.out.print("* ");
                else if(j==0)System.out.print("+ ");
                else if(j==base-1)System.out.print("+ ");
                else System.out.print("  ");
                
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
