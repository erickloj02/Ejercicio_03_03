
package modelo;

public class Producto {
    
    private String tipoProducto;
    private String nombreProducto;
    private double precioProducto;
    private boolean estadoProducto;
    private int yearFabricacion;
    
    public Producto (String tipoProducto, String nombreProducto, double precioProducto, 
                     boolean estadoProducto, int yearFabricacion){
    
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.estadoProducto = estadoProducto;
        this.yearFabricacion = yearFabricacion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public boolean isEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }

    public String validarTipoProducto(){
        var retorno="TBD";
        var producto=this.tipoProducto.charAt(0);
        switch(producto)
        {
           case 'V':
           retorno="Vegetales";
           break;
           case 'C':
           retorno="Carnes";
           break;
           case 'F':
           retorno="Frutas";
           break;
           case 'G':
           retorno="Golosinas";
           break;
           case 'B':
           retorno="Bebidas";
           break;
        }
        return retorno;
    }
    
    public int calcularDurabilidadProducto (int yearExpedicion){    
         var retorno= 10;
         retorno= yearExpedicion - this.yearFabricacion;
         return retorno;
    } 

    @Override
    public String toString() {
        return "Producto{" + "tipoProducto=" + tipoProducto 
               + ", nombreProducto=" + nombreProducto + ", precioProducto=" 
                + precioProducto + ", estadoProducto=" + estadoProducto 
                + ", yearFabricacion=" + yearFabricacion + '}';
    } 
}
