package GUI;

import domain.Agenda;
import domain.Contato;

import javax.swing.*;
import java.awt.*;
import java.util.Comparator;
import java.util.List;

public class MainWindow extends JFrame {
    private static MainWindow instance;
    private final Agenda agenda = Agenda.getInstance();

    private JButton jBotaoAdicionar1;
    private JButton jBotaoEditar1;
    private JButton jBotaoExcluir1;
    private JButton jBotaoPesquisar;
    private JComboBox<String> jComboBoxFiltrar;
    private JTextField jTextFieldPesquisar;
    private JLabel jLabel3;
    private JLabel jLabelFiltrar;
    private JList<String> jList1;
    private Font fonte;
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

        jPanel1 = new JPanel();
        jPainelBotoes1 = new JPanel();
        jBotaoAdicionar1 = new JButton();
        jBotaoExcluir1 = new JButton();
        jBotaoPesquisar = new JButton();
        jBotaoEditar1 = new JButton();
        jPainelLista = new JPanel();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<>();
        fonte = new Font("Roboto", Font.PLAIN, 18);
        jPainelBuscar2 = new JPanel();
        jLabel3 = new JLabel();
        jTextFieldPesquisar = new JTextField();
        jComboBoxFiltrar = new JComboBox<>();
        jLabelFiltrar = new JLabel();
        jPainelTitulo = new JPanel();
        jTituloContatos = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        setMinimumSize(new java.awt.Dimension(499, 617));

