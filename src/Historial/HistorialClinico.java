
package Historial;

import consulta.Mascota;
import java.util.ArrayList;
import java.util.List;


public class HistorialClinico {
    
    private long nReferencia;
    private Mascota mascota;
    private List<DetalleClinico> detallesH;
    
    public HistorialClinico (DetalleClinico detalleClinico){
        this.nReferencia = detalleClinico.getConsulta().getMascota().getIdMascota();
        this.mascota = detalleClinico.getConsulta().getMascota();
        this.detallesH = new ArrayList<>();
        addDetalle(detalleClinico);
    }
    
    private void addDetalle(DetalleClinico detalleClinico){
        this.detallesH.add(detalleClinico);
        detalleClinico.setHistorialClinico(this);
    }

    public long getnReferencia() {
        return nReferencia;
    }

    public void setnReferencia(long nReferencia) {
        this.nReferencia = nReferencia;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public List<DetalleClinico> getDetallesH() {
        return detallesH;
    }

    public void setDetallesH(List<DetalleClinico> detallesH) {
        this.detallesH = detallesH;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Historial Clinico:").append("\n");
        sb.append("Referencia: ").append(nReferencia).append("\n");
        sb.append("Mascota: ").append(mascota.getNombre()).append("\n");
        sb.append("Cliente: ").append(mascota.getCliente().getNombre()).append("\n");
        sb.append("Detalles:").append("\n");
        for(DetalleClinico detalle: detallesH){
            sb.append("\n").append(detalle);
        }
        return sb.toString();
    }
    
    
}
