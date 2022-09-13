
package primeraEva;
import java.io.*;
import java.util.Scanner;

public class mostrarScanner {
    public static void main(String[] args) {
        Scanner tec=null;
        String nombre="";
        int edad=0;
        float peso=0;
        
        try
        {
            tec=new Scanner(new File("c:\\ficheros/scanner.txt"));
            System.out.format("%-20s %4s %4s\n","NOMBRE","EDAD","PESO");
            System.out.println("-------------------- ---- ----");
            while(true)
            {
                if(!tec.hasNext())break;
                nombre=tec.next();
                edad=tec.nextInt();
                peso=tec.nextFloat();
                System.out.format("%-20s %4d %4.1f\n",nombre,edad,peso);
                
            }
            tec.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Fichero no encontrado!!! ");
            
        }
        
    }
}