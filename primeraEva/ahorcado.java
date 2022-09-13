package primeraEva;

import clases.libreria;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ahorcado {
    public static void main(String[] args) {
        char [][] dib={
            {'*','*','*','*','*','*','*','*'},
            {'*',' ',' ',' ',' ',' ',' ','*'},
            {'*',' ',' ',' ',' ',' ',' ','*'},
            {'*',' ',' ',' ',' ',' ',' ','*'},
            {'*',' ',' ',' ',' ',' ',' ','*'},
            {'*',' ',' ',' ',' ',' ',' ','*'},
            {'*',' ',' ',' ',' ',' ',' ','*'},
            {'*','*','*','*','*','*','*','*'}
        };
        
        char[] palabra;
        boolean[] letras=new boolean['z'-'a'+1];
        int fallo=0;
        char letra='\b';
        String adivinar=elegirPalabra("c:\\ficheros/ahorcado.txt");
        
        boolean esta=false;
        
        palabra=inicializar(adivinar);
        while(true){
            libreria.saltarLinea(100);
            mostrar(letras,"LETRAS INTRODUCIDAS: ");
            mostrar(dib);
            mostrar("PALABRA ADIVINAR: ",palabra);
            if(finalizar(adivinar,palabra,fallo)) break;
            letra=leer("NUEVA LETRA: ");
            esta=adivinar(adivinar,letra,palabra);
            if(!esta)fallo++;
            ahorcado(dib,fallo);
            letrasLeidas(letra,letras);
        }
        terminado(adivinar,"AHORCADO, LA PALABRA ADIVINAR ERA: ","ENHORABUENA! HAS ADIVINADO LA PALABRA",fallo);
        
    }
    public static void mostrar(char[][] dib){
        for(int i=0;i<dib.length;i++){
            for(int j=0;j<dib[i].length;j++)
                System.out.print((char)dib[i][j]+" ");
            System.out.println();
        }
    }
    public static void mostrar(boolean[] letras,String mensaje) {
        System.out.print(mensaje);
        for(int i=0;i<letras.length;i++)//letras[i]
        {
            if(letras[i])
                System.out.print((char)('a'+i));
        }
        System.out.println();  
    }
    public static void mostrar(String mensaje,char[] p) {
        System.out.print(mensaje);
        for(int i=0;i<p.length;i++){
            System.out.print(p[i]+" ");
        }
        System.out.println("");
    }
    public static char leer(String mensaje) {
        Scanner tec=new Scanner(System.in);
        System.out.print(mensaje);
        return tec.next().charAt(0);
    }
    public static void letrasLeidas(char letra,boolean[] letras) {
        int i=(int)(letra-'a');
        if(i>=0 && i<letras.length)
            letras[i]=true;
        
    }
    public static char[] inicializar(String adivinar) {
        char[] p=new char[adivinar.length()];
        for(int i=0;i<p.length;i++){
            if(adivinar.charAt(i)==' ')
                p[i]=' ';
            else   
                p[i]='_';
            
        }
        return p;
    }
    public static boolean adivinar(String adivinar,char l, char[] p) {
        char letra='\0';
        boolean esta=false;
        for(int i=0;i<adivinar.length();i++){
            letra=adivinar.charAt(i);
            if(letra==l)
            {
                p[i]=l;
                esta=true;
            }
        }
        return esta;
    }
    public static boolean finalizar(String adivinar,char[] p,int fallo) {
        boolean fin=false;
        String pal=String.valueOf(p);
        
        fin=pal.equals(adivinar)||fallo==12;
        
        return fin;
    }
    public static void ahorcado(char[][] dib,int fallo) {
        
        switch(fallo){
            case 1: dib[5][5]='|';break;
            case 2: dib[4][5]='|';break;
            case 3: dib[3][5]='|';break;
            case 4: dib[2][5]='|';break;
            case 5: dib[2][4]='-';break;
            case 6: dib[2][3]='|';break;
            case 7: dib[3][3]='O';break;
            case 8: dib[4][3]='|';break;
            case 9: dib[4][2]='-';break;
            case 10: dib[4][4]='-';break;
            case 11: dib[5][2]='/';break;
            case 12: dib[5][4]='\\';break;
        }
    }
    public static void terminado(String adivinar,String mensaje,String mensaje2,int fallo) {
        if(fallo==12)
        {
            System.out.println(mensaje);
            System.out.println(adivinar);
        }
        else 
            System.out.println(mensaje2);
        
    }
    public static String elegirPalabra(String ruta) {
        BufferedReader br=null;
        String reg="",palabra="";
        
        int cont=0,n=0;
        
        try
        {
            br=new BufferedReader(new FileReader(ruta));
            
            while(true)
            {
                //if(!br.hasNext())break;
                reg=br.readLine();
                if(reg==null)break;
                cont++;
                                
            }
            br.close();
            n=(int)(Math.random()*cont);
            
            cont=0;
            br=new BufferedReader(new FileReader(ruta));
            
            while(true)
            {
                //if(!br.hasNext())break;
                reg=br.readLine();
                if(reg==null)break;
                if(cont==n)
                    palabra=reg;
                
                cont++;
                                
            }
            br.close();
            System.out.println(palabra);
            return palabra;
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Fichero no encontrado!!! ");
            
        }
        catch(IOException ex)
        {
            System.out.println("Error de e/s!!! ");
            
        }
        return null;
    }
}