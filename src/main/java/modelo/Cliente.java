
package modelo;

public class Cliente {
    
    private String nombre;
    private int yearNacimiento;
    private String ciudadania;
    private String direccion;
    private int telefono;
    
    public Cliente (String nombre, int yearNacimiento, String ciudadania, 
                    String direccion, int telefono) {
        
        this.nombre = nombre;
        this.yearNacimiento = yearNacimiento;
        this.ciudadania = ciudadania;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public String getCiudadania() {
        return ciudadania;
    }

    public void setCiudadania(String ciudadania) {
        this.ciudadania = ciudadania;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String verificarCiudadania(){
        var retorno="";
        var tipoCiudadania=this.ciudadania.charAt(0);
        switch(tipoCiudadania)
        {
            case 'E':
            retorno="Ecuatoriana";
            break;
            case 'A':
            retorno="Argentina";
            break;
            case 'V':
            retorno="Venezolana";
            break;
            case 'P':
            retorno="Peruana";
            break;
            case 'M':
            retorno="Mexicana";
            break;
        }
        return retorno;
    }
    
    public int calcularEdad(int yearActual){    
         var retorno= 100;
         retorno= yearActual-this.yearNacimiento;
         return retorno;
    } 

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", yearNacimiento=" 
                + yearNacimiento + ", ciudadania=" + ciudadania + ", direccion=" 
                + direccion + ", telefono=" + telefono + '}';
    }
}
