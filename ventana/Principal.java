/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import empresaAgroalimentaria.Producto;
import empresaAgroalimentaria.ProdFresco;
import empresaAgroalimentaria.ProdCongelado;
import empresaAgroalimentaria.ProdRefrigerado;

import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Producto> lista = new ArrayList<Producto>();
    
    public Principal() {
        initComponents();
        this.setTitle("Verduleria ETB");//Nombre de la ventana perros
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonProductos = new javax.swing.JButton();
        botonClientes = new javax.swing.JButton();
        botonPedidos = new javax.swing.JButton();
        productos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        aggProd = new javax.swing.JButton();
        clientes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        volver1 = new javax.swing.JButton();
        pedidos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        volver2 = new javax.swing.JButton();
        agregarProductos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtFechaVenc = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtLote = new javax.swing.JTextField();
        tipoProd = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFechaEnvasado = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        volver3 = new javax.swing.JButton();
        guardarProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(255, 255, 204));
        contenedor.setLayout(new java.awt.CardLayout());

        menu.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bienvenido al sistema");

        botonProductos.setText("Productos");
        botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosActionPerformed(evt);
            }
        });

        botonClientes.setText("Clientes");
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonPedidos.setText("Pedidos");
        botonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(botonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(208, 208, 208))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(97, 97, 97)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        contenedor.add(menu, "card2");

        productos.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Productos");

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        tablaProductos.setBackground(new java.awt.Color(204, 204, 255));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Tipo", "Precio ($)"
            }
        ));
        jScrollPane4.setViewportView(tablaProductos);

        aggProd.setText("Agregar Producto");
        aggProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productosLayout = new javax.swing.GroupLayout(productos);
        productos.setLayout(productosLayout);
        productosLayout.setHorizontalGroup(
            productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(productosLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel2)
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(productosLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aggProd)
                .addGap(71, 71, 71))
        );
        productosLayout.setVerticalGroup(
            productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver)
                    .addComponent(aggProd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        contenedor.add(productos, "card3");

        clientes.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Clientes");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("en mantenimiento\n");
        jScrollPane1.setViewportView(jTextArea1);

        volver1.setText("Volver");
        volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientesLayout = new javax.swing.GroupLayout(clientes);
        clientes.setLayout(clientesLayout);
        clientesLayout.setHorizontalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesLayout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(326, 326, 326))
            .addGroup(clientesLayout.createSequentialGroup()
                .addGroup(clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientesLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(volver1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clientesLayout.setVerticalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(volver1)
                .addGap(26, 26, 26))
        );

        contenedor.add(clientes, "card4");

        pedidos.setBackground(new java.awt.Color(204, 204, 255));
        pedidos.setForeground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pedidos");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("en mantenimiento\n");
        jScrollPane2.setViewportView(jTextArea2);

        volver2.setText("Volver");
        volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pedidosLayout = new javax.swing.GroupLayout(pedidos);
        pedidos.setLayout(pedidosLayout);
        pedidosLayout.setHorizontalGroup(
            pedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosLayout.createSequentialGroup()
                .addGroup(pedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pedidosLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(pedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(pedidosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(volver2)))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        pedidosLayout.setVerticalGroup(
            pedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(volver2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        contenedor.add(pedidos, "card5");

        agregarProductos.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nuevo Producto para agregar");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Descripcion");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha de Vencimiento");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Lote");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        txtFechaVenc.setBackground(new java.awt.Color(255, 255, 255));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));

        txtLote.setBackground(new java.awt.Color(255, 255, 255));

        tipoProd.setBackground(new java.awt.Color(255, 255, 255));
        tipoProd.setForeground(new java.awt.Color(0, 0, 0));
        tipoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prod. Congelado", "Prod. Fresco", "Prod. Refrigerado" }));
        tipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProdActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fecha Envasado");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Pais de Origen");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cod. Alimenticio");

        txtFechaEnvasado.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaEnvasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEnvasadoActionPerformed(evt);
            }
        });

        txtPais.setBackground(new java.awt.Color(255, 255, 255));
        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Temp. de Congelacion");

        txtTemperatura.setBackground(new java.awt.Color(255, 255, 255));
        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });

        volver3.setText("Volver");
        volver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver3ActionPerformed(evt);
            }
        });

        guardarProd.setText("Guardar");
        guardarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarProductosLayout = new javax.swing.GroupLayout(agregarProductos);
        agregarProductos.setLayout(agregarProductosLayout);
        agregarProductosLayout.setHorizontalGroup(
            agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductosLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(agregarProductosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarProductosLayout.createSequentialGroup()
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(txtFechaVenc)
                            .addComponent(txtPrecio)
                            .addComponent(txtLote))
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agregarProductosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(agregarProductosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaEnvasado)
                            .addComponent(txtPais)
                            .addComponent(txtCodigo)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(agregarProductosLayout.createSequentialGroup()
                        .addComponent(volver3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        agregarProductosLayout.setVerticalGroup(
            agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarProductosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(13, 13, 13)
                .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarProductosLayout.createSequentialGroup()
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(agregarProductosLayout.createSequentialGroup()
                                .addComponent(txtFechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(7, 7, 7)
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(agregarProductosLayout.createSequentialGroup()
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtFechaEnvasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(agregarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volver3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        tipoProd.getAccessibleContext().setAccessibleName("");

        contenedor.add(agregarProductos, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
        contenedor.removeAll();
        contenedor.add(productos);
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_botonProductosActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        contenedor.removeAll();
        contenedor.add(clientes);
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
        contenedor.removeAll();
        contenedor.add(pedidos);
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_botonPedidosActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        contenedor.removeAll();
        contenedor.add(menu);
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_volverActionPerformed

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
        contenedor.removeAll();
        contenedor.add(menu);
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_volver1ActionPerformed

    private void volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver2ActionPerformed
        contenedor.removeAll();
        contenedor.add(menu);
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_volver2ActionPerformed

    private void aggProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggProdActionPerformed
        contenedor.removeAll();
        contenedor.add(agregarProductos);
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_aggProdActionPerformed

    private void tipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProdActionPerformed
 
    }//GEN-LAST:event_tipoProdActionPerformed

    private void txtFechaEnvasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEnvasadoActionPerformed
        if(tipoProd.getSelectedItem()!="Prod. Fresco"){
            txtFechaEnvasado.setEnabled(false);
            txtFechaEnvasado.setEditable(false);
        }
    }//GEN-LAST:event_txtFechaEnvasadoActionPerformed

    private void volver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver3ActionPerformed
        contenedor.removeAll();
        contenedor.add(productos);
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_volver3ActionPerformed

    private void guardarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProdActionPerformed
        
        Producto prod = new Producto();
        
        if(tipoProd.getSelectedItem()=="Prod. Fresco")
            prod = new ProdFresco(txtFechaEnvasado.getText(),txtPais.getText(),txtNombre.getText(),txtDescripcion.getText(),txtFechaVenc.getText(),txtLote.getText(),txtPrecio.getText());
        if(tipoProd.getSelectedItem()=="Prod. Congelado")
            prod = new ProdCongelado(txtTemperatura.getText(),txtNombre.getText(),txtDescripcion.getText(),txtFechaVenc.getText(),txtLote.getText(),txtPrecio.getText());
        if(tipoProd.getSelectedItem()=="Prod. Refrigerado")
            prod = new ProdRefrigerado(txtCodigo.getText(),txtNombre.getText(),txtDescripcion.getText(),txtFechaVenc.getText(),txtLote.getText(),txtPrecio.getText());
        
        lista.add(prod);
        
        //Hace que los paneles se limpien despues de guardar
        txtNombre.setText(""); 
        txtDescripcion.setText("");
        txtFechaVenc.setText("");
        txtLote.setText("");
        txtPrecio.setText("");
        txtTemperatura.setText("");
        txtFechaEnvasado.setText("");
        txtPais.setText("");
        txtCodigo.setText("");
        
        mostrarLista(); //Se invoca para que agregue los productos en la tabla
        
    }//GEN-LAST:event_guardarProdActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        if(tipoProd.getSelectedItem()!="Prod. Fresco"){
            txtPais.setEditable(false);
            txtPais.setEnabled(false);
        }
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        if(tipoProd.getSelectedItem()!="Prod. Refrigerado"){
            txtCodigo.setEnabled(false);
            txtCodigo.setEditable(false);
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaActionPerformed
        if(tipoProd.getSelectedItem()!="Prod. Congelado"){
            txtTemperatura.setEditable(false);
            txtTemperatura.setEnabled(false);
        }
    }//GEN-LAST:event_txtTemperaturaActionPerformed

    //Guarda el producto en una matriz para agregar a la tabla (Falta ordenar la lista alfabeticamente)
    public void mostrarLista(){
        String matriz[][] = new String[lista.size()][3];
        
        for(int i=0;i<lista.size();i++){
            matriz[i][0] = lista.get(i).getNombre();
            if("ProdCongelado".equals(lista.get(i).getClass().getSimpleName())) matriz[i][1] = "Producto Congelado";
            if("ProdRefrigerado".equals(lista.get(i).getClass().getSimpleName())) matriz[i][1] = "Producto Refrigerado";
            if("ProdFresco".equals(lista.get(i).getClass().getSimpleName())) matriz[i][1] = "Producto Fresco";
            matriz[i][2] = lista.get(i).getPrecio();
        }
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Producto", "Tipo", "Precio ($)"
            }
        ));
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggProd;
    private javax.swing.JPanel agregarProductos;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton botonProductos;
    private javax.swing.JPanel clientes;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton guardarProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel pedidos;
    private javax.swing.JPanel productos;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JComboBox<String> tipoProd;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFechaEnvasado;
    private javax.swing.JTextField txtFechaVenc;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JButton volver;
    private javax.swing.JButton volver1;
    private javax.swing.JButton volver2;
    private javax.swing.JButton volver3;
    // End of variables declaration//GEN-END:variables
}