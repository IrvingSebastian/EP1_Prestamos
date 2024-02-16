package VENTANAS;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * @author Señor 51
 */
public class JFormularioPrincipal extends javax.swing.JFrame {
    
    // Variables a usar
    DefaultTableModel tablaa;
    public String nombre;
    public double monto, sema, intsema, mens, intmens, anua, intanua; // Montos e intereses
    public double desema, pagsema, desmens, pagmens, desanual, paganual; // Descuentos y pagos
    Boolean tabla;
    
    public JFormularioPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); // Poner formulario al centro
        
        jpl_tramite.setVisible(false); // Ocultar ciertos controles
        jtxa_info.setVisible(false);
        
        jpl_tabla.setVisible(false);
        
        jmn_tabla.setEnabled(false);
        
        tablaa = new DefaultTableModel();
        tablaa.addColumn("Pago Con Intereses");
        tablaa.addColumn("Intereses con Descuento");
        tablaa.addColumn("Pago Con Descuento");
        this.jtbl_tabla.setModel(tablaa);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtg_periodos = new javax.swing.ButtonGroup();
        jlbl_titulo = new javax.swing.JLabel();
        jifm_menu = new javax.swing.JInternalFrame();
        jmnb_menu = new javax.swing.JMenuBar();
        jmn_tramite = new javax.swing.JMenu();
        jmn_tabla = new javax.swing.JMenu();
        jpl_tramite = new javax.swing.JPanel();
        jlbl_nombre = new javax.swing.JLabel();
        jtxf_nombre = new javax.swing.JTextField();
        jlbl_monto = new javax.swing.JLabel();
        jtxf_monto = new javax.swing.JTextField();
        jbtn_tramitar = new javax.swing.JButton();
        jrbt_mensual = new javax.swing.JRadioButton();
        jrbt_semanal = new javax.swing.JRadioButton();
        jrbt_anual = new javax.swing.JRadioButton();
        jlbl_periodo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxa_info = new javax.swing.JTextArea();
        jpl_tabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_tabla = new javax.swing.JTable();
        jlbl_tabla = new javax.swing.JLabel();
        jbtn_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_titulo.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 24)); // NOI18N
        jlbl_titulo.setText("BIENVENID@ A PRÉSTAMOS \"ESTAFMEX\"");

        jifm_menu.setBackground(new java.awt.Color(204, 204, 255));
        jifm_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jifm_menu.setVisible(true);

        jmnb_menu.setBackground(new java.awt.Color(204, 204, 255));
        jmnb_menu.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 12)); // NOI18N

        jmn_tramite.setText("TramitE DE PréstAmo");
        jmn_tramite.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jmn_tramite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmn_tramiteMouseClicked(evt);
            }
        });
        jmnb_menu.add(jmn_tramite);

        jmn_tabla.setText("TABLA DE AMORTIZACIÓN");
        jmn_tabla.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jmn_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmn_tablaMouseClicked(evt);
            }
        });
        jmnb_menu.add(jmn_tabla);

        jifm_menu.setJMenuBar(jmnb_menu);

        javax.swing.GroupLayout jifm_menuLayout = new javax.swing.GroupLayout(jifm_menu.getContentPane());
        jifm_menu.getContentPane().setLayout(jifm_menuLayout);
        jifm_menuLayout.setHorizontalGroup(
            jifm_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifm_menuLayout.setVerticalGroup(
            jifm_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jpl_tramite.setBackground(new java.awt.Color(204, 255, 153));
        jpl_tramite.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbl_nombre.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jlbl_nombre.setText("Ingrese su nombre:");

        jtxf_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jlbl_monto.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jlbl_monto.setText("Ingrese el monto del préstamo:");

        jtxf_monto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jbtn_tramitar.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jbtn_tramitar.setText("Tramitar Préstamo");
        jbtn_tramitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_tramitarActionPerformed(evt);
            }
        });

        jrbt_mensual.setBackground(new java.awt.Color(204, 255, 153));
        jbtg_periodos.add(jrbt_mensual);
        jrbt_mensual.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jrbt_mensual.setText("Mensual");

        jrbt_semanal.setBackground(new java.awt.Color(204, 255, 153));
        jbtg_periodos.add(jrbt_semanal);
        jrbt_semanal.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jrbt_semanal.setText("Semanal");

        jrbt_anual.setBackground(new java.awt.Color(204, 255, 153));
        jbtg_periodos.add(jrbt_anual);
        jrbt_anual.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jrbt_anual.setText("Anual");

        jlbl_periodo.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jlbl_periodo.setText("Eliga su PERIODO de pago:");

        jtxa_info.setEditable(false);
        jtxa_info.setColumns(20);
        jtxa_info.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxa_info.setRows(5);
        jScrollPane1.setViewportView(jtxa_info);

        javax.swing.GroupLayout jpl_tramiteLayout = new javax.swing.GroupLayout(jpl_tramite);
        jpl_tramite.setLayout(jpl_tramiteLayout);
        jpl_tramiteLayout.setHorizontalGroup(
            jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_tramiteLayout.createSequentialGroup()
                .addGroup(jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpl_tramiteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpl_tramiteLayout.createSequentialGroup()
                                .addGroup(jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_periodo)
                                    .addComponent(jrbt_semanal)
                                    .addComponent(jrbt_mensual)
                                    .addComponent(jrbt_anual))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpl_tramiteLayout.createSequentialGroup()
                                    .addComponent(jlbl_monto)
                                    .addGap(12, 12, 12)
                                    .addComponent(jtxf_monto))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpl_tramiteLayout.createSequentialGroup()
                                    .addComponent(jlbl_nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jpl_tramiteLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jbtn_tramitar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpl_tramiteLayout.setVerticalGroup(
            jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_tramiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_nombre)
                    .addComponent(jtxf_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_monto)
                    .addComponent(jtxf_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jpl_tramiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpl_tramiteLayout.createSequentialGroup()
                        .addComponent(jlbl_periodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbt_semanal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbt_mensual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbt_anual))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jbtn_tramitar)
                .addContainerGap())
        );

        jpl_tabla.setBackground(new java.awt.Color(204, 255, 153));
        jpl_tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtbl_tabla.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 14)); // NOI18N
        jtbl_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pago", "Intereses", "Descuento Sobre Impuesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbl_tabla);
        if (jtbl_tabla.getColumnModel().getColumnCount() > 0) {
            jtbl_tabla.getColumnModel().getColumn(0).setResizable(false);
            jtbl_tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbl_tabla.getColumnModel().getColumn(1).setResizable(false);
            jtbl_tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtbl_tabla.getColumnModel().getColumn(2).setResizable(false);
            jtbl_tabla.getColumnModel().getColumn(2).setPreferredWidth(125);
        }

        jlbl_tabla.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jlbl_tabla.setText("Tabla de amortización");

        jbtn_aceptar.setFont(new java.awt.Font("Chinese Rocks Rg", 0, 18)); // NOI18N
        jbtn_aceptar.setText("ACEPTAR DATOS DEL PRÉSTAMO");
        jbtn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpl_tablaLayout = new javax.swing.GroupLayout(jpl_tabla);
        jpl_tabla.setLayout(jpl_tablaLayout);
        jpl_tablaLayout.setHorizontalGroup(
            jpl_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_tablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpl_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_tablaLayout.createSequentialGroup()
                        .addComponent(jlbl_tabla)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_tablaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jpl_tablaLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jbtn_aceptar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpl_tablaLayout.setVerticalGroup(
            jpl_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_tablaLayout.createSequentialGroup()
                .addComponent(jlbl_tabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jbtn_aceptar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jifm_menu)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpl_tramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpl_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jlbl_titulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbl_titulo)
                .addGap(17, 17, 17)
                .addComponent(jifm_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpl_tramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpl_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    // Método del Periodo de Pago elegido
    private void Period(){
        if(jrbt_semanal.isSelected() == true){
            sema = monto / 12;
            sema = Math.rint(sema*100)/100;

            intsema = sema * 0.08;
            intsema = Math.rint(intsema*100)/100;

            jtxa_info.setVisible(true);
            jtxa_info.setText("Pagarás $" + sema + " durante 12\nsemanas, más 8% de intereses\n($" + intsema + ")");
            tabla = true;
        }

        else if(jrbt_mensual.isSelected() == true){
            mens = monto / 6;
            mens = Math.rint(mens*100)/100;

            intmens = mens * 0.06;
            intmens = Math.rint(intmens*100)/100;

            jtxa_info.setVisible(true);
            jtxa_info.setText("Pagarás $" + mens + " durante 6\nmeses, más 6% de intereses\n($" + intmens + ")");
            tabla = true;
        }

        else if(jrbt_anual.isSelected() == true){
            anua = monto / 3;
            anua = Math.rint(anua*100)/100;

            intanua = anua * 0.35;
            intanua = Math.rint(intanua*100)/100;

            jtxa_info.setVisible(true);
            jtxa_info.setText("Pagarás $" + anua + " durante 3\naños, más 35% de intereses\n($" + intanua + ")");
            tabla = true;
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Eliga un periodo de pago");
            tabla = false;
        }
    }
    
    private void TablaSemanas(){
        int i = 0;
              
        jpl_tabla.setVisible(true);
        
        Object[] seman = new Object[3];
       
        desema = intsema - (intsema*0.02);
        desema = Math.rint(desema*100)/100;
        
        pagsema = sema + desema;
        pagsema = Math.rint(pagsema*100)/100;
        
        do{
            seman[0] = sema + intsema;
            seman[1] = desema;
            seman[2] = pagsema;

            tablaa.addRow(seman);
            
            i++;
        }while(i < 12);  
    }
    
    private void TablaMeses(){
        int i = 0;
         
        jpl_tabla.setVisible(true);
        
        Object[] mensu = new Object[3];
       
        desmens = intmens - (intmens*0.02);
        desmens = Math.rint(desmens*100)/100;
        
        pagmens = mens + desmens;
        pagmens = Math.rint(pagmens*100)/100;
        
        do{
            mensu[0] = mens + intmens;
            mensu[1] = desmens;
            mensu[2] = pagmens;

            tablaa.addRow(mensu);
            
            i++;
        }while(i < 6);  
    }
    
    private void TablaAños(){
        int i = 0;
         
        jpl_tabla.setVisible(true);
        
        Object[] mensu = new Object[3];
       
        desanual = intanua - (intanua*0.02);
        desanual = Math.rint(desanual*100)/100;
        
        paganual = anua + desanual;
        paganual = Math.rint(paganual*100)/100;
        
        do{
            mensu[0] = anua + intanua;
            mensu[1] = desanual;
            mensu[2] = paganual;

            tablaa.addRow(mensu);
            
            i++;
        }while(i < 3);  
    }
    
    public void Disable(){
        jtxf_nombre.setEnabled(false);
        jtxf_monto.setEnabled(false);
        jtxa_info.setEnabled(false);
        jrbt_semanal.setEnabled(false);
        jrbt_mensual.setEnabled(false);
        jrbt_anual.setEnabled(false);
        jbtn_tramitar.setEnabled(false);
    }
    
    private void jmn_tramiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmn_tramiteMouseClicked
        jpl_tramite.setVisible(true);
    }//GEN-LAST:event_jmn_tramiteMouseClicked

    private void jbtn_tramitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_tramitarActionPerformed
        jtxa_info.setVisible(true);
        tabla = true;        
        try
        {
            monto = Double.parseDouble(jtxf_monto.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error en el monto");
            tabla = false;
        }       
        Period();
        
        if(tabla == true)
        {
            jmn_tabla.setEnabled(true);   
            Disable();
        }
    }//GEN-LAST:event_jbtn_tramitarActionPerformed

    private void jmn_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmn_tablaMouseClicked
        if(jrbt_semanal.isSelected() == true){
            TablaSemanas();
        }

        else if(jrbt_mensual.isSelected() == true){
            TablaMeses();
        }

        else if(jrbt_anual.isSelected() == true){
            TablaAños();
        }
       
    }//GEN-LAST:event_jmn_tablaMouseClicked

    private void jbtn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_aceptarActionPerformed
        Disable();
        jbtn_aceptar.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Prestamo Tramitado\nPuede consultar los pagos en la tabla de amortización");
    }//GEN-LAST:event_jbtn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JFormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFormularioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jbtg_periodos;
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_tramitar;
    private javax.swing.JInternalFrame jifm_menu;
    private javax.swing.JLabel jlbl_monto;
    private javax.swing.JLabel jlbl_nombre;
    private javax.swing.JLabel jlbl_periodo;
    private javax.swing.JLabel jlbl_tabla;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JMenu jmn_tabla;
    private javax.swing.JMenu jmn_tramite;
    private javax.swing.JMenuBar jmnb_menu;
    private javax.swing.JPanel jpl_tabla;
    private javax.swing.JPanel jpl_tramite;
    private javax.swing.JRadioButton jrbt_anual;
    private javax.swing.JRadioButton jrbt_mensual;
    private javax.swing.JRadioButton jrbt_semanal;
    private javax.swing.JTable jtbl_tabla;
    private javax.swing.JTextArea jtxa_info;
    private javax.swing.JTextField jtxf_monto;
    private javax.swing.JTextField jtxf_nombre;
    // End of variables declaration//GEN-END:variables
}
