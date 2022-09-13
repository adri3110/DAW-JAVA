package primeraEva;

import java.util.Scanner;

public class cadenas {
    public static void main(String[] args) {
        String cadena="";
        int n[]=new int['z'-'a'+1];
        Scanner tec=new Scanner(System.in).useDelimiter("\n");
        int contarN=0,pos=0;
        char letra='\0';
        //entrada
        System.out.println("Introduce una linea");
        cadena=tec.next();
        
        //calculos
        for(int i=0;i<cadena.length();i++)//cadena[i]
        {
            letra = cadena.charAt(i);
            pos = letra-'a';
        //cadena[i]-'a'
            if('a'<=letra && letra<='z')n[pos]++;
          
            if(letra=='ñ')contarN++;
        }
            
        
        
        
        //salida
        for(int i='a';i<='z';i++)
        {
            if(n[i-'a']>0)
            System.out.println((char) i+": "+n[i-'a']) ;
            if(i=='n' && contarN>0)
                System.out.println("ñ: "+contarN);
            
        }
        
    }
}
