package primeraEva;

import java.io.*;

public class mostrarBufferedReader {
    public static void main(String[] args) {
        BufferedReader br=null;
        String nombre="",reg="";
        String[] campo=null;
        int edad=0;
        float peso=0;
        
        try
        {
            br=new BufferedReader(new FileReader("c:\\ficheros/scanner.txt"));
            System.out.format("%-20s %4s %4s\n","NOMBRE","EDAD","PESO");
            System.out.println("-------------------- ---- ----");
            while(true)
            {
                //if(!br.hasNext())break;
                reg=br.readLine();
                if(reg==null)break;
                campo=reg.split("[\\s]");
                //System.out.println(campo.length);
                nombre=campo[0];
                edad=Integer.valueOf(campo[1]);
                peso=Float.valueOf(campo[2].replace(',', '.'));
                System.out.format("%-20s %4d %4.1f\n",nombre,edad,peso);
                
            }
            br.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Fichero no encontrado!!! ");
            
        }
        catch(IOException ex)
        {
            System.out.println("Error de e/s!!! ");
            
        }
    }
}
