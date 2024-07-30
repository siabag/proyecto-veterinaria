
package factura;

import consulta.Consulta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    
    private LocalDate fecha;
    private long nReferencia;
    private Consulta consulta;
    private double precioTotal = 20000; //Valor de la consulta
    private List<DetalleFactura> detallesFacturas;

    public Factura(long nReferencia, Consulta consulta) {
        this.nReferencia = nReferencia;
        this.consulta = consulta;
        this.fecha = LocalDate.now();
        this.detallesFacturas = new ArrayList<>();
    }
    
    //Metodo para añadir detalles
    public void addDetallesFactura(DetalleFactura detalleFactura){
        detallesFacturas.add(detalleFactura);
        detalleFactura.setFactura(this);
        AumentarPrecioTotal(detalleFactura.getPrecioDetalle());
    }
    
    public void AumentarPrecioTotal(double precioDetalle){
        this.precioTotal += precioDetalle;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public long getnReferencia() {
        return nReferencia;
    }

    public void setnReferencia(long nReferencia) {
        this.nReferencia = nReferencia;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public List<DetalleFactura> getDetallesFacturas() {
        return detallesFacturas;
    }

    public void setDetallesFacturas(List<DetalleFactura> detallesFacturas) {
        this.detallesFacturas = detallesFacturas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura:").append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Referencia: ").append(getnReferencia()).append("\n");
        sb.append("Detalles de Factura: ").append("\n");
        for(DetalleFactura detalle: detallesFacturas){
            sb.append(detalle).append("\n");
        }
        sb.append("\n");
        sb.append("Precio Consulta: ").append("20000").append("\n");
        sb.append("Precio Total: ").append(precioTotal).append("\n");
        return sb.toString();
    }
    
    
}
