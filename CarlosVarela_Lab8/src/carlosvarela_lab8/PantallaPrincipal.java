package carlosvarela_lab8;

import java.io.FilenameFilter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PantallaPrincipal extends javax.swing.JFrame {

    public String path;
    public boolean primera = true;
    Hada victima1, victima2;
    
    public PantallaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregarHadas = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nombreLamia = new javax.swing.JTextField();
        tf_edadLamia = new javax.swing.JTextField();
        sp_alturaLamia = new javax.swing.JSpinner();
        sp_aletasLamia = new javax.swing.JSpinner();
        sp_branquiasLamia = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        bt_agregarLamia = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_nombreHamadriade = new javax.swing.JTextField();
        tf_edadHamadriade = new javax.swing.JTextField();
        sp_alturaHamadriade = new javax.swing.JSpinner();
        bt_agregarHamadriade = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        tf_nombreSalamandra = new javax.swing.JTextField();
        tf_edadSalamandra = new javax.swing.JTextField();
        sp_alturaSalamandra = new javax.swing.JSpinner();
        sp_alasSalamandra = new javax.swing.JSpinner();
        bt_agregarSalamandra = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_nombreSilfide = new javax.swing.JTextField();
        tf_edadSilfide = new javax.swing.JTextField();
        sp_alturaSilfide = new javax.swing.JSpinner();
        sp_alasSilfide = new javax.swing.JSpinner();
        bt_añadirSilfide = new javax.swing.JButton();
        jd_elejirVictimas = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_hadas = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        bt_peleador1 = new javax.swing.JButton();
        bt_peleador2 = new javax.swing.JButton();
        bt_matanza = new javax.swing.JButton();
        jd_matanza = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        pb_victima1 = new javax.swing.JProgressBar();
        pb_victima2 = new javax.swing.JProgressBar();
        jPanel8 = new javax.swing.JPanel();
        jl_victima1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jl_victima2 = new javax.swing.JLabel();
        bt_iniciar = new javax.swing.JButton();
        jd_modificarHadas = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_modificarHada = new javax.swing.JList<>();
        jLabel26 = new javax.swing.JLabel();
        tf_modificarNombre = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tf_modificarEdad = new javax.swing.JTextField();
        sp_alturaModificar = new javax.swing.JSpinner();
        bt_modificar = new javax.swing.JButton();
        jd_eliminarHada = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_eliminarHada = new javax.swing.JList<>();
        bt_eliminarHada = new javax.swing.JButton();
        jd_about = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_play = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mi_about = new javax.swing.JMenu();
        mi_abrir = new javax.swing.JMenuItem();
        mi_guardar = new javax.swing.JMenuItem();
        mi_guardarcomo = new javax.swing.JMenuItem();
        mi_salir = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_agregarHadas = new javax.swing.JMenuItem();
        mi_modificar = new javax.swing.JMenuItem();
        mi_eliminarHada = new javax.swing.JMenuItem();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Altura del hada:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del hada:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aletas:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edad:");

        sp_alturaLamia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        sp_aletasLamia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        sp_branquiasLamia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 8, 1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Branquias:");

        bt_agregarLamia.setText("Agregar");
        bt_agregarLamia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarLamiaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tf_nombreLamia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_agregarLamia)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_aletasLamia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_edadLamia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sp_alturaLamia, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(sp_branquiasLamia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreLamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_alturaLamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_edadLamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sp_aletasLamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_branquiasLamia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(bt_agregarLamia)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lamia", jPanel2);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Altura del hada:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre del hada:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Edad:");

        sp_alturaHamadriade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        bt_agregarHamadriade.setText("Agregar");
        bt_agregarHamadriade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarHamadriadeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tf_nombreHamadriade, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_agregarHamadriade)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_edadHamadriade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_alturaHamadriade, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreHamadriade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_alturaHamadriade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_edadHamadriade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(bt_agregarHamadriade)
                .addGap(71, 71, 71))
        );

        jTabbedPane1.addTab("Hamadriade", jPanel6);

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Altura del hada:");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Nombre del hada:");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Alas:");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Edad:");

        sp_alturaSalamandra.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        sp_alasSalamandra.setModel(new javax.swing.SpinnerNumberModel(16, 16, null, 1));

        bt_agregarSalamandra.setText("Agregar");
        bt_agregarSalamandra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarSalamandraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tf_nombreSalamandra, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_agregarSalamandra)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_alasSalamandra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_edadSalamandra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sp_alturaSalamandra, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreSalamandra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_alturaSalamandra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(tf_edadSalamandra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(sp_alasSalamandra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_agregarSalamandra)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Salamandra", jPanel11);

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Altura del hada:");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nombre del hada:");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Alas:");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Edad:");

        sp_alturaSilfide.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        sp_alasSilfide.setModel(new javax.swing.SpinnerNumberModel(6, 6, null, 1));

        bt_añadirSilfide.setText("Agregar");
        bt_añadirSilfide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_añadirSilfideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreSilfide, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_alasSilfide, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_edadSilfide, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sp_alturaSilfide, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(bt_añadirSilfide)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreSilfide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_alturaSilfide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_edadSilfide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(sp_alasSilfide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_añadirSilfide)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Silfide", jPanel9);

        javax.swing.GroupLayout jd_agregarHadasLayout = new javax.swing.GroupLayout(jd_agregarHadas.getContentPane());
        jd_agregarHadas.getContentPane().setLayout(jd_agregarHadasLayout);
        jd_agregarHadasLayout.setHorizontalGroup(
            jd_agregarHadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jd_agregarHadasLayout.setVerticalGroup(
            jd_agregarHadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jl_hadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jl_hadas);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Seleccione dos victimas");

        bt_peleador1.setText("Agregar peleador 1");
        bt_peleador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_peleador1MouseClicked(evt);
            }
        });

        bt_peleador2.setText("Agregar peleador 2");
        bt_peleador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_peleador2MouseClicked(evt);
            }
        });

        bt_matanza.setText("¡Iniciar matanza!");
        bt_matanza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_matanzaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_matanza)
                        .addGap(36, 36, 36)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bt_peleador1)
                    .addComponent(bt_peleador2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(176, 176, 176))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(bt_peleador1)
                        .addGap(69, 69, 69)
                        .addComponent(bt_peleador2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(bt_matanza)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jd_elejirVictimasLayout = new javax.swing.GroupLayout(jd_elejirVictimas.getContentPane());
        jd_elejirVictimas.getContentPane().setLayout(jd_elejirVictimasLayout);
        jd_elejirVictimasLayout.setHorizontalGroup(
            jd_elejirVictimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_elejirVictimasLayout.setVerticalGroup(
            jd_elejirVictimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(230, 42, 42));

        pb_victima1.setToolTipText("");

        jl_victima1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_victima1.setText("jLabel11");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_victima1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_victima1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jl_victima2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_victima2.setText("jLabel11");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_victima2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_victima2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bt_iniciar.setText("Iniciar");
        bt_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pb_victima1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb_victima2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_iniciar)
                .addGap(241, 241, 241))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pb_victima1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pb_victima2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(bt_iniciar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_matanzaLayout = new javax.swing.GroupLayout(jd_matanza.getContentPane());
        jd_matanza.getContentPane().setLayout(jd_matanzaLayout);
        jd_matanzaLayout.setHorizontalGroup(
            jd_matanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_matanzaLayout.setVerticalGroup(
            jd_matanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setViewportView(jl_modificarHada);

        jLabel26.setText("Nombre:");

        jLabel27.setText("Edad:");

        jLabel28.setText("Altura:");

        sp_alturaModificar.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));

        bt_modificar.setText("Modificar Hada");
        bt_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_modificarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_modificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_alturaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_modificar))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_modificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_modificarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(sp_alturaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_modificar)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout jd_modificarHadasLayout = new javax.swing.GroupLayout(jd_modificarHadas.getContentPane());
        jd_modificarHadas.getContentPane().setLayout(jd_modificarHadasLayout);
        jd_modificarHadasLayout.setHorizontalGroup(
            jd_modificarHadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_modificarHadasLayout.setVerticalGroup(
            jd_modificarHadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane3.setViewportView(jl_eliminarHada);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        bt_eliminarHada.setText("Eliminar");
        bt_eliminarHada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarHadaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_eliminarHada, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(bt_eliminarHada, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_eliminarHadaLayout = new javax.swing.GroupLayout(jd_eliminarHada.getContentPane());
        jd_eliminarHada.getContentPane().setLayout(jd_eliminarHadaLayout);
        jd_eliminarHadaLayout.setHorizontalGroup(
            jd_eliminarHadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_eliminarHadaLayout.setVerticalGroup(
            jd_eliminarHadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_aboutLayout = new javax.swing.GroupLayout(jd_about.getContentPane());
        jd_about.getContentPane().setLayout(jd_aboutLayout);
        jd_aboutLayout.setHorizontalGroup(
            jd_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_aboutLayout.setVerticalGroup(
            jd_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bt_play.setText("Play!");
        bt_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_playMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(bt_play, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(bt_play, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        mi_about.setText("Opciones");
        mi_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_aboutActionPerformed(evt);
            }
        });

        mi_abrir.setText("Abrir");
        mi_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_abrirActionPerformed(evt);
            }
        });
        mi_about.add(mi_abrir);

        mi_guardar.setText("Guardar");
        mi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_guardarActionPerformed(evt);
            }
        });
        mi_about.add(mi_guardar);

        mi_guardarcomo.setText("Guardar Como");
        mi_guardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_guardarcomoActionPerformed(evt);
            }
        });
        mi_about.add(mi_guardarcomo);

        mi_salir.setText("Salir");
        mi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_salirActionPerformed(evt);
            }
        });
        mi_about.add(mi_salir);

        jMenuItem5.setText("About");
        mi_about.add(jMenuItem5);

        jMenuBar1.add(mi_about);

        jMenu2.setText("Hada");

        mi_agregarHadas.setText("Agregar ");
        mi_agregarHadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregarHadasActionPerformed(evt);
            }
        });
        jMenu2.add(mi_agregarHadas);

        mi_modificar.setText("Modificar");
        mi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarActionPerformed(evt);
            }
        });
        jMenu2.add(mi_modificar);

        mi_eliminarHada.setText("Eliminar");
        mi_eliminarHada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarHadaActionPerformed(evt);
            }
        });
        jMenu2.add(mi_eliminarHada);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Agregar Hadas -----------------------------
    private void bt_agregarLamiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarLamiaMouseClicked
        try {
            Lamia lamia;
            if (tf_nombreLamia.getText().equals("")||tf_edadLamia.getText().equals("")) {
                JOptionPane.showMessageDialog(jd_agregarHadas, "Llene los datos");
            }else{
                lamia = new Lamia(tf_nombreLamia.getText(), (Integer)sp_alturaLamia.getValue(), Integer.parseInt(tf_edadLamia.getText()),
                                    (Integer)sp_aletasLamia.getValue(), (Integer)sp_branquiasLamia.getValue());
                hadas.add(lamia);
                JOptionPane.showMessageDialog(jd_agregarHadas, "Hada ingresada");
                tf_nombreLamia.setText("");
                tf_edadLamia.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_agregarHadas, "Ingrese datos correctamente");
        }
    }//GEN-LAST:event_bt_agregarLamiaMouseClicked

    private void bt_agregarHamadriadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarHamadriadeMouseClicked
        try {
            Hamadriades hamadriade;
            if (tf_nombreHamadriade.getText().equals("")||tf_edadHamadriade.getText().equals("")) {
                JOptionPane.showMessageDialog(jd_agregarHadas, "Llene los datos");
            }else{
                hamadriade = new Hamadriades(new Arbol(), tf_nombreHamadriade.getText(), (Integer)sp_alturaHamadriade.getValue(), Integer.parseInt(tf_edadHamadriade.getText()));
                hadas.add(hamadriade);
                JOptionPane.showMessageDialog(jd_agregarHadas, "Hada ingresada");
                tf_nombreHamadriade.setText("");
                tf_edadHamadriade.setText("");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_agregarHamadriadeMouseClicked

    private void bt_añadirSilfideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_añadirSilfideMouseClicked
        try {
            Silfide silfide;
            if (tf_nombreSilfide.getText().equals("")||tf_edadSilfide.getText().equals("")) {
                JOptionPane.showMessageDialog(jd_agregarHadas, "Llene los datos");
            }else{
                silfide = new Silfide((Integer)sp_alasSilfide.getValue(), tf_nombreSilfide.getText(), (Integer)sp_alturaSilfide.getValue(), Integer.parseInt(tf_edadSilfide.getText()));
                hadas.add(silfide);
                JOptionPane.showMessageDialog(jd_agregarHadas, "Hada ingresada");
                tf_nombreSilfide.setText("");
                tf_edadSilfide.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_agregarHadas, "Ingrese datos correctamente");
        }
    }//GEN-LAST:event_bt_añadirSilfideMouseClicked

    private void bt_agregarSalamandraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarSalamandraMouseClicked
       try {
            Salamandra salamandra;
            if (tf_nombreSalamandra.getText().equals("")||tf_edadSalamandra.getText().equals("")) {
                JOptionPane.showMessageDialog(jd_agregarHadas, "Llene los datos");
            }else{
                salamandra = new Salamandra((Integer)sp_alasSalamandra.getValue(), tf_nombreSalamandra.getText(), (Integer)sp_alturaSalamandra.getValue(), Integer.parseInt(tf_edadSalamandra.getText()));
                hadas.add(salamandra);
                JOptionPane.showMessageDialog(jd_agregarHadas, "Hada ingresada");
                tf_nombreSalamandra.setText("");
                tf_edadSalamandra.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_agregarHadas, "Ingrese datos correctamente");
        }
    }//GEN-LAST:event_bt_agregarSalamandraMouseClicked
    //---------------------------------------------
    
    
    //----------------------MenuItem-------------------------------
    private void mi_agregarHadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregarHadasActionPerformed
        jd_agregarHadas.pack();
        jd_agregarHadas.setModal(true);
        jd_agregarHadas.setLocationRelativeTo(null);
        jd_agregarHadas.setVisible(true);
    }//GEN-LAST:event_mi_agregarHadasActionPerformed

    private void mi_eliminarHadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarHadaActionPerformed
        recargarListas();
        jd_eliminarHada.pack();
        jd_eliminarHada.setModal(true);
        jd_eliminarHada.setLocationRelativeTo(null);
        jd_eliminarHada.setVisible(true);
    }//GEN-LAST:event_mi_eliminarHadaActionPerformed

    private void mi_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_abrirActionPerformed
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos binaros","cmv");
        jf.setFileFilter(filtro);
        int seleccion = jf.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            AdministradorArchivos adm = new AdministradorArchivos();
            hadas = adm.abrir(jf.getSelectedFile());
            JOptionPane.showMessageDialog(this, "Hadas cargadas");
        }
    }//GEN-LAST:event_mi_abrirActionPerformed

    private void mi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_guardarActionPerformed
        if (primera) {
            JFileChooser jf = new JFileChooser();
            int seleccion = jf.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                AdministradorArchivos adm = new AdministradorArchivos(hadas);
                path = jf.getSelectedFile().getPath()+".cmv";
                adm.guardar(path);
            }
            primera = false;
        }else{
            AdministradorArchivos adm = new AdministradorArchivos(hadas);
            adm.guardar(path);
            JOptionPane.showMessageDialog(this, "Hadas guardadas");
        }
    }//GEN-LAST:event_mi_guardarActionPerformed

    private void mi_guardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_guardarcomoActionPerformed
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos binarios", "cmv");
        jf.setFileFilter(filtro);
        int seleccion = jf.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            AdministradorArchivos adm = new AdministradorArchivos();
            adm.setHadas(hadas);
            try {
                adm.guardarComo(jf.getSelectedFile());
            } catch (Exception e) {
            }
            JOptionPane.showMessageDialog(this, "Hadas guardadas");
        }
    }//GEN-LAST:event_mi_guardarcomoActionPerformed

    private void mi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mi_salirActionPerformed

    private void mi_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_aboutActionPerformed
        jd_about.pack();
        jd_about.setModal(true);
        jd_about.setLocationRelativeTo(null);
        jd_about.setVisible(true);
    }//GEN-LAST:event_mi_aboutActionPerformed

    private void mi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarActionPerformed
        recargarListas();
        jd_modificarHadas.pack();
        jd_modificarHadas.setModal(true);
        jd_modificarHadas.setLocationRelativeTo(null);
        jd_modificarHadas.setVisible(true);
    }//GEN-LAST:event_mi_modificarActionPerformed

    
    
    
    //---------------------------------------------
    private void bt_eliminarHadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarHadaMouseClicked
        int seleccion = jl_eliminarHada.getSelectedIndex();
        if (seleccion>-1) {
            DefaultListModel modelo = (DefaultListModel)jl_eliminarHada.getModel();
            Hada eliminar = (Hada)modelo.getElementAt(seleccion);
            if (hadas.contains(eliminar)) {
                hadas.remove(eliminar);
                recargarListas();
                JOptionPane.showMessageDialog(jd_eliminarHada, "Hada eliminada");
            }else{
                JOptionPane.showMessageDialog(jd_eliminarHada, "No se encontro hada para eliminarla");
            }
        }else{
            JOptionPane.showMessageDialog(jd_eliminarHada, "Escoga algun ada");
        }
    }//GEN-LAST:event_bt_eliminarHadaMouseClicked

    private void bt_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarMouseClicked
        int seleccion = jl_modificarHada.getSelectedIndex();
        if (seleccion>-1) {
            try {
                if (!tf_modificarNombre.getText().equals("")&&!tf_modificarEdad.getText().equals("")
                    &&(Integer)sp_alturaModificar.getValue()!=0) {
                    DefaultListModel modelo = (DefaultListModel)jl_modificarHada.getModel();
                    Hada seleccionado = (Hada)modelo.getElementAt(seleccion);
                    Hada modificar = hadas.get(hadas.indexOf(seleccionado));
                    modificar.setNombre(tf_modificarNombre.getText());
                    modificar.setEdad(Integer.parseInt(tf_modificarEdad.getText()));
                    modificar.setAltura((Integer)sp_alturaModificar.getValue());
                    recargarListas();
                    JOptionPane.showMessageDialog(jd_modificarHadas, "Hada modificada");

                    tf_modificarNombre.setText("");
                    sp_alturaModificar.setValue(0);
                    tf_modificarEdad.setText("");
                }else{
                    JOptionPane.showMessageDialog(jd_modificarHadas, "Llene los requisitos");
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jd_modificarHadas, "Surgio un problema");
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_bt_modificarMouseClicked

    
    //-----------------------------------------------
    private void bt_playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_playMouseClicked
        if (hadas.size()>=1) {
            recargarListas();
            jd_elejirVictimas.pack();
            jd_elejirVictimas.setModal(true);
            jd_elejirVictimas.setLocationRelativeTo(null);
            jd_elejirVictimas.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "No hay suficientes hadas");
        }
    }//GEN-LAST:event_bt_playMouseClicked

    private void bt_peleador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_peleador1MouseClicked
        DefaultListModel modelo = (DefaultListModel)jl_hadas.getModel();
        int seleccion = jl_hadas.getSelectedIndex();
        if (seleccion>-1) {
            victima1 = (Hada)modelo.getElementAt(seleccion);
            JOptionPane.showMessageDialog(jd_elejirVictimas, "Victima seleccionada");
            bt_peleador1.setEnabled(false);
        }
    }//GEN-LAST:event_bt_peleador1MouseClicked

    private void bt_peleador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_peleador2MouseClicked
        DefaultListModel modelo = (DefaultListModel)jl_hadas.getModel();
        int seleccion = jl_hadas.getSelectedIndex();
        if (seleccion>-1) {
            victima2 = (Hada)modelo.getElementAt(seleccion);
            JOptionPane.showMessageDialog(jd_elejirVictimas, "Victima seleccionada");
            bt_peleador2.setEnabled(false);
        }
    }//GEN-LAST:event_bt_peleador2MouseClicked

    private void bt_matanzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_matanzaMouseClicked
        if (victima1.equals(victima2)) {
            JOptionPane.showMessageDialog(jd_elejirVictimas, "Elija hadas diferentes");
            victima1 = null;
            victima2 = null;
        }else{
            jl_victima1.setText(victima1.getNombre());
            jl_victima2.setText(victima2.getNombre());
            jd_matanza.pack();
            jd_matanza.setModal(true);
            jd_matanza.setLocationRelativeTo(null);
            jd_matanza.setVisible(true); 
        }
        bt_peleador1.setEnabled(true);
        bt_peleador2.setEnabled(true);
    }//GEN-LAST:event_bt_matanzaMouseClicked

    private void bt_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarMouseClicked
        Pelea p = new Pelea(victima1, victima2, pb_victima1, pb_victima2);
        p.start();
    }//GEN-LAST:event_bt_iniciarMouseClicked
    
   
    public void recargarListas(){
        DefaultListModel modelo = new DefaultListModel();
        for (Hada hada : hadas) {
            modelo.addElement(hada);
        }
        jl_eliminarHada.setModel(modelo);
        jl_modificarHada.setModel(modelo);
        jl_hadas.setModel(modelo);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregarHamadriade;
    private javax.swing.JButton bt_agregarLamia;
    private javax.swing.JButton bt_agregarSalamandra;
    private javax.swing.JButton bt_añadirSilfide;
    private javax.swing.JButton bt_eliminarHada;
    private javax.swing.JButton bt_iniciar;
    private javax.swing.JButton bt_matanza;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_peleador1;
    private javax.swing.JButton bt_peleador2;
    private javax.swing.JButton bt_play;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JDialog jd_about;
    private javax.swing.JDialog jd_agregarHadas;
    private javax.swing.JDialog jd_elejirVictimas;
    private javax.swing.JDialog jd_eliminarHada;
    private javax.swing.JDialog jd_matanza;
    private javax.swing.JDialog jd_modificarHadas;
    private javax.swing.JList<String> jl_eliminarHada;
    private javax.swing.JList<String> jl_hadas;
    private javax.swing.JList<String> jl_modificarHada;
    private javax.swing.JLabel jl_victima1;
    private javax.swing.JLabel jl_victima2;
    private javax.swing.JMenu mi_about;
    private javax.swing.JMenuItem mi_abrir;
    private javax.swing.JMenuItem mi_agregarHadas;
    private javax.swing.JMenuItem mi_eliminarHada;
    private javax.swing.JMenuItem mi_guardar;
    private javax.swing.JMenuItem mi_guardarcomo;
    private javax.swing.JMenuItem mi_modificar;
    private javax.swing.JMenuItem mi_salir;
    private javax.swing.JProgressBar pb_victima1;
    private javax.swing.JProgressBar pb_victima2;
    private javax.swing.JSpinner sp_alasSalamandra;
    private javax.swing.JSpinner sp_alasSilfide;
    private javax.swing.JSpinner sp_aletasLamia;
    private javax.swing.JSpinner sp_alturaHamadriade;
    private javax.swing.JSpinner sp_alturaLamia;
    private javax.swing.JSpinner sp_alturaModificar;
    private javax.swing.JSpinner sp_alturaSalamandra;
    private javax.swing.JSpinner sp_alturaSilfide;
    private javax.swing.JSpinner sp_branquiasLamia;
    private javax.swing.JTextField tf_edadHamadriade;
    private javax.swing.JTextField tf_edadLamia;
    private javax.swing.JTextField tf_edadSalamandra;
    private javax.swing.JTextField tf_edadSilfide;
    private javax.swing.JTextField tf_modificarEdad;
    private javax.swing.JTextField tf_modificarNombre;
    private javax.swing.JTextField tf_nombreHamadriade;
    private javax.swing.JTextField tf_nombreLamia;
    private javax.swing.JTextField tf_nombreSalamandra;
    private javax.swing.JTextField tf_nombreSilfide;
    // End of variables declaration//GEN-END:variables
    ArrayList<Hada> hadas = new ArrayList();
}
