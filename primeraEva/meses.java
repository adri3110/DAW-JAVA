
package primeraEva;

import java.util.Scanner;

public class meses {
    public static void main(String[] args) {
        int mes=0,dias=0;
        Scanner tec=new Scanner(System.in);
        System.out.println("introduce un mes: ");
        mes=tec.nextInt();
        switch(mes){
            case 3:;
            case 5:;
            case 7:;
            case 8:;
            case 10:;
            case 12:;
            case 1:dias=31;break;
            case 2:dias=28;break;
            case 6:;
            case 9:;
            case 11:;
            case 4:dias=30;break;    
            default :dias=0;  
                
                
        }
        
        if(dias==0)
            System.out.println("Error de introduccion de mes!");
        else
            System.out.println("El mes "+mes+" tiene "+dias+" dias");
           
        
        
    }
}
