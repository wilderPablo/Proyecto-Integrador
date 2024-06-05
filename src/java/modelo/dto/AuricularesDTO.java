/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

/**
 *
 * @author user
 */
public class AuricularesDTO {
     private int IdProducto;
    private String Marca;
    private String Modelo;
    private String NumeroParte;
    private String Color;
    private String Iluminacion;
    private String PatronPolarDelMicrofono;
    private float CalidadDeAudio;
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

    public String getNumeroParte() {
        return NumeroParte;
    }

    public void setNumeroParte(String numeroParte) {
        NumeroParte = numeroParte;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getIluminacion() {
        return Iluminacion;
    }

    public void setIluminacion(String iluminacion) {
        Iluminacion = iluminacion;
    }

    public String getPatronPolarDelMicrofono() {
        return PatronPolarDelMicrofono;
    }

    public void setPatronPolarDelMicrofono(String patronPolarDelMicrofono) {
        PatronPolarDelMicrofono = patronPolarDelMicrofono;
    }

    public float getCalidadDeAudio() {
        return CalidadDeAudio;
    }

    public void setCalidadDeAudio(float calidadDeAudio) {
        CalidadDeAudio = calidadDeAudio;
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
