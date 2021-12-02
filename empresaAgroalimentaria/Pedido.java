
package empresaAgroalimentaria;

public class Pedido {
    private int cantProd;
    private String fechaPedido;
    private String fechaEntrega;
    private double montoPago;

    public Pedido(int cantProd, String fechaPedido, String fechaEntrega, double montoPago) {
        this.cantProd = cantProd;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.montoPago = montoPago;
    }
    
    public Pedido() {
        this.cantProd = 0;
        this.fechaPedido = "";
        this.fechaEntrega = "";
        this.montoPago = 0;
    }

    public int getCantProd() {
        return cantProd;
    }

    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    
    void imprimirPedido(){
        System.out.println("Cantidad de productos:"+cantProd);
        System.out.println("Fecha de pedido: ");
        System.out.println("Fecha de entrega: ");
        System.out.println("Monto a pagar: ");
    }
}