package Proyecto_Terminado;

import java.util.UUID;

public class Transaccion {
    private String idTransaccion;
    private String fecha;
    private String tipo;
    private int monto;
    private String cuentaDestino;
    private TarjetaDebito cliente;

    public Transaccion(String fecha, String tipo, int monto) {
        this.idTransaccion = generarIdUnicoTransaccion();
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
    }


    private String generarIdUnicoTransaccion() {
        return UUID.randomUUID().toString();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        tipo = tipo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public TarjetaDebito getCliente() {
        return cliente;
    }

    public void setCliente(TarjetaDebito cliente) {
        this.cliente = cliente;
    }

    public String imprimirTicketRetiro() {
        return "----------------Ticket------------------" +
                "\nCliente:'" + this.cliente.getCliente().getNombre()+
                "\nTarjeta:"+this.cliente.getNumTarjeta()+
                "\nBanco:" + this.cliente.getCliente().getBanco() +
                "\nTipo:'" + this.tipo +
                "\nMonto=" + this.monto;
    }
}
