package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class libreria {
    public static void mostrar(int tab[][],int n){
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++)
            {
                System.out.print(tab[i][j]);
            }
            System.out.println();
            
        }
        saltarLinea(n);
    }
    public static void incrementar(int tab[][]) {
        for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++)
                tab[i][j]++;
    }
    public static void rellenar(int tab[][],int max) {
         for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++)
                tab[i][j]=(int)(Math.random()*max);
    }
    public static void saltarLinea(int n) {
        for(int i=0;i<n;i++)
            System.out.println("");
    }
    public static void carreraCaballos()throws InterruptedException{
        final int MAX_GANADAS=10;
        int cab1=0,cab2=0,cab3=0,cab4=0,cab5=0,cab6=0,cab7=0,cab8=0,cab9=0;
        int n=0,carreras=0;
        
        
        while(true){
            for(int j=0;j<100;j++)
                System.out.println();
            carreras=(int)(Math.random()*9+1);
        
            switch(carreras){
                case 1:cab1++;break;
                case 2:cab2++;break;
                case 3:cab3++;break;
                case 4:cab4++;break;
                case 5:cab5++;break;
                case 6:cab6++;break;
                case 7:cab7++;break;
                case 8:cab8++;break;
                case 9:cab9++;break;
            }
            
            System.out.printf("%02d: ",1);
            for(int j=0;j<cab1;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",2);
            for(int j=0;j<cab2;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",3);
            for(int j=0;j<cab3;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",4);
            for(int j=0;j<cab4;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",5);
            for(int j=0;j<cab5;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",6);
            for(int j=0;j<cab6;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",7);
            for(int j=0;j<cab7;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",8);
            for(int j=0;j<cab8;j++)
                System.out.print("* ");
            System.out.println();
            
            System.out.printf("%02d: ",9);
            for(int j=0;j<cab9;j++)
                System.out.print("* ");
            System.out.println();
            if(cab1==MAX_GANADAS||cab2==MAX_GANADAS||cab3==MAX_GANADAS||cab4==MAX_GANADAS||cab5==MAX_GANADAS||cab6==MAX_GANADAS||cab7==MAX_GANADAS||cab8==MAX_GANADAS||cab9==MAX_GANADAS)break;
            /*System.out.println("Los resultados de las carreras son:\n caballo 1: "+cab1+"\n caballo 2: "
                    +cab2+"\n caballo 3: "+cab3+"\n caballo 4: "+cab4+"\n caballo 5: "+cab5+"\n caballo 6: "
                    +cab6+"\n caballo 7: "+cab7+"\n caballo 8: "+cab8);*/
            Thread.sleep(500);
        }
    }
    public static void meses() {
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
    public static void tabla() {
        //declaracion e inicializacion de variables
        int num=0,nDesde=0,nHasta=0,nLineas=0;
        Scanner tec=new Scanner(System.in);
        
        
        //Entrada de datos
        System.out.println("Numero entre 0 y 10: ");
        num=tec.nextInt();
        System.out.println("Numero desde: ");
        nDesde=tec.nextInt();
        System.out.println("Numero hasta: ");
        nHasta=tec.nextInt();
        
        //calculos
        nLineas=nHasta-nDesde+1;
        
        //salida
        for(int i=0;i<nLineas;i++)
        {
            System.out.println(nDesde+"x"+num+"="+(nDesde*num));
            nDesde++;
        }
    }
    public static void rectangulo() {
        int base=0,altura=0;
        Scanner tec=new Scanner(System.in);
        System.out.println("Introduce base y altura: ");
        base=tec.nextInt();
        altura=tec.nextInt();
        
        for(int i=0;i<altura;i++){
            for(int j=0;j<base;j++){
                if(i==0)System.out.print("* ");
            }  
            System.out.println();
        }
    }
    
    public static void detenerControl(String mensaje) {
        Scanner tec=new Scanner(System.in);
        System.out.println(mensaje);
        tec.next();
    }
    public static int validarEntero(String mensajeLectura,String mensajeError) {
        //declaracion
        int num=0;
        boolean valido=true;
        Scanner tec=new Scanner(System.in);
        
        //entrada
        while(true){
            System.out.println(mensajeLectura);
            try{
                num=tec.nextInt();
            }
            catch(InputMismatchException ex)
            {
                //System.out.println(ex.getMessage());
                System.out.println(mensajeError);
                //ex.printStackTrace();
                tec.next();
                valido=false;
            }
             catch(Exception ex)
            {
                ex.printStackTrace();
                System.exit(1);
            }
                           
            if(valido)break;
        }
        //salida
        return num;
    }
}
