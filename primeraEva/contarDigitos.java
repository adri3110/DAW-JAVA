
package primeraEva;

import java.util.Scanner;

public class contarDigitos {
    public static void main(String[] args) {
        int n=0;
        int digitos=0;
        
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        n=tec.nextInt();
        
        while(true)
        {
            
            digitos++;
            n/=10;
            if(n==0)break;
        }
        System.out.println("Tiene "+digitos+" digitos");
        
    }
}
