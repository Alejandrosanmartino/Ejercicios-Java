package potencia;

public class Potencia {

    public static void main(String[] args) {
       
        
    int base=5;
    int exponente= 3;
    int resultado=1;
    
    if (exponente==0 || base==1){
        resultado=1;}
        else if (base>1 && exponente>0){
        
            for (int i=1; i<=exponente; i++){
         resultado = base * resultado;   
}
      }
           System.out.println("el resultado es "+resultado);
         }

    }
 
