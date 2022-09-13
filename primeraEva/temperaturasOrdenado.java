package primeraEva;

import java.util.Scanner;

public class temperaturasOrdenado {
    public static void main(String[] args) {
       double[] temp=null;
       int numTemp=0;
       double media=0.0,numeroMayor=0,posicionMayor=0,posicionMenor=0,numeroMenor=0;
       double aux=0;
       Scanner tec=new Scanner(System.in);
       
       System.out.println("Introduce el nª de temperaturas");
       numTemp=tec.nextInt();
       
       temp=new double[numTemp];
       
       for(int i=0;i<numTemp;i++)
       {
            System.out.print("Temperatura n"+(i+1)+": ");
            temp[i]=tec.nextDouble();
       }
       
       //Ordenar las temperaturas de menos a mayor:
       for(int j=0;j<temp.length;j++)
            for(int i=0;i<temp.length-1;i++)
                if(temp[i]>temp[i+1])
                {
                    aux=temp[i];
                    temp[i]=temp[i+1];
                    temp[i+1]=aux;
                }
 
        //mayor
        numeroMayor =temp[temp.length-1];
        
            
        
        //menor
        numeroMenor=temp[0];
        
        //calcular media
        for (int i=1; i<temp.length-1; i++)
        {
                media+=temp[i];
        }
        media = media/(temp.length-2);
        //Salida de datos
        System.out.println("La media de las temperaturas es: "+media);
        
        System.out.println("el numero mayor es: "+numeroMayor);
        System.out.println("el numero menor es: "+numeroMenor);
    }
}
