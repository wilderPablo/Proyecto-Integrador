/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

/**
 *
 * @author user
 */
public class MouseDTO {
  
    private int IdProducto;
    private String Nombre;
    private String Marca;
    private String Modelo;
    private String NumeroParte;
    private String Iluminacion;
    private String Color;
    private int NumeroDeBotones;
    private String SensorYTipo;
    private double precio;
    private String imagen; 

    // Getters y Setters
    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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

    public String getNumeroParte() {
        return NumeroParte;
    }

    public void setNumeroParte(String numeroParte) {
        NumeroParte = numeroParte;
    }

    public String getIluminacion() {
        return Iluminacion;
    }

    public void setIluminacion(String iluminacion) {
        Iluminacion = iluminacion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getNumeroDeBotones() {
        return NumeroDeBotones;
    }

    public void setNumeroDeBotones(int numeroDeBotones) {
        NumeroDeBotones = numeroDeBotones;
    }

    public String getSensorYTipo() {
        return SensorYTipo;
    }

    public void setSensorYTipo(String sensorYTipo) {
        SensorYTipo = sensorYTipo;
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
