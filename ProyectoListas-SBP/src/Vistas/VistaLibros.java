/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.ListaLibro;
import controlador.Libro;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.ScrollPane;

/**
 *
 * @author Zamuel
 */
public class VistaLibros extends javax.swing.JFrame {
    private ListaLibro listaLibro;
    
    
    public void setLocationRelativeto(Component c){
        super.setLocationRelativeTo(c);
    }
    
    public VistaLibros() {
        this.setTitle("Gestión de Libros");
        initComponents();
        listaLibro = new ListaLibro();
        panel.setViewportView(new PanelDibujoLibros(listaLibro.size(), "geee", listaLibro));
        setLocationRelativeTo(this);
    }
    

    public void establecerClienteInicio(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de nodo a ingresar")) ;
        Libro lib = new Libro (CodigoLibro.getText(),NombreLibro.getText(),Editorial.getText(),Autor.getText(),Genero.getSelectedItem().toString());
        listaLibro.insertarInicio(lib, valor);
        JOptionPane.showMessageDialog(null,"Se agregó un elemento a la lista");
        CodigoLibro.setText(null);
        NombreLibro.setText(null);
        Editorial.setText(null);
        Autor.setText(null);
        Genero.setSelectedItem(null);
        panel.setViewportView(new PanelDibujoLibros(listaLibro.size(), "", listaLibro));
        
     }
    
    public void buscar(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave de nodo a buscar")) ;
        if(listaLibro.buscar(valor)!= null)
        JOptionPane.showMessageDialog(null,listaLibro.buscar(valor).dato );
        else
            JOptionPane.showMessageDialog(null,"El elemento no existe" );
    }
    
    public void buscarLibro(){
        String NombreLibro =JOptionPane.showInputDialog("Ingrese Nombre del Libro a buscar") ;
        if(listaLibro.buscarDato(NombreLibro) != null)
        JOptionPane.showMessageDialog(null,listaLibro.buscarDato(NombreLibro).dato);
        else
            JOptionPane.showMessageDialog(null,"elemento no existe" );
    }
    
    
    
    public void mostrar(){
        jTextArea1.setText(listaLibro.print());
        panel.setViewportView(new PanelDibujoLibros(listaLibro.size(), "", listaLibro));
    }
    //Eliminar por clave
    public void eliminar(){
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave de elemento a eliminar:")) ;
        listaLibro.eliminarNodoClave(valor);
        panel.setViewportView(new PanelDibujoLibros(listaLibro.size(), "", listaLibro));
         JOptionPane.showMessageDialog(null, "Se eliminó el elemento");
    }
    
    public void eliminar2(){
        listaLibro.eliminarLista();
        
        panel.setViewportView(new PanelDibujoLibros(listaLibro.size(), "", listaLibro));
        JOptionPane.showMessageDialog(null, "Lista Eliminada");
    }
    

    
    
