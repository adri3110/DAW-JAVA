package primeraEva;

import java.util.Scanner;

public class numAleatorios2 {
    public static void main(String[] args) {
        //numeros aleatorios entre 1 y 100 hasta encontrar n multiplo de 7.Mostrar todos los n generados
        /*int n=0;
        
        while(true)
        {
        n=(int)(Math.random()*99+1);
        
        System.out.println("El numero aleatorio es: "+n);
        if(n%7==0)break;
        }*/
       
        //tiramos un dado n veces introducidas por teclado e imprimimos las veces
        int n=0,dado=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
        Scanner tec=new Scanner(System.in);
        System.out.println("Introduce las tiradas: ");
        n=tec.nextInt();
        for(int i=0;i<n;i++)
        {
            dado=(int)(Math.random()*6+1);
            switch(dado){
                case 1:c1++;break;
                case 2:c2++;break;
                case 3:c3++;break;
                case 4:c4++;break;
                case 5:c5++;break;
                case 6:c6++;break;
            }
                    
        }
        System.out.println("Los resultados de las tiradas son: "+c1+" "+c2+" "+c3+" "+c4+" "+c5+" "+c6);
    }
}
