package primeraEva;
import java.util.*;

public class temperatura {
    public static void main(String[] args) {
       double[] temp=null;
       int numTemp=0;
       double media=0.0,numeroMayor=0,posicionMayor=0,posicionMenor=0,numeroMenor=0;
       Scanner tec=new Scanner(System.in);
       
       System.out.println("Introduce el nª de temperaturas");
       numTemp=tec.nextInt();
       
       temp=new double[numTemp];
       
       for(int i=0;i<numTemp;i++)
       {
            System.out.print("Temperatura n"+(i+1)+": ");
            temp[i]=tec.nextDouble();
       
       }
       
 
        //mayor
        numeroMayor =temp[temp.length-1];
        
        for (int x=0;x<temp.length;x++)
        {
           if (temp[x]>numeroMayor)
            {
            numeroMayor=temp[x];
            posicionMayor=x;
            }
        }
        
        
        //menor
        numeroMenor=temp[0];
        
        for (int i=1;i<temp.length;i++)
        {
           if (temp[i]<numeroMenor)
            {
            numeroMenor=temp[i];
            posicionMenor=i;
            }
        }
        
        //calcular media
        for (int i=0; i<temp.length; i++)
        {
            
            if(i!=posicionMayor && i!=posicionMenor)
            {
                media+=temp[i];
            }
                
        }
        media = media/(temp.length-2);
        //Salida de datos
        System.out.println("La media de las temperaturas es: "+media);
        
        System.out.println("el numero mayor es: "+numeroMayor);
        System.out.println("el numero menor es: "+numeroMenor);
       //mayor numero
        /*
       if(temp[0]>temp[1])
       {
           System.out.println("El mayor es: "+temp[0]);
       }
       else if(temp[1]>temp[2])
       {
           System.out.println("El mayor es: "+temp[1]);
       }
       else
       {
           System.out.println("El mayor es: "+temp[2]);
       }
       */
    }
}
