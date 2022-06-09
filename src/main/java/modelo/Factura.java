
package modelo;

public class Factura {
    
    private int fecha;
    private String nombreCliente;
    private String productoComprado;
    private int cantidadProducto; 
    private int yearFacturaRecibida;

    public Factura (int fecha, String nombreCliente, String productoComprado, 
                    int cantidadProducto, int yearFacturaRecibida){
        
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.productoComprado = productoComprado;
        this.cantidadProducto = cantidadProducto;
        this.yearFacturaRecibida = yearFacturaRecibida;
    }

    public Factura(Integer valueOf, String param, String param0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProductoComprado() {
        return productoComprado;
    }

    public void setProductoComprado(String productoComprado) {
        this.productoComprado = productoComprado;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getYearFacturaRecibida() {
        return yearFacturaRecibida;
    }

    public void setYearFacturaRecibida(int yearFacturaRecibida) {
        this.yearFacturaRecibida = yearFacturaRecibida;
    }
    
    public String verificarFecha(){
     var retorno= " ";
      
        if (this.yearFacturaRecibida>=2017 && this.yearFacturaRecibida<= 2022){    
          retorno= "Compra Reciente"; 
        }else if (this.yearFacturaRecibida>2010 && this.yearFacturaRecibida<2017){
          retorno= "Compra Antigua";
        }
        return retorno;   
    } 
    
    public String verificarCantidadProducto(){
     var retorno= " ";
      
      if (this.cantidadProducto>=5 && this.cantidadProducto<= 30){  
          retorno= "Cantidad de Productos Extensa"; 
        }else if (this.cantidadProducto>=1 && this.yearFacturaRecibida<5){
          retorno= "Cantidad de Productos Reducido";
        }
        return retorno;   
    } 

    @Override
    public String toString() {
        return "Factura{" + "fecha=" + fecha + ", nombreCliente=" 
                + nombreCliente + ", productoComprado=" + productoComprado 
                + ", cantidadProducto=" + cantidadProducto 
                + ", yearFacturaRecibida=" + yearFacturaRecibida + '}';
    }
}
