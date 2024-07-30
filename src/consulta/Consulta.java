
package consulta;

import factura.Factura;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Consulta {
    
    private LocalDateTime fecha;
    private long idConsulta;
    private Veterinario veterinario;
    private Mascota mascota;
    private String descripcion;
    private Factura factura;

    public Consulta(long idConsulta, String descripcion) {
        this.idConsulta = idConsulta;
        this.descripcion = descripcion;
    }

    public Consulta(int anio, int mes, int dia, int hora,
            int minuto, long idConsulta, String descripcion){
        this.fecha = LocalDateTime.of(anio,mes,dia,hora,minuto);
        this.idConsulta = idConsulta;
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    public void relacionConObjetos(Mascota mascota, Veterinario veterinario){
        //Asigna una nueva consulta a mascota
        mascota.getConsultas().add(this);
        
        //Asigna una mascota a la consulta
        setMascota(mascota);
        
        veterinario.getConsultas().add(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Consulta:").append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Veterinario: ").append(veterinario).append("\n");
        sb.append("IdMascota: ").append(idConsulta).append("\n");
        sb.append("Descripcion: ").append(descripcion).append("\n");
        sb.append("Factura: ").append(factura).append("\n");
        return sb.toString();
    }
    
}
