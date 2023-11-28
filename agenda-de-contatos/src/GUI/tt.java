//package GUI;
//
//
//import javax.swing.*;
//
//public class MainWindow extends JFrame {
//
//
//    public MainWindow() {
//        initComponents();
//    }
//
//    private void initComponents() {
//
//        jSeparador = new javax.swing.JSeparator();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        jTable1 = new javax.swing.JTable();
//        jPanel1 = new javax.swing.JPanel();
//        jPanel2 = new javax.swing.JPanel();
//        jMenuBar1 = new javax.swing.JMenuBar();
//        jmArquivo1 = new javax.swing.JMenu();
//        Contatos = new javax.swing.JMenu();
//        jSeparator2 = new javax.swing.JPopupMenu.Separator();
//        jMenu1 = new javax.swing.JMenu();
//        jmSobre = new javax.swing.JMenu();
//        jMenu3 = new javax.swing.JMenu();
//
//        jTable1.setModel(new javax.swing.table.DefaultTableModel(
//                new Object [][] {
//                        {null, null, null, null},
//                        {null, null, null, null},
//                        {null, null, null, null},
//                        {null, null, null, null}
//                },
//                new String [] {
//                        "Title 1", "Title 2", "Title 3", "Title 4"
//                }
//        ));
//        jScrollPane1.setViewportView(jTable1);
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setTitle("Agenda de Contatos");
//
//        jPanel1.setLayout(new java.awt.BorderLayout());
//
//        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGap(0, 783, Short.MAX_VALUE)
//        );
//        jPanel2Layout.setVerticalGroup(
//                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGap(0, 569, Short.MAX_VALUE)
//        );
//
//        jmArquivo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaik Aciole\\Documents\\POO\\agendaDeContatos\\agenda-de-contatos\\src\\img\\pasta-aberta.png")); // NOI18N
//        jmArquivo1.setText("Arquivo");
//
//        Contatos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaik Aciole\\Documents\\POO\\agendaDeContatos\\agenda-de-contatos\\src\\img\\adicionar-contato.png"));
//        Contatos.setText("Novos Contatos");
//        Contatos.add(jSeparator2);
//
//        jmArquivo1.add(Contatos);
//
//        jMenu1.setText("Cadastros");
//        jmArquivo1.add(jMenu1);
//
//        jMenuBar1.add(jmArquivo1);
//
//        jmSobre.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaik Aciole\\Documents\\POO\\agendaDeContatos\\agenda-de-contatos\\src\\img\\simbolo-de-informacao.png"));
//        jmSobre.setText("Sobre");
//
//        jMenu3.setText("jMenu3");
//        jmSobre.add(jMenu3);
//
//        jMenuBar1.add(jmSobre);
//
//        setJMenuBar(jMenuBar1);
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGap(87, 87, 87)
//                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//
//        setSize(new java.awt.Dimension(800, 600));
//        setLocationRelativeTo(null);
//    }
//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainWindow().setVisible(true);
//            }
//        });
//    }
//
//    m  mlnllnlm
//}
