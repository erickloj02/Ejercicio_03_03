
package controlador;

import java.util.List;
import modelo.Factura;

public class FacturaControl {
    private final FacturaControl facturaServicio = new FacturaControl();
    
    public Factura crear(String [] params){
        var factura = new Factura (Integer.valueOf(params[0]),params[1],params[2]);
        this.facturaServicio.crear(factura);
        return factura;
    }
    
    public List<Factura> listar()
    {
        return this.facturaServicio.listar();
    }

    private void crear(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
