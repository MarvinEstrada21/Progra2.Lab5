package marvinestrada_lab5;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_lugar = new javax.swing.ButtonGroup();
        popup = new javax.swing.JPopupMenu();
        eliminar_restaurante = new javax.swing.JMenuItem();
        eliminar_canchas = new javax.swing.JMenuItem();
        eliminar_carretera = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tb_control = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_nombre_restaurante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_direccion_restaurante = new javax.swing.JTextArea();
        sp_nivel_restaurante = new javax.swing.JSpinner();
        cb_entrada_restaurante = new javax.swing.JComboBox<>();
        cb_salida_restaurante = new javax.swing.JComboBox<>();
        tf_calificacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cb_categoria_restaurante = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_nombre_cancha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_direccion_cancha = new javax.swing.JTextArea();
        sp_nivel_cancha = new javax.swing.JSpinner();
        cb_entrada_cancha = new javax.swing.JComboBox<>();
        cb_salida_cancha = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        cb_categoria_cancha = new javax.swing.JComboBox<>();
        cb_estado = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_nombre_casa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_direccion_casa = new javax.swing.JTextArea();
        sp_nivel_casa = new javax.swing.JSpinner();
        cb_entrada_casa = new javax.swing.JComboBox<>();
        cb_salida_casa = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_numero = new javax.swing.JTextField();
        tf_distancia = new javax.swing.JTextField();
        cb_inicio = new javax.swing.JComboBox<>();
        cb_final = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtb_listar = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_categorias_restaurante = new javax.swing.JTree();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_listar = new javax.swing.JList<>();

        eliminar_restaurante.setText("Eliminar Restaurante");
        eliminar_restaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_restauranteActionPerformed(evt);
            }
        });
        popup.add(eliminar_restaurante);

        eliminar_canchas.setText("Eliminar Cancha");
        eliminar_canchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_canchasActionPerformed(evt);
            }
        });
        popup.add(eliminar_canchas);

        eliminar_carretera.setText("Eliminar Carretera");
        eliminar_carretera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_carreteraActionPerformed(evt);
            }
        });
        popup.add(eliminar_carretera);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_control.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tb_controlStateChanged(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Dirección:");

        jLabel3.setText("Nivel:");

        jLabel4.setText("Carretera Entrada:");

        jLabel5.setText("Carretera Salida:");

        jLabel6.setText("Categoría:");

        jLabel7.setText("Calificación:");

        ta_direccion_restaurante.setColumns(20);
        ta_direccion_restaurante.setRows(5);
        jScrollPane1.setViewportView(ta_direccion_restaurante);

        cb_entrada_restaurante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cb_salida_restaurante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cb_categoria_restaurante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chino", "Mexicano", "Italiano", "Comida Rápida" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombre_restaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(sp_nivel_restaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_entrada_restaurante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_salida_restaurante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_calificacion)
                            .addComponent(cb_categoria_restaurante, 0, 218, Short.MAX_VALUE))))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(308, 308, 308))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre_restaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sp_nivel_restaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_entrada_restaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_salida_restaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_categoria_restaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        jTabbedPane3.addTab("Restaurante", jPanel5);

        jLabel8.setText("Nombre:");

        jLabel9.setText("Dirección:");

        jLabel10.setText("Nivel:");

        jLabel11.setText("Carretera Entrada:");

        jLabel12.setText("Carretera Salida:");

        jLabel13.setText("Categoría:");

        jLabel14.setText("Estado:");

        ta_direccion_cancha.setColumns(20);
        ta_direccion_cancha.setRows(5);
        jScrollPane2.setViewportView(ta_direccion_cancha);

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cb_categoria_cancha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Football", "Basketball", "Tennis", "Volleyball" }));

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "En Uso" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_categoria_cancha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(tf_nombre_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(sp_nivel_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_entrada_cancha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_salida_cancha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(308, 308, 308))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombre_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sp_nivel_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cb_entrada_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cb_salida_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_categoria_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Cancha", jPanel6);

        jLabel15.setText("Nombre:");

        jLabel16.setText("Dirección:");

        jLabel17.setText("Nivel:");

        jLabel18.setText("Carretera Entrada:");

        jLabel19.setText("Carretera Salida:");

        ta_direccion_casa.setColumns(20);
        ta_direccion_casa.setRows(5);
        jScrollPane3.setViewportView(ta_direccion_casa);

        jButton3.setText("Agregar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombre_casa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(sp_nivel_casa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_entrada_casa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_salida_casa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(193, 193, 193))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_nombre_casa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sp_nivel_casa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_entrada_casa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cb_salida_casa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jButton3)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("Casa", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        tb_control.addTab("Lugar", jPanel3);

        jLabel22.setText("Número:");

        jLabel23.setText("Distancia:");

        jLabel24.setText("Lugar Inicio:");

        jLabel25.setText("Lugar Final:");

        jButton4.setText("Agregar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jButton4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb_final, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb_inicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tf_distancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cb_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cb_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jButton4)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        tb_control.addTab("Carretera", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_control)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_control)
        );

        jTabbedPane1.addTab("Creación", jPanel1);

        jtb_listar.setBackground(new java.awt.Color(153, 255, 204));
        jtb_listar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        jtb_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_listarMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtb_listar);

        bg_lugar.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Restaurantes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        bg_lugar.add(jRadioButton2);
        jRadioButton2.setText("Canchas");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        bg_lugar.add(jRadioButton3);
        jRadioButton3.setText("Carreteras");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        jTabbedPane4.addTab("Tabla", jPanel10);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Categorías");
        jt_categorias_restaurante.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane5.setViewportView(jt_categorias_restaurante);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Arbol", jPanel11);

        jl_listar.setModel(new DefaultListModel()
        );
        jScrollPane6.setViewportView(jl_listar);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Lista", jPanel12);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Agregar a Tabla
        DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();
        Object[] newrow = {tf_nombre_restaurante.getText(), ta_direccion_restaurante.getText(), sp_nivel_restaurante.getValue(),
            cb_categoria_restaurante.getSelectedItem()};
        modelo.addRow(newrow);
        jtb_listar.setModel(modelo);

        //Agregar a Árbol
        DefaultTreeModel m = (DefaultTreeModel) jt_categorias_restaurante.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode tipo_categoria;
        tipo_categoria = new DefaultMutableTreeNode("Restaurantes");
        DefaultMutableTreeNode nodo;
        nodo = new DefaultMutableTreeNode(cb_categoria_restaurante.getSelectedItem().toString());
        DefaultMutableTreeNode nombre_res;
        nombre_res = new DefaultMutableTreeNode(tf_nombre_restaurante.getText());
        nodo.add(nombre_res);
        tipo_categoria.add(nodo);
        raiz.add(tipo_categoria);
        m.reload();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String nombre, direccion, categoria;
        int nivel_seguridad, calificacion;
        tf_distancia.setText("0");
        try {
            nombre = tf_nombre_restaurante.getText();
            direccion = ta_direccion_restaurante.getText();
            nivel_seguridad = (Integer) sp_nivel_restaurante.getValue();
            categoria = cb_categoria_restaurante.getSelectedItem().toString();
            calificacion = Integer.parseInt(tf_calificacion.getText());
            lista_restaurantes.add(new Restaurantes(categoria, calificacion, nombre, direccion, nivel_seguridad, new Carretera(), new Carretera()));
            JOptionPane.showMessageDialog(this, "El restaurante ha sido creado exitosamente");

            if (Double.parseDouble(tf_distancia.getText()) <= 50){
                DefaultListModel modelo = (DefaultListModel) jl_listar.getModel();
                modelo.addElement(new Lugar(tf_nombre_restaurante.getText(), ta_direccion_restaurante.getText(), (Integer) sp_nivel_restaurante.getValue(),
                        new Carretera(), new Carretera()));
            }
            
            tf_nombre_restaurante.setText("");
            ta_direccion_restaurante.setText("");
            sp_nivel_restaurante.setValue(0);
            cb_categoria_restaurante.setSelectedIndex(0);
            tf_calificacion.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jtb_listar.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                new String[]{"Nombre", "Direccion", "Nivel de seguridad", "Categoria"}));
        DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();

        for (int i = 0; i < lista_restaurantes.size(); i++) {
            Object[] row = {lista_restaurantes.get(i).getNombre(), lista_restaurantes.get(i).getDireccion(),
                lista_restaurantes.get(i).getNivel_seguridad(), lista_restaurantes.get(i).getCategoria(),};
            modelo.addRow(row);
        }
        jtb_listar.setModel(modelo);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String nombre, direccion, categoria, estado;
        int nivel_seguridad;
        tf_distancia.setText("0");
        try {
            nombre = tf_nombre_cancha.getText();
            direccion = ta_direccion_cancha.getText();
            nivel_seguridad = (Integer) sp_nivel_cancha.getValue();
            categoria = cb_categoria_cancha.getSelectedItem().toString();
            estado = cb_estado.getSelectedItem().toString();
            lista_canchas.add(new Canchas(categoria, estado, nombre, direccion, nivel_seguridad, new Carretera(), new Carretera()));
            JOptionPane.showMessageDialog(this, "La cancha ha sido creada exitosamente");

            if (Double.parseDouble(tf_distancia.getText()) <= 50){
                DefaultListModel modelo = (DefaultListModel) jl_listar.getModel();
                modelo.addElement(new Lugar(tf_nombre_cancha.getText(), ta_direccion_cancha.getText(), (Integer) sp_nivel_cancha.getValue(),
                        new Carretera(), new Carretera()));
            }
            
            tf_nombre_cancha.setText("");
            ta_direccion_cancha.setText("");
            sp_nivel_cancha.setValue(0);
            cb_categoria_cancha.setSelectedIndex(0);
            cb_estado.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();
        Object[] newrow = {tf_nombre_cancha.getText(), ta_direccion_cancha.getText(), sp_nivel_cancha.getValue(),
            cb_categoria_cancha.getSelectedItem()};
        modelo.addRow(newrow);
        jtb_listar.setModel(modelo);

        DefaultTreeModel m = (DefaultTreeModel) jt_categorias_restaurante.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode tipo_categoria;
        tipo_categoria = new DefaultMutableTreeNode("Canchas");
        DefaultMutableTreeNode nodo;
        nodo = new DefaultMutableTreeNode(cb_categoria_cancha.getSelectedItem().toString());
        DefaultMutableTreeNode nombre_can;
        nombre_can = new DefaultMutableTreeNode(tf_nombre_cancha.getText());
        nodo.add(nombre_can);
        tipo_categoria.add(nodo);
        raiz.add(tipo_categoria);
        m.reload();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String nombre, direccion;
        int nivel_seguridad;
        tf_distancia.setText("0");
        try {
            nombre = tf_nombre_casa.getText();
            direccion = ta_direccion_casa.getText();
            nivel_seguridad = (Integer) sp_nivel_casa.getValue();
            lista_casas.add(new Casa(nombre, direccion, nivel_seguridad, new Carretera(), new Carretera()));
            JOptionPane.showMessageDialog(this, "La casa ha sido creada exitosamente");

            if (Double.parseDouble(tf_distancia.getText()) <= 50) {
                DefaultListModel modelo = (DefaultListModel) jl_listar.getModel();
                modelo.addElement(new Lugar(tf_nombre_cancha.getText(), ta_direccion_cancha.getText(), (Integer) sp_nivel_cancha.getValue(),
                        new Carretera(), new Carretera()));
            }

            tf_nombre_cancha.setText("");
            ta_direccion_cancha.setText("");
            sp_nivel_cancha.setValue(0);
            cb_categoria_cancha.setSelectedIndex(0);
            cb_estado.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jtb_listar.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                new String[]{"Nombre", "Direccion", "Nivel de seguridad", "Categoria"}));
        DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();

        for (int i = 0; i < lista_canchas.size(); i++) {
            Object[] row = {lista_canchas.get(i).getNombre(), lista_canchas.get(i).getDireccion(),
                lista_canchas.get(i).getNivel_seguridad(), lista_canchas.get(i).getCategoria(),};
            modelo.addRow(row);
        }
        jtb_listar.setModel(modelo);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        int numero;
        double distancia;
        Lugar inicio, finale;
        try {
            numero = Integer.parseInt(tf_numero.getText());
            distancia = Double.parseDouble(tf_distancia.getText());
            inicio = (Lugar)cb_inicio.getSelectedItem();
            finale = (Lugar)cb_inicio.getSelectedItem();
            lista_carreteras.add(new Carretera(numero, distancia, inicio, finale));
            JOptionPane.showMessageDialog(this, "La carretera ha sido creada exitosamente");
            tf_numero.setText("");
            tf_distancia.setText("");
            cb_inicio.setSelectedIndex(0);
            cb_final.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se han guardado los datos ");
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void tb_controlStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tb_controlStateChanged
        if (tb_control.getSelectedIndex() == 1){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Restaurantes temp : lista_restaurantes) {
                modelo.addElement(temp);
            }
            for (Canchas temp : lista_canchas) {
                modelo.addElement(temp);
            }
            for (Casa temp : lista_casas) {
                modelo.addElement(temp);
            }
            cb_inicio.setModel(modelo);
            cb_final.setModel(modelo);
        }
    }//GEN-LAST:event_tb_controlStateChanged

    private void jtb_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_listarMouseClicked
        if (evt.isMetaDown()){
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jtb_listarMouseClicked

    private void eliminar_restauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_restauranteActionPerformed
        if (jtb_listar.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();
            lista_restaurantes.remove(jtb_listar.getSelectedRow());
            modelo.removeRow(jtb_listar.getSelectedRow());

            jtb_listar.setModel(modelo);
        }
    }//GEN-LAST:event_eliminar_restauranteActionPerformed

    private void eliminar_canchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_canchasActionPerformed
        if (jtb_listar.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();
            lista_canchas.remove(jtb_listar.getSelectedRow());
            modelo.removeRow(jtb_listar.getSelectedRow());

            jtb_listar.setModel(modelo);
        }
    }//GEN-LAST:event_eliminar_canchasActionPerformed

    private void eliminar_carreteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_carreteraActionPerformed
        if (jtb_listar.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();
            lista_carreteras.remove(jtb_listar.getSelectedRow());
            modelo.removeRow(jtb_listar.getSelectedRow());

            jtb_listar.setModel(modelo);
        }
    }//GEN-LAST:event_eliminar_carreteraActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();
        Object[] newrow = {Integer.parseInt(tf_numero.getText()), Double.parseDouble(tf_distancia.getText())};
        modelo.addRow(newrow);
        jtb_listar.setModel(modelo);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jtb_listar.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                new String[]{"Número", "Distancia"}));
        DefaultTableModel modelo = (DefaultTableModel) jtb_listar.getModel();

        for (int i = 0; i < lista_carreteras.size(); i++) {
            Object[] row = {lista_carreteras.get(i).getNumero(), lista_carreteras.get(i).getDistancia()};
            modelo.addRow(row);
        }
        jtb_listar.setModel(modelo);
    }//GEN-LAST:event_jRadioButton3ActionPerformed
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_lugar;
    private javax.swing.JComboBox<String> cb_categoria_cancha;
    private javax.swing.JComboBox<String> cb_categoria_restaurante;
    private javax.swing.JComboBox<String> cb_entrada_cancha;
    private javax.swing.JComboBox<String> cb_entrada_casa;
    private javax.swing.JComboBox<String> cb_entrada_restaurante;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JComboBox<String> cb_final;
    private javax.swing.JComboBox<String> cb_inicio;
    private javax.swing.JComboBox<String> cb_salida_cancha;
    private javax.swing.JComboBox<String> cb_salida_casa;
    private javax.swing.JComboBox<String> cb_salida_restaurante;
    private javax.swing.JMenuItem eliminar_canchas;
    private javax.swing.JMenuItem eliminar_carretera;
    private javax.swing.JMenuItem eliminar_restaurante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JList<String> jl_listar;
    private javax.swing.JTree jt_categorias_restaurante;
    private javax.swing.JTable jtb_listar;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JSpinner sp_nivel_cancha;
    private javax.swing.JSpinner sp_nivel_casa;
    private javax.swing.JSpinner sp_nivel_restaurante;
    private javax.swing.JTextArea ta_direccion_cancha;
    private javax.swing.JTextArea ta_direccion_casa;
    private javax.swing.JTextArea ta_direccion_restaurante;
    private javax.swing.JTabbedPane tb_control;
    private javax.swing.JTextField tf_calificacion;
    private javax.swing.JTextField tf_distancia;
    private javax.swing.JTextField tf_nombre_cancha;
    private javax.swing.JTextField tf_nombre_casa;
    private javax.swing.JTextField tf_nombre_restaurante;
    private javax.swing.JTextField tf_numero;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Restaurantes> lista_restaurantes = new ArrayList();
    private ArrayList<Canchas> lista_canchas = new ArrayList();
    private ArrayList<Casa> lista_casas = new ArrayList();
    private ArrayList<Carretera> lista_carreteras = new ArrayList();
}
