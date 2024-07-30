
package Historial;

import consulta.Consulta;
import java.time.LocalDateTime;


public class DetalleClinico {
    
    private LocalDateTime fecha;
    private HistorialClinico historialClinico;
    private Consulta consulta;
    private String descripcion;

    public DetalleClinico(Consulta consulta) {
        this.consulta = consulta;
        this.fecha = consulta.getFecha();
        this.descripcion = consulta.getDescripcion();
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Consulta: ").append(consulta.getIdConsulta()).append("\n");
        sb.append("Descripcion: ").append(descripcion).append("\n");
        return sb.toString();
    }
    
    
    
}
