package Proyecto_Terminado;

public class CuentaAhorro implements Cuenta{
    private String tipo;
    private Cliente cliente;
    private String numeroCuenta;
    private int saldo;

    public CuentaAhorro(Cliente cliente, String numeroCuenta, int saldo) {
        this.tipo = "Cuenta de Ahorro";
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tipo='" + tipo + '\'' +
                ", cliente=" + cliente +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
