package registroproductos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;



public class Registroproductos {

    
 public static void main(String[] args) {
     
      productos p =new productos ("1111", "1111", "1111","1111");
        p.altas();
        
        
        productos p1=new productos ();
        p1.setCodProducto("1111");
        p1.setNombre("1111");
        p1.setCantidad("1111");
        p1.setDescripcion("1111");
        p1.altas();
        
        
        String imprimir=p.listado();
        System.out.println(imprimir);
 }}