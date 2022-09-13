
package primeraEva;

public class ordenarVector {
    public static void main(String[] args) {
        //declaracion
        int n[]=new int[20];
        int aux=0;
        boolean intercambiar;
    //entrada-->nada
        
    //calculos
        //rellenar aleatoriamente el vector:
        for(int i=0;i<n.length;i++)//n[i]
        {
            
            n[i]=(int)(Math.random()*100); 
        }    
        //escritura
        for(int i=0;i<n.length;i++)//n[i]
        {
            
            
            System.out.print(n[i]+" ");
            
        }
        //Ordenar el vector(burbuja):
        for(int j=0;j<n.length;j++)
        {
            intercambiar=false;
            for(int i=0;i<n.length-1-j;i++)//met. burbuja mejorado: n.length-1--->j<--
                
                if(n[i]>n[i+1])
                {
                    aux=n[i];
                    n[i]=n[i+1];
                    n[i+1]=aux;
                    intercambiar=true;
                }
           if(!intercambiar)break;
                        
        }
        
        
        System.out.println();
         //escritura final con vector ordenado:
        for(int i=0;i<n.length;i++)//n[i]
        {
            
            System.out.print(n[i]+" ");
            
        }
        System.out.println();   
    }
}

