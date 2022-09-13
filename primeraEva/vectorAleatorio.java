package primeraEva;

public class vectorAleatorio {
    public static void main(String[] args) {
        //declaracion
        int n[]=new int[60];
        int pares=0,impares=0;
        
    //entrada-->nada
        
    //calculos
        //rellenar aleatoriamente el vector:
        for(int i=0;i<n.length;i++)//n[i]
        {
            
            n[i]=(int)(Math.random()*10); 
        }
        //obtener el nº de pares:
        for(int i=0;i<n.length;i++)//n[i]
        {
            if(n[i]%2==0)
                pares++;
           /* else
                impares++;*/
        }
        //obtener el nº de impares:
        impares=n.length-pares;
        /*for(int i=0;i<n.length;i++)//n[i]
        {
            if(n[i]%2!=0)
                impares++; 
        }*/
        
        
        
        //escritura
        for(int i=0;i<n.length;i++)//n[i]
        {
            
            
            System.out.print(n[i]);
            
        }
        
       
        System.out.println("\nPares:"+pares);
        System.out.println("Impares:"+impares);
    }
}
/*
lee un nº entre 0-10(incluidos)y mostrar la tabla de multiplicar

salida:


*/

