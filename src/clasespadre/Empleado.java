
package clasespadre;


public abstract class Empleado extends Persona implements IAcciones{
    
    private double sueldo;

    public Empleado(long cedula, String nombre, String apellido, int edad, double sueldo) {
        super(cedula, nombre, apellido, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
        
    
}
