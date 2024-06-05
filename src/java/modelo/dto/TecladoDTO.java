/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

/**
 *
 * @author user
 */
public class TecladoDTO {
 private int IdProducto;
    private String Marca;
    private String Modelo;
    private String TipoDeTeclado;
    private String FactorDeForma;
    private String SwitchType;
    private int CantidadDeTeclas;
    private String Nombre;
     private double precio;
    private String imagen;

    // Getters y Setters
    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getTipoDeTeclado() {
        return TipoDeTeclado;
    }

    public void setTipoDeTeclado(String tipoDeTeclado) {
        TipoDeTeclado = tipoDeTeclado;
    }

    public String getFactorDeForma() {
        return FactorDeForma;
    }

    public void setFactorDeForma(String factorDeForma) {
        FactorDeForma = factorDeForma;
    }

    public String getSwitchType() {
        return SwitchType;
    }

    public void setSwitchType(String switchType) {
        SwitchType = switchType;
    }

    public int getCantidadDeTeclas() {
        return CantidadDeTeclas;
    }

    public void setCantidadDeTeclas(int cantidadDeTeclas) {
        CantidadDeTeclas = cantidadDeTeclas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }   

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
