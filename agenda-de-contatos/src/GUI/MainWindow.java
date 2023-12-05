package GUI;

import domain.Agenda;
import domain.Contato;

import javax.swing.*;
import java.util.List;

public class MainWindow extends JFrame {
    private static MainWindow instance;
    private final Agenda agenda = Agenda.getInstance();

    private JButton jBotaoAdicionar1;
    private JButton jBotaoEditar1;
    private JButton jBotaoExcluir1;
    private JButton jBotaoPesquisar;
    private JComboBox<String> jComboBoxFiltrar;
    private JFormattedTextField jFormattedTextField3;
    private JLabel jLabel3;
    private JLabel jLabelFiltrar;
    private JList<String> jList1;
    private JList<String> jListBusca;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JPanel jPainelBotoes;
    private JPanel jPainelBotoes1;
    private JPanel jPainelBuscar2;
    private JPanel jPainelLista;
    private JPanel jPainelTitulo;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JLabel jTituloContatos;

    public static MainWindow getInstance() {
        if (instance == null) {
            instance = new MainWindow();
        }

        return instance;
    }

     public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPainelBotoes = new JPanel();
        jPanel1 = new JPanel();
        jPainelBotoes1 = new JPanel();
        jBotaoAdicionar1 = new JButton();
        jBotaoExcluir1 = new JButton();
        jBotaoPesquisar = new JButton();
        jBotaoEditar1 = new JButton();
        jPainelLista = new JPanel();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<>();
        jListBusca = new JList<>();
        jPainelBuscar2 = new JPanel();
        jLabel3 = new JLabel();
        jFormattedTextField3 = new JFormattedTextField();
        jComboBoxFiltrar = new JComboBox<>();
        jLabelFiltrar = new JLabel();
        jPainelTitulo = new JPanel();
        jTituloContatos = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenu2 = new JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        setMinimumSize(new java.awt.Dimension(420, 580));

