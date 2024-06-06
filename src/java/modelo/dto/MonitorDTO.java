package modelo.dto;

public class MonitorDTO {

    private int idProducto;
    private String marca;
    private String modelo;
    private int tamaño;
    private int tasaderefresco;
    private String tipodepanel;
    private String gamadecolores;
    private String profundidaddecolor;
    private String nombre;
    private double precio;
    private String imagen;
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTasaderefresco() {
        return tasaderefresco;
    }

    public void setTasaderefresco(int tasaderefresco) {
        this.tasaderefresco = tasaderefresco;
    }

    public String getTipodepanel() {
        return tipodepanel;
    }

    public void setTipodepanel(String tipodepanel) {
        this.tipodepanel = tipodepanel;
    }

    public String getGamadecolores() {
        return gamadecolores;
    }

    public void setGamadecolores(String gamadecolores) {
        this.gamadecolores = gamadecolores;
    }

    public String getProfundidaddecolor() {
        return profundidaddecolor;
    }

    public void setProfundidaddecolor(String profundidaddecolor) {
        this.profundidaddecolor = profundidaddecolor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
