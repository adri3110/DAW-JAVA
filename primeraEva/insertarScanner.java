package primeraEva;

import java.util.*;
import java.io.*;

public class insertarScanner {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        BufferedWriter bw=null;
        String nombre="";
        int edad=0;
        float peso=0;
        
        try
        {
            System.out.print("Escribe el nombre: ");
            nombre=tec.next();
            
            if(!buscar(nombre)){
                System.out.print("Escribe la edad: ");
                edad=tec.nextInt();
                System.out.print("Escribe el peso: ");
                peso=tec.nextFloat();
                bw=new BufferedWriter(new FileWriter("c:\\ficheros/scanner.txt",true));
                bw.write(nombre+" "+edad+" "+String.valueOf(peso).replace('.',','));
                bw.newLine();

                bw.close();
            }
            else{
                System.out.println("el nombre a insertar ya existe ");
            }
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
    public static boolean buscar(String nom) throws IOException,FileNotFoundException{
        BufferedReader br=null;
        String nombre="",reg="";
        String[] campo=null;
        boolean encontrado=false;
        br=new BufferedReader(new FileReader("c:\\ficheros/scanner.txt"));
        while(true)
        {
            //if(!br.hasNext())break;
            reg=br.readLine();
            if(reg==null)break;
            campo=reg.split("[\\s]");
            //System.out.println(campo.length);
            nombre=campo[0];
            if(nombre.equals(nom)){
                encontrado=true;
            }

        }
        br.close();
        return encontrado;
    }
}