        jBotaoAdicionar1.setBackground(new java.awt.Color(0, 0, 51));
        jBotaoAdicionar1.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoAdicionar1.setText("Adicionar");
        jBotaoAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBotaoAdicionar1ActionPerformed(evt);
            }
        });

        jBotaoExcluir1.setBackground(new java.awt.Color(0, 0, 51));
        jBotaoExcluir1.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoExcluir1.setText("Excluir");

        jBotaoEditar1.setBackground(new java.awt.Color(0, 0, 51));
        jBotaoEditar1.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoEditar1.setText("Exibir / Editar");

        jBotaoPesquisar.setBackground(new java.awt.Color(0, 0, 51));
        jBotaoPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoPesquisar.setText("OK");

        javax.swing.GroupLayout jPainelBotoes1Layout = new javax.swing.GroupLayout(jPainelBotoes1);
        jPainelBotoes1.setLayout(jPainelBotoes1Layout);
        jPainelBotoes1Layout.setHorizontalGroup(
                jPainelBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelBotoes1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBotaoAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBotaoEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBotaoExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelBotoes1Layout.setVerticalGroup(
                jPainelBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelBotoes1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPainelBotoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jBotaoExcluir1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(jBotaoEditar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBotaoAdicionar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = agenda.listarContatos().stream()
                    .map(contato -> contato.getDescricao())
                    .toArray(String[]::new);

            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPainelListaLayout = new javax.swing.GroupLayout(jPainelLista);
        jPainelLista.setLayout(jPainelListaLayout);
        jPainelListaLayout.setHorizontalGroup(
                jPainelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelListaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
        );
        jPainelListaLayout.setVerticalGroup(
                jPainelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelListaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

//        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgendaDeContatos//agenda-de-contatos//src//img//contorno-da-lupa-de-pesquisa.png"))); // NOI18N

        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jComboBoxFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chamada de Vídeo", "Colega", "Família", "Amigo", "Inimigo", "Emergência", "Whatsapp", "Telegram", "Telefone" }));
        jComboBoxFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltrarActionPerformed(evt);
            }
        });

        jLabelFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFiltrar.setText("Filtrar por:");

        javax.swing.GroupLayout jPainelBuscar2Layout = new javax.swing.GroupLayout(jPainelBuscar2);
        jPainelBuscar2.setLayout(jPainelBuscar2Layout);
        jPainelBuscar2Layout.setHorizontalGroup(
                jPainelBuscar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelBuscar2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBotaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelFiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPainelBuscar2Layout.setVerticalGroup(
                jPainelBuscar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFormattedTextField3)
                        .addComponent(jBotaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPainelBuscar2Layout.createSequentialGroup()
                                .addGroup(jPainelBuscar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPainelBuscar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBoxFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelFiltrar))
                                        .addComponent(jLabel3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPainelTitulo.setBackground(new java.awt.Color(0, 0, 51));

        jTituloContatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTituloContatos.setForeground(new java.awt.Color(255, 255, 255));
        jTituloContatos.setText("Contatos");

        javax.swing.GroupLayout jPainelTituloLayout = new javax.swing.GroupLayout(jPainelTitulo);
        jPainelTitulo.setLayout(jPainelTituloLayout);
        jPainelTituloLayout.setHorizontalGroup(
                jPainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelTituloLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTituloContatos)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelTituloLayout.setVerticalGroup(
                jPainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelTituloLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTituloContatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPainelBotoes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPainelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPainelBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(jPainelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPainelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPainelBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPainelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPainelBotoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

//        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pasta-aberta.png"))); // NOI18N
        jMenu1.setText("File");

//        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adicionar-contato.png"))); // NOI18N
        jMenu2.setText("Adicionar");
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

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
        setLocationRelativeTo(null);

        if (jList1.isVisible()) {
            jBotaoEditar1.addActionListener(e -> editarContato(jList1.getSelectedIndex(), jList1));
            jBotaoExcluir1.addActionListener(e -> excluirContato(jList1.getSelectedIndex(), jList1));
        }


        //jBotaoEditar1.addActionListener(e -> editarContato(jList1.getSelectedIndex()));

        //jBotaoExcluir1.addActionListener(e -> excluirContato(jList1.getSelectedIndex()));

        jBotaoPesquisar.addActionListener(e -> buscarContato());

        //jFormattedTextField3.addActionListener(e -> buscarContato());
        //jFormattedTextField3.addKeyListener(e-> new KeyEvent e);
    }

    private void jBotaoAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {
        AddWindow tela = new AddWindow();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void editarContato(int index, JList lista) {
        if (index >= 0){
            String nomeSobrenome = (String) lista.getModel().getElementAt(index);
            nomeSobrenome = nomeSobrenome.substring(0, nomeSobrenome.indexOf("-")).replaceAll(" ", "");
            Contato contato = agenda.get(nomeSobrenome);
            AddWindow tela = new AddWindow(contato, nomeSobrenome);
            tela.setVisible(true);
            tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }
    }

    private List<Contato> buscarContato(){
        String termo = jFormattedTextField3.getText();
        if(termo.equals("")){
            JOptionPane.showMessageDialog(this, "Digite algo antes de procurar!");

        }
        else{
            jList1.setVisible(false);

            jListBusca.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = agenda.exibirContato(termo).stream()
                        .map(contato -> contato.getDescricao())
                        .toArray(String[]::new);

                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });

            jScrollPane1.setViewportView(jListBusca);
            jBotaoEditar1.addActionListener(e -> editarContato(jListBusca.getSelectedIndex(), jListBusca));
            jBotaoExcluir1.addActionListener(e -> excluirContato(jListBusca.getSelectedIndex(), jListBusca));
        }
        return null;
    }

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jComboBoxFiltrarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void excluirContato(int index, JList lista) {
        if (index >= 0){
            String nomeSobrenome = (String) lista.getModel().getElementAt(index);
            nomeSobrenome = nomeSobrenome.substring(0, nomeSobrenome.indexOf("-")).replaceAll(" ", "");
            System.out.println(nomeSobrenome);
            agenda.removerContato(nomeSobrenome);
            atualizarListaContatos(lista);
        }
    }

    public void atualizarListaContatos(JList lista) {
        DefaultListModel<String> model = new DefaultListModel<>();

        // Preencher o modelo com os contatos da agenda
        List<Contato> contatos = agenda.listarContatos();
        for (Contato contato : contatos) {
            model.addElement(contato.getDescricao());
        }

        // Definir o novo modelo na JList
        lista.setModel(model);
    }

    public void atualizarListaContatos() {
        DefaultListModel<String> model = new DefaultListModel<>();

        // Preencher o modelo com os contatos da agenda
        List<Contato> contatos = agenda.listarContatos();
        for (Contato contato : contatos) {
            model.addElement(contato.getDescricao());
        }

        // Definir o novo modelo na JList
        jList1.setModel(model);
    }

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getInstance().setVisible(true);
            }
        });
    }
}
