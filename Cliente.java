package Proyecto_Terminado;

import java.util.UUID;

public class Cliente {
    private String identificador;
    private String nombre;
    private String direccion;
    private String banco;

    public Cliente(String nombre, String direccion, String banco) {
        this.banco = banco;
        this.identificador = generarIdUnico();;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    private String generarIdUnico() {
        return UUID.randomUUID().toString();
    }

    public String getIdentificador() {
        return identificador;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getBanco() {return banco;}
    public void setBanco(String banco) {this.banco = banco;}

    @Override
    public String toString() {
        return "Cliente{" +
                "identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", banco='" + banco + '\'' +
                '}';
    }
}
