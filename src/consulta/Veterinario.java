
package consulta;

import clasespadre.Empleado;
import java.util.ArrayList;
import java.util.List;


public class Veterinario extends Empleado{
    
    private String especialidad;
    private List<Consulta> consultas;

    public Veterinario(long cedula, String nombre, String apellido, int edad, double sueldo, String especialidad) {
        super(cedula, nombre, apellido, edad, sueldo);
        this.especialidad = especialidad;
        this.consultas = new ArrayList<>();
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
       
    @Override
    public void calcularSueldo(){
        int contador = 0;
        for(Consulta consulta: consultas){
            contador += 1;
        }
        setSueldo(getSueldo()+(25000*contador));
        System.out.println("El sueldo del veterinario es: " + getSueldo());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veterinario:").append("\n");
        sb.append("Cedula: ").append(getCedula()).append("\n");
        sb.append("Nombre: ").append(getNombre()).append("\n");
        sb.append("Apellido: ").append(getApellido()).append("\n");
        sb.append("Edad: ").append(getEdad()).append("\n");
        sb.append("Sueldo: ").append(getSueldo()).append("\n");
        sb.append("Especialidad: ").append(getEspecialidad()).append("\n");
        sb.append("Consultas:").append("\n");
        for(Consulta consulta:consultas){
            sb.append(consulta).append("\n");
        }
        return sb.toString();
    }
    
    
    
    
}
