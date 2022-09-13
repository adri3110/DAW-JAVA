
package primeraEva.examen;

public class cadenas {
    public static void main(String[] args) {
        
        String cadenas[] ={"maria","hola marianela","perro","examen pendientes"};
        System.out.println("La cadena mas larga es: "+mayor(cadenas));
        System.out.println("La cadena con mas vocales es: "+masVocales(cadenas));
        
    }
    public static String mayor(String cadenas[]){
        //comprobacion
        if(cadenas==null)
            return "no existen cadenas";
        if(cadenas.length==0)
            return "no existen cadenas";
        //calculos mayor
        String may=cadenas[0];
        for(int i=0;i<cadenas.length;i++){
            if(cadenas[i].length() > may.length()){
                may=cadenas[i];
            }
        }
        return may;
    }
    public static String masVocales(String cadenas[]){
        //comprobacion
        if(cadenas==null)
            return "no existen cadenas";
        if(cadenas.length==0)
            return "no existen cadenas";
        //calculos mayor
        String may=cadenas[0];
        for(int i=0;i<cadenas.length;i++){
            if(contarVocales(cadenas[i]) > contarVocales(may)){
                may=cadenas[i];
            }
        }
        return may;
    }
    public static int contarVocales(String cad){
        char letra='\0';
        int cont=0;
        for(int i=0;i<cad.length();i++){
            letra=cad.charAt(i);
            if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
                cont++;
            } 
        }
        return cont;
    }
}