    public void operacioneComboBox() {
        if (menuoperaciones.getSelectedItem().equals("Eliminar Elemento")) {
            eliminar();
           
        } 
        if(menuoperaciones.getSelectedItem().equals("Eliminar Lista")){
            eliminar2();
            
        }
        
        if (menuoperaciones.getSelectedItem().equals("Eliminar Inicio")) {
            listaLibro.eliminarInicio();
            panel.setViewportView(new PanelDibujoLibros(listaLibro.size(), "", listaLibro));
           
        }
        if (menuoperaciones.getSelectedItem().equals("Eliminar Final")) {
            listaLibro.eliminarFinal();
           panel.setViewportView(new PanelDibujoLibros(listaLibro.size(), "", listaLibro));
        }

        if(menuoperaciones.getSelectedItem().equals("Insertar Elemento")){
            establecerClienteInicio();
            
        }
        
        if(menuoperaciones.getSelectedItem().equals("Contar Elementos")){
            JOptionPane.showMessageDialog(null, "El tamaño de la lista es:" + (listaLibro.size()));
        }
        
        if(menuoperaciones.getSelectedItem().equals("Modificar Elemento")){
            int valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave del elemento a modificar"));
            Libro lib = new Libro (CodigoLibro.getText(),NombreLibro.getText(),Editorial.getText(),Autor.getText(),Genero.getSelectedItem().toString());
            listaLibro.modificar(valor, lib);
            panel.setViewportView(new PanelDibujoLibros(listaLibro.size(), "", listaLibro));
        }
        
        if(menuoperaciones.getSelectedItem().equals("Buscar por Nombre del Libro")){
            
            buscarLibro();
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodigoLibro = new javax.swing.JTextField();
        Editorial = new javax.swing.JTextField();
        NombreLibro = new javax.swing.JTextField();
        Genero = new javax.swing.JComboBox();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        mostrar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        menuoperaciones = new javax.swing.JComboBox();
        calcular = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panel = new javax.swing.JScrollPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Autor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        CodigoLibro.setToolTipText("Dijita el Código del Libro");
        CodigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoLibroActionPerformed(evt);
            }
        });

        Editorial.setToolTipText("Dijita la Editorial");
        Editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialActionPerformed(evt);
            }
        });

        NombreLibro.setToolTipText("Dijita el Nombre del Libro");
        NombreLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreLibroActionPerformed(evt);
            }
        });

        Genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terror", "Comedia", "Novela", " ", " " }));
        Genero.setToolTipText("Selecciona el Género del Libro");
        Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.setToolTipText("Busca por clave de el nodo");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        mostrar.setText("Mostrar");
        mostrar.setToolTipText("Muestra los nodos Ingresados");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar");
        jButton6.setToolTipText("Limpia la tabla de Nodos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.setToolTipText("Sale del Sistema");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        menuoperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insertar Elemento", "Modificar Elemento", "Buscar por Nombre del Libro", "Contar Elementos", "Eliminar Elemento", "Eliminar Inicio", "Eliminar Final", "Eliminar Lista", " " }));
        menuoperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuoperacionesActionPerformed(evt);
            }
        });

        calcular.setText("Aceptar");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel1.setText("* Código del Libro:");

        jLabel2.setText("* Editorial:");

        jLabel3.setText("* Nombre del Libro:");

        jLabel4.setText("* Género:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Gestión de Libros");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(202, 37, 37));
        jLabel7.setText("Grafico:");

        Autor.setToolTipText("Dijita el Nombre Del Autor");
        Autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorActionPerformed(evt);
            }
        });

        jLabel8.setText("* Autor:");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Campos marcados con asterisco (*) son obligatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(NombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mostrar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(salir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(buscar))))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuoperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscar)
                        .addGap(68, 68, 68)
                        .addComponent(mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(salir))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuoperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoLibroActionPerformed

    private void menuoperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuoperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuoperacionesActionPerformed

    private void EditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditorialActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_mostrarActionPerformed

   //limpiar
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        if (CodigoLibro.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa el Código del Libro");
        } else if (NombreLibro.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa el Nombre del Libro");
        } else if (Autor.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa el Autor");
        } else if (Genero.getSelectedItem().toString().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa el Género");
        } else if (Editorial.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa la Editorial");
        } else {
            operacioneComboBox();
        }

    }//GEN-LAST:event_calcularActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroActionPerformed
        // TODO ad your handling code here:
    }//GEN-LAST:event_GeneroActionPerformed

    private void AutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorActionPerformed

    private void NombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreLibroActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLibros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Autor;
    private javax.swing.JTextField CodigoLibro;
    private javax.swing.JTextField Editorial;
    private javax.swing.JComboBox Genero;
    private javax.swing.JTextField NombreLibro;
    private javax.swing.JButton buscar;
    private javax.swing.JToggleButton calcular;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox menuoperaciones;
    private javax.swing.JButton mostrar;
    private javax.swing.JScrollPane panel;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
