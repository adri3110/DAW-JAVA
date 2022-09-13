package primeraEva;
import java.util.Scanner;
public class carreraCaballosVector {

    public static void main(String[] args)throws InterruptedException
    {
        final int MAX_GANADAS=10;
        //final int CABALLOS=3;
        final int SALTOS=100;
        int[] cab=null; //int[] cab=new int[CABALLOS];
        int caballo=0,caballos=0;
        boolean fin=false;
        Scanner tec=new Scanner(System.in);
        System.out.println("introduce nª caballos: ");
        caballos=tec.nextInt();
        cab=new int[caballos];
        while(true){
            for(int j=0;j<SALTOS;j++)
                System.out.println();
            caballo=(int)(Math.random()*cab.length+1);
        
            cab[caballo-1]++;
            
            for(int i=0;i<cab.length;i++){
                System.out.printf("%02d: ",i+1);
                
                for(int j=0;j<cab[i];j++)
                    if(i==caballo-1 && j+1==cab[i])
                        System.out.print("+ ");
                    else
                        System.out.print("* ");
                System.out.println();
            }
            
            
            if(cab[caballo-1]==MAX_GANADAS)break;
                
            /*System.out.println("Los resultados de las carreras son:\n caballo 1: "+cab1+"\n caballo 2: "
                    +cab2+"\n caballo 3: "+cab3+"\n caballo 4: "+cab4+"\n caballo 5: "+cab5+"\n caballo 6: "
                    +cab6+"\n caballo 7: "+cab7+"\n caballo 8: "+cab8);*/
            
            Thread.sleep(500);
        }
        System.out.println("el cab ganador es: "+caballo);
    }
}