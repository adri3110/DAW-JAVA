package primeraEva;

import java.util.Scanner;

public class numerosAleatorios {
    public static void main(String[] args) {
        int n3=0,n1=0,n2=0,desde=0,hasta=0;
        Scanner tec=new Scanner(System.in);
        n1=(int)(Math.random()*3);//num aleatorio entre 0 y 3(sin incluir el 3)
        n2=(int)(Math.random()*3+2);//num aleatorio entre 2 y 5(sin incluir el 5)
        System.out.println("Introduce desde-hasta: ");
        desde=tec.nextInt();
        hasta=tec.nextInt();
        n3=(int)(Math.random()*(hasta-desde)+desde);
        
        System.out.println("n1= "+n1+" ,n2= "+n2+" y n3= "+n3);
        
    }
}
