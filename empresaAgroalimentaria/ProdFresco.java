/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresaAgroalimentaria;

public class ProdFresco extends Producto {
    private String fechaEnvasado;//Ver tambien
    private String paisOrigen;

    public ProdFresco(String fechaEnvasado, String paisOrigen, String nombre, String descripcion, String fecha, String lote, String precio) {
        super(nombre, descripcion, fecha, lote, precio);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public ProdFresco() {
        super();
        this.fechaEnvasado = "";
        this.paisOrigen = "";
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
    
    public void imprimirProdFresco(){
        super.imprimirProducto();
        System.out.println("Fecha de envasado: "+fechaEnvasado);
        System.out.println("Pais de Origen: "+paisOrigen);
    }
}
