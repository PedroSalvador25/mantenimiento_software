package Proyecto_Terminado;

public interface Cuenta {
    String getTipo();
    Cliente getCliente();
    String getNumeroCuenta();
    int getSaldo();
    void setSaldo(int saldo);
}
