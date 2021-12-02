/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresaAgroalimentaria;

public class ProdCongelado extends Producto {
    private String temperatura;

    public ProdCongelado(String temperatura, String nombre, String descripcion, String fecha, String lote, String precio) {
        super(nombre, descripcion, fecha, lote, precio);
        this.temperatura = temperatura;
    }
    public ProdCongelado() {
        super();
        this.temperatura = "";
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    
    public void imprimirProdFresco(){
        super.imprimirProducto();
        System.out.println("Temperatura de congelacion: "+temperatura);
    }
}
