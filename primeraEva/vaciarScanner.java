package primeraEva;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static primeraEva.insertarScanner.buscar;

public class vaciarScanner {
    public static void main(String[] args) {
        BufferedWriter bw=null;
                
        try
        {
                bw=new BufferedWriter(new FileWriter("c:\\ficheros/scanner.txt"));
                
                bw.close();
            
           }
        catch(FileNotFoundException ex)
        {
            System.out.println("Fichero no encontrado!!! ");
            
        }
        catch(IOException ex)
        {
            System.out.println("Error de e/s!!! ");
            
        }
        catch(Exception ex)
        {
            System.out.println("error desconocido");
            
        } 
    }
}
