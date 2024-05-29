package Proyecto_Terminado;
import Proyecto_Terminado.Operaciones.Consulta;
import Proyecto_Terminado.Operaciones.Deposito;
import Proyecto_Terminado.Operaciones.Retiro;
import Proyecto_Terminado.Operaciones.Transferencia;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;
public abstract class Clase_Abstractaa {
    //2. AÑADIMOS LAS VARIABLES idTransaccion, fecha, tipoTransaccion, cuentaDestino y un metodo para desvolver el id y fecha
    protected int transacciones, retiro, deposito, transferencia;
    private static int saldo;
    protected String idTransaccion;
    protected String fecha;
    protected String tipoTransaccion;
    protected String cuentaDestino;


    //3.AÑADIMOS LA VARIABLE TARJETA DE DEBITO Y UN METODO
    protected TarjetaDebito tarjetaDebito;

    public Clase_Abstractaa(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public Clase_Abstractaa() {
        this.idTransaccion = UUID.randomUUID().toString();
        this.fecha = String.valueOf(LocalDate.now());
    }

    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        String Nombre = "";
        LocalDate fechaActual = LocalDate.now();
        do {
            do {
                System.out.println(" Buenas tardes que operacion desea realizar");
                System.out.println("Fecha:"+fechaActual);
                System.out.println(" Porfavor seleccione una opción:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Hacer una transferencia");
                System.out.println("    4. Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("=================================================");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("=================================================");
                }
            } while (bandera == 0);
            
            if(seleccion == 1){
            	Clase_Abstractaa mensajero = new Consulta();
            }else if(seleccion == 2){
            	Clase_Abstractaa mensajero = new Retiro();
                mensajero.Retirar(tarjetaDebito.getCuenta(),"Retiro",retiro);
            } else if(seleccion == 3){
            	Clase_Abstractaa mensajero = new Transferencia();
                //mensajero.Transacciones();
            } else if(seleccion == 4){
                System.out.println("==========================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("==========================");
                bandera = 2;
            }
        } while (bandera != 2);
    }

	public void defineRetiro(){
        retiro = entrada.nextInt();
    }


    public abstract void Transacciones();

    public abstract void Retirar(Cuenta cuenta, String tipo, int monto);




    public void Deposito(){
        deposito = entrada.nextInt();
    }
    public void Transferencia(){
        transferencia = entrada.nextInt();
    }


    public int getSaldo(){
        return saldo;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
        setSaldo(tarjetaDebito.getCuenta().getSaldo());
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
}