        jBotaoAdicionar1.setBackground(new java.awt.Color(0, 0, 51));
        jBotaoAdicionar1.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoAdicionar1.setText("Adicionar");
        jBotaoAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBotaoAdicionar1ActionPerformed(evt);
            }
        });

        jBotaoExcluir1.setBackground(new Color(0, 0, 51));
        jBotaoExcluir1.setForeground(new Color(255, 255, 255));
        jBotaoExcluir1.setText("Excluir");

        jBotaoEditar1.setBackground(new Color(0, 0, 51));
        jBotaoEditar1.setForeground(new Color(255, 255, 255));
        jBotaoEditar1.setText("Exibir / Editar");

        jBotaoPesquisar.setBackground(new Color(0, 0, 51));
        jBotaoPesquisar.setForeground(new Color(255, 255, 255));
        jBotaoPesquisar.setText("OK");

        GroupLayout jPainelBotoes1Layout = new GroupLayout(jPainelBotoes1);
        jPainelBotoes1.setLayout(jPainelBotoes1Layout);
        jPainelBotoes1Layout.setHorizontalGroup(
                jPainelBotoes1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPainelBotoes1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBotaoAdicionar1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBotaoEditar1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBotaoExcluir1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelBotoes1Layout.setVerticalGroup(
                jPainelBotoes1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelBotoes1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPainelBotoes1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jBotaoExcluir1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(jBotaoEditar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBotaoAdicionar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        atualizarListaContatos();

        jList1.setFont(fonte);
        jScrollPane1.setViewportView(jList1);

        GroupLayout jPainelListaLayout = new GroupLayout(jPainelLista);
        jPainelLista.setLayout(jPainelListaLayout);
        jPainelListaLayout.setHorizontalGroup(
                jPainelListaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPainelListaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
        );
        jPainelListaLayout.setVerticalGroup(
                jPainelListaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPainelListaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE))
        );

        jComboBoxFiltrar.setModel(new DefaultComboBoxModel<>(new String[] { "Tudo", "Chamada de Vídeo", "Colega", "Familia", "Amigo", "Inimigo", "Emergencia", "Whatsapp", "Telegram", "Telefone" }));
        jComboBoxFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltrarActionPerformed(evt);
            }
        });

        jLabelFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFiltrar.setText("Filtrar por:");

        GroupLayout jPainelBuscar2Layout = new GroupLayout(jPainelBuscar2);
        jPainelBuscar2.setLayout(jPainelBuscar2Layout);
        jPainelBuscar2Layout.setHorizontalGroup(
                jPainelBuscar2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPainelBuscar2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextFieldPesquisar, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBotaoPesquisar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelFiltrar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFiltrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPainelBuscar2Layout.setVerticalGroup(
                jPainelBuscar2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldPesquisar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBotaoPesquisar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPainelBuscar2Layout.createSequentialGroup()
                                .addGroup(jPainelBuscar2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPainelBuscar2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBoxFiltrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelFiltrar))
                                        .addComponent(jLabel3))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPainelTitulo.setBackground(new java.awt.Color(0, 0, 51));

        jTituloContatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTituloContatos.setForeground(new java.awt.Color(255, 255, 255));
        jTituloContatos.setText("Contatos");

        GroupLayout jPainelTituloLayout = new GroupLayout(jPainelTitulo);
        jPainelTitulo.setLayout(jPainelTituloLayout);
        jPainelTituloLayout.setHorizontalGroup(
                jPainelTituloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPainelTituloLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTituloContatos)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPainelTituloLayout.setVerticalGroup(
                jPainelTituloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelTituloLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTituloContatos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPainelBotoes1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPainelTitulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPainelBuscar2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(jPainelLista, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPainelTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPainelBuscar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPainelLista, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPainelBotoes1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);

        if (jList1.isVisible()) {
            jBotaoEditar1.addActionListener(e -> editarContato(jList1.getSelectedIndex(), jList1));
            jBotaoExcluir1.addActionListener(e -> excluirContato(jList1.getSelectedIndex(), jList1));
        }

        jBotaoPesquisar.addActionListener(e -> buscarContato());


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
        String termo = jTextFieldPesquisar.getText();
        if(termo.equals("")){
            atualizarListaContatos();
            JOptionPane.showMessageDialog(this, "Digite algo antes de procurar!");

        }else{
            DefaultListModel<String> model = new DefaultListModel<>();
            atualizarListaContatos();

            List<Contato> contatos = agenda.exibirContato(termo);
            for (Contato contato : contatos) {
                    model.addElement(contato.getDescricao());
            }
            jList1.setModel(model);
        }
        return null;
    }

    private void jComboBoxFiltrarActionPerformed(java.awt.event.ActionEvent evt) {
        String item = jComboBoxFiltrar.getSelectedItem().toString();
        if (item.equalsIgnoreCase("tudo")) {
            atualizarListaContatos();
        }else{
            filtrarListaContatos(item);
    }}

    private void excluirContato(int index, JList lista) {
        if (index >= 0){
            String nomeSobrenome = (String) lista.getModel().getElementAt(index);
            nomeSobrenome = nomeSobrenome.substring(0, nomeSobrenome.indexOf("-")).replaceAll(" ", "");
            System.out.println(nomeSobrenome);
            agenda.removerContato(nomeSobrenome);
            atualizarListaContatos(lista);
        }
    }

    public void filtrarListaContatos(String filtro){
        DefaultListModel<String> model = new DefaultListModel<>();

        // Preencher o modelo com os contatos da agenda
        List<Contato> contatos = agenda.listarContatos();
        for (Contato contato : contatos) {
            if(filtro.equalsIgnoreCase("chamada de vídeo")){
                if (contato.getRedeSocial().toString().equalsIgnoreCase("telegram") ||
                        contato.getRedeSocial().toString().equalsIgnoreCase("whatsapp")) {
                    model.addElement(contato.getDescricao());
                }
            }
            if (contato.getRelacionamento().toString().equalsIgnoreCase(filtro) ||
                    contato.getRedeSocial().toString().equalsIgnoreCase(filtro)) {
                model.addElement(contato.getDescricao());
            }
        }

        jList1.setModel(model);  //Definir o novo modelo na JList
    }

    public void atualizarListaContatos(JList lista) {
        DefaultListModel<String> model = new DefaultListModel<>();

        // Preencher o modelo com os contatos da agenda
        List<Contato> contatos = agenda.listarContatos();
        for (Contato contato : contatos) {
            model.addElement(contato.getDescricao());
        }

        lista.setModel(model);  // Definir o novo modelo na JList
    }

    public void atualizarListaContatos() {
        DefaultListModel<String> model = new DefaultListModel<>();

        // Preencher o modelo com os contatos da agenda
        List<Contato> contatos = agenda.listarContatos().stream().sorted(new Comparator<Contato>() {
            @Override
            public int compare(Contato c1, Contato c2) {
                String nomeSobrenome1 = c1.getNome() + c1.getSobrenome();
                String nomeSobrenome2 = c2.getNome() + c2.getSobrenome();

                return nomeSobrenome1.compareTo(nomeSobrenome2);
            }
        }).toList();

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
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getInstance().setVisible(true);
            }
        });
    }
}
