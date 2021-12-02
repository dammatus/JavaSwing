/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresaAgroalimentaria;

public class Producto {
    private String nombre;
    private String descripcion;
    private String fecha; //DD/MM/AAAA 
    private String lote;
    private String precio;

    public Producto(String nombre, String descripcion, String fecha, String lote, String precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lote = lote;
        this.precio = precio;
    }
    public Producto() {
        this.nombre = "";
        this.descripcion = "";
        this.fecha = ""; 
        this.lote = "";
        this.precio = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void imprimirProducto(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Caduca: ");
        System.out.println("Lote: "+lote);
        System.out.println("Precio: "+precio);
    }
}