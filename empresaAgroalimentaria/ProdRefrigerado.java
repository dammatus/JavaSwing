/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresaAgroalimentaria;

public class ProdRefrigerado extends Producto {
    private String codAlimenticio;

    public ProdRefrigerado(String codAlimenticio, String nombre, String descripcion, String fecha, String lote, String precio) {
        super(nombre, descripcion, fecha, lote, precio);
        this.codAlimenticio = codAlimenticio;
    }
    public ProdRefrigerado() {
        super();
        this.codAlimenticio = "";
    }

    public String getCodAlimenticio() {
        return codAlimenticio;
    }

    public void setCodAlimenticio(String codAlimenticio) {
        this.codAlimenticio = codAlimenticio;
    }

  
    public void imprimirProdRefrigerado(){
        super.imprimirProducto();
        System.out.println("Codigo de Supervision alimenticio: "+codAlimenticio);
    }
}