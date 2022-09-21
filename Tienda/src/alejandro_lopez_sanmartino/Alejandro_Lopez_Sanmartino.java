
package alejandro_lopez_sanmartino;


public class Alejandro_Lopez_Sanmartino {

   
    public static void main(String[] args) {
        
        productos p =new productos ("1111", "1111", "1111","1111");
        p.altas();
        
        
        productos p2=new productos ();
        p2.setCodProducto("1111");
        p2.setNombre("1111");
        p2.setCantidad("1111");
        p2.setDescripcion("1111");
        p2.altas();
        
        
        String imprimir=p.listado();
        System.out.println(imprimir);
    }
    
}
