
package servicio;

import java.util.ArrayList;
import modelo.Factura;
import java.util.List;

public class FacturaServicio  implements IFacturaServicio{
    
    private final List<Factura> facturaList = new ArrayList<>();

    @Override
    public Factura crear(Factura factura) {
       this.facturaList.add(factura);
        return factura;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }
}
