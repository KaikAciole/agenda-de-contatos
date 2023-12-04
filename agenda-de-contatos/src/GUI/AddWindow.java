package GUI;

import Validators.NameValidator;
import Validators.NumberValidator;
import Validators.Validator;
import domain.Agenda;
import domain.Contato;
import domain.RedeSocial;
import domain.Relacionamento;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class AddWindow extends JFrame {
    private final Agenda agenda = Agenda.getInstance();
    private final MainWindow main = MainWindow.getInstance();

    private JButton jButton1;
    private JButton jButton2;
    private JComboBox jComboBoxRelacionamento;
    private JComboBox jComboBoxRedeSocial;
    private JFormattedTextField jCampoAniversario;
    private JTextField jCampoEndereco;
    private JTextField jCampoNome;
    private JFormattedTextField jCampoNumero;
    private JTextField jCampoSobrenome;
    private JLabel jLabelAniversario;
    private JLabel jLabelEndereco;
    private JLabel jLabelNome;
    private JLabel jLabelNumero;
    private JLabel jLabelRedeSocial;
    private JLabel jLabelRelacionamento;
    private JLabel jLabelSobrenome;
    private JPanel jPainelPrincipal;
    private JPanel jPanel1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;

    public AddWindow() {
        initComponents(null, -1);
    }
    public AddWindow(Contato contato, int index) {
        initComponents(contato, index);
    }
    private void initComponents(Contato contato, int index) {

        jPainelPrincipal = new JPanel();
        jComboBoxRelacionamento = new JComboBox();
        jComboBoxRedeSocial = new JComboBox();
        jLabelNome = new JLabel();
        jLabelSobrenome = new JLabel();
        jLabelNumero = new JLabel();
        jLabelAniversario = new JLabel();
        jLabelEndereco = new JLabel();
        jLabelRelacionamento = new JLabel();
        jLabelRedeSocial = new JLabel();
        jCampoNumero = new JFormattedTextField();
        jCampoAniversario = new JFormattedTextField();
        jCampoSobrenome = new JTextField();
        jCampoNome = new JTextField();
        jCampoEndereco = new JTextField();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(457, 586));

        jLabelNome.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNome.setForeground(new Color(0, 0, 51));
        jLabelNome.setText("Nome:*");

        jLabelSobrenome.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSobrenome.setForeground(new Color(0, 0, 51));
        jLabelSobrenome.setText("Sobrenome:*");

        jLabelNumero.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumero.setForeground(new Color(0, 0, 51));
        jLabelNumero.setText("Número:*");

        jLabelAniversario.setBackground(new Color(0, 0, 51));
        jLabelAniversario.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAniversario.setForeground(new Color(0, 0, 51));
        jLabelAniversario.setText("Aniversário:");

        jLabelEndereco.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEndereco.setForeground(new Color(0, 0, 51));
        jLabelEndereco.setText("Endereço:");

        jLabelRelacionamento.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRelacionamento.setForeground(new Color(0, 0, 51));
        jLabelRelacionamento.setText("Relacionamento:");

        jLabelRedeSocial.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRedeSocial.setForeground(new Color(0, 0, 51));
        jLabelRedeSocial.setText("Rede Social:");

        jComboBoxRelacionamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indefinido", "Colega", "Família", "Amigo", "Inimigo", "Emergência"}));
        jComboBoxRedeSocial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefone", "Whatsapp", "Telegram"}));


        try {
            jCampoNumero.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCampoNumero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCampoNumeroActionPerformed(evt);
            }
        });

        try {
            jCampoAniversario.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBoxRelacionamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBoxRelacionamentoActionPerformed(evt);
            }
        });

        jComboBoxRedeSocial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jComboBoxRedeSocialActionPerfomed(evt);
            }
        });

        jButton1.setBackground(new Color(0, 204, 0));
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("Confirmar");

        jButton2.setBackground(new Color(255, 0, 0));
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setText("Apagar Tudo");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jButton2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                        .addComponent(jSeparator1, GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );


        jSeparator3.setOrientation(SwingConstants.VERTICAL);

        GroupLayout jPainelPrincipalLayout = new GroupLayout(jPainelPrincipal);
        jPainelPrincipal.setLayout(jPainelPrincipalLayout);
        jPainelPrincipalLayout.setHorizontalGroup(
                jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNumero)
                                        .addComponent(jLabelNome)
                                        .addComponent(jLabelSobrenome)
                                        .addComponent(jLabelAniversario)
                                        .addComponent(jLabelEndereco)
                                        .addComponent(jLabelRedeSocial)
                                        .addComponent(jLabelRelacionamento))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxRedeSocial, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxRelacionamento, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCampoEndereco, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCampoAniversario, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCampoNumero, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCampoSobrenome, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCampoNome, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPainelPrincipalLayout.setVerticalGroup(
                jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPainelPrincipalLayout.createSequentialGroup()
                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPainelPrincipalLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelNome)
                                                                        .addComponent(jCampoNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelSobrenome)
                                                                        .addComponent(jCampoSobrenome, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelNumero)
                                                                        .addComponent(jCampoNumero, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelAniversario)
                                                                        .addComponent(jCampoAniversario, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelEndereco)
                                                                        .addComponent(jCampoEndereco, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelRelacionamento)
                                                                        .addComponent(jComboBoxRelacionamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelRedeSocial)
                                                                        .addComponent(jComboBoxRedeSocial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jSeparator2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 245, Short.MAX_VALUE))
                                        .addGroup(jPainelPrincipalLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator3)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPainelPrincipal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPainelPrincipal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);

        if (contato != null) {
            exibirContato(contato);
        }

        jButton1.addActionListener(e -> {
            if (contato != null) {
                editarContato(index);
            } else {
                adicionarContato();
            }
        });
        jButton2.addActionListener(e -> limparCampos());
    }

    private void jCampoNumeroActionPerformed(ActionEvent evt) {
        // Código a ser adicionado ainda. (Kaik)
    }

    private void jComboBoxRelacionamentoActionPerformed(ActionEvent evt) {
        // Código a ser adicionado ainda. (Kaik)
    }

    private void jComboBoxRedeSocialActionPerfomed(ActionEvent evt){
        // Código a ser adicionado ainda. (Kaik)
    }

    private void adicionarContato() {
        String nome = jCampoNome.getText();
        String sobrenome = jCampoSobrenome.getText();
        String numero = jCampoNumero.getText();
        String relacionamento = jComboBoxRelacionamento.getSelectedItem().toString();
        String redeSocial = jComboBoxRedeSocial.getSelectedItem().toString();
        String aniversario = jCampoAniversario.getText();
        String endereco = jCampoEndereco.getText();
        System.out.println(redeSocial + relacionamento);

        if (!nome.trim().isEmpty() && !sobrenome.trim().isEmpty() && !numero.replaceAll("[^0-9]", "").trim().isEmpty()) {
            Validator<String> validatorNumber = new NumberValidator(true);
            Validator<String> validatornName = new NameValidator();

            if (validatorNumber.validate(numero) && validatornName.validate(nome + sobrenome)) {
                agenda.adicionaContato(nome, sobrenome, numero, Relacionamento.valueOf(relacionamento), RedeSocial.valueOf(redeSocial), aniversario, endereco);

                limparCampos();

                // atualiza lista de contatos após adição
                main.atualizarListaContatos();

                JOptionPane.showMessageDialog(this, "Contato salvo ✅");
                dispose();
            } else if (!validatorNumber.validate(numero)){
                JOptionPane.showMessageDialog(this, "Número já cadastrado.");
            } else if (!validatornName.validate(nome + sobrenome)) {
                JOptionPane.showMessageDialog(this, "Nome e sobrenome já existentes.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios (*).");
        }
    }

    private void exibirContato(Contato contato) {
        jCampoNome.setText(contato.getNome());
        jCampoSobrenome.setText(contato.getSobrenome());
        jCampoNumero.setText(contato.getNumero());
        jCampoAniversario.setText(contato.getAniversario());
    }

    private void editarContato(int index) {
        agenda.removerContato(index);
        adicionarContato();
    }

    private void limparCampos() {
        jCampoNome.setText("");
        jCampoSobrenome.setText("");
        jCampoNumero.setText("");
        jCampoAniversario.setText("");
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWindow().setVisible(true);
            }
        });
    }
}
