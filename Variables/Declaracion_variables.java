
public class PrimeraClaseJava {
    
    public static void main(String[] args) {
   
    //Declaramos las variables que nos pide el ejercicio: 
    double expre;
    int a =4;
    int b=6;
    int c=2;
    boolean variableBooleana=true;
    String nombre="48007612B"; 
    
    /*Una vez declaradas las variables, para poder imprimirlas por consola
    debemos de hacerlo a través del método println como se puede comprobar
    a continuación
    */
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(variableBooleana);
    System.out.println(nombre);
    
    //Debemos de crear una expresión e imprimirla por pantalla.
    
    expre=a+b/c+1; 
    System.out.println("Expre es igual a " + expre);
    
    /*Ahora debemos de realizar la misma operación pero nos debe de dar 6 
    en vez de 8, para ello, debemos de poner paréntesis para poder dar 
    preferencia en las operaciones a la suma de a+b para luego dividirla.
    */
    
    expre=((a+b)/c+1);

    System.out.println("Expre es igual a " +expre);
    
    }  
}