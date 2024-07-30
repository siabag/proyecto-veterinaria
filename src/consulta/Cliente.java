
package consulta;

import clasespadre.Persona;
import java.util.ArrayList;
import java.util.List;


public class Cliente extends Persona{
    
    private List<Mascota> mascotas;

    public Cliente(long cedula, String nombre, String apellido, int edad) {
        super(cedula, nombre, apellido, edad);
        this.mascotas = new ArrayList<>();
    }
    
    public void addMascota (Mascota mascota){
        getMascota().add(mascota);
        mascota.setCliente(this);
    }
    
    public List<Mascota> getMascota(){
        return mascotas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente:").append("\n");
        sb.append("Cedula: ").append(getCedula()).append("\n");
        sb.append("Nombre: ").append(getNombre()).append("\n");
        sb.append("Apellido: ").append(getApellido()).append("\n");
        sb.append("Edad: ").append(getEdad()).append("\n");
        for(Mascota mascota:mascotas){
            sb.append(mascota).append("\n");
        }
        return sb.toString();
    }
    
    
    
    
}
