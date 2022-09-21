package alejandro_lopez_sanmartino;

import java.io.*;

public class productos {

    private String codProducto;
    private String Nombre;
    private String Cantidad;
    private String Descripcion;
    final String RUTA = "productos.txt";

    public productos() {
    }

    public productos(String codProducto, String nombre, String cantidad, String descripcion) {
        this.codProducto = codProducto;
        this.Nombre = nombre;
        this.Cantidad = cantidad;
        this.Descripcion = descripcion;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String altas() {
        File fichero = new File(RUTA);
        try {
            FileOutputStream fich = new FileOutputStream(fichero, true);
            try (DataOutputStream ou = new DataOutputStream(fich)) {
                ou.writeUTF(codProducto);
                ou.writeUTF(Nombre);
                ou.writeUTF(Cantidad);
                ou.writeUTF(Descripcion);
                ou.close();
                return "Ok";

            }
        } catch (Exception ex) {
            return "Error al grabar" + ex.getMessage();

        }
    }

    public String listado() {
        String cadena = "";

        try {
            File fichero = new File(RUTA);
            DataInputStream io = new DataInputStream(new FileInputStream(fichero));
            codProducto = io.readUTF();
            while (codProducto != null) {
                Nombre = io.readUTF();
                Cantidad = io.readUTF();
                Descripcion = io.readUTF();
                cadena = cadena + System.lineSeparator() + "Codigo de producto: " + codProducto + " Nombre: " + Nombre + "Cantidad: " + Cantidad + "Descripción: " + Descripcion + "\n";
                codProducto = io.readUTF();

            }

            io.close();
        } catch (Exception ex) {
        }
        return cadena;
    }

    public int buscar(String b) {
        int respuesta = 0;

        try {
            File fichero = new File(RUTA);
            DataInputStream io = new DataInputStream(new FileInputStream(fichero));
            codProducto = io.readUTF();
            while (codProducto != null) {
                Nombre = io.readUTF();
                Cantidad = io.readUTF();
                Descripcion = io.readUTF();
                if (codProducto.equals(b) || respuesta != 0) {
                    respuesta = 1;
                    break;
                }
                codProducto = io.readUTF();

            }

            io.close();
        } catch (Exception ex) {
        }
        return respuesta;
    }

}
