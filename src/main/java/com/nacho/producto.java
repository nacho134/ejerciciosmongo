package com.nacho;

public class producto
{
    private int id;
    private double precio;
    private String descrip;
    private int cantidad;
    public producto() {
    }

    public producto(int id, double precio, String descrip, int cantidad) {
        this.id = id;
        this.precio = precio;
        this.descrip = descrip;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "producto{" +
                "id=" + id +
                ", precio=" + precio +
                ", descrip='" + descrip + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
