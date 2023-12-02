/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Validators.NumberValidator;
import Validators.Validator;
import domain.Agenda;

import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author Kaik Aciole
 */
public class AddWindow extends JFrame {
    private final Agenda agenda = Agenda.getInstance();
    private final MainWindow main = MainWindow.getInstance();

    private JButton jButton1;
    private JButton jButton2;
    private JFormattedTextField jCampoAniversario;
    private JTextField jCampoEndereco;
    private JTextField jCampoNome;
    private JFormattedTextField jCampoNumero;
    private JTextField jCampoRedeSocial;
    private JTextField jCampoRelacionamento;
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

    /**
     * Creates new form AddWindow
     */
    public AddWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPainelPrincipal = new JPanel();
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
        jCampoRelacionamento = new JTextField();
        jCampoRedeSocial = new JTextField();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(457, 586));

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 0, 51));
        jLabelNome.setText("Nome:*");

        jLabelSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSobrenome.setForeground(new java.awt.Color(0, 0, 51));
        jLabelSobrenome.setText("Sobrenome:*");

        jLabelNumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(0, 0, 51));
        jLabelNumero.setText("Número:*");

        jLabelAniversario.setBackground(new java.awt.Color(0, 0, 51));
        jLabelAniversario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAniversario.setForeground(new java.awt.Color(0, 0, 51));
        jLabelAniversario.setText("Aniversário:");

        jLabelEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(0, 0, 51));
        jLabelEndereco.setText("Endereço:");

        jLabelRelacionamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRelacionamento.setForeground(new java.awt.Color(0, 0, 51));
        jLabelRelacionamento.setText("Relacionamento:");

        jLabelRedeSocial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRedeSocial.setForeground(new java.awt.Color(0, 0, 51));
        jLabelRedeSocial.setText("Rede Social:");

        try {
            jCampoNumero.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCampoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoNumeroActionPerformed(evt);
            }
        });

        try {
            jCampoAniversario.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jCampoRelacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoRelacionamentoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Apagar Tudo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        jButton1.addActionListener(e -> adicionarContato());

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
                                        .addComponent(jCampoRedeSocial, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCampoRelacionamento, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
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
                                                                        .addComponent(jCampoRelacionamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPainelPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelRedeSocial)
                                                                        .addComponent(jCampoRedeSocial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
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
    }// </editor-fold>

    private void jCampoNumeroActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCampoRelacionamentoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void adicionarContato() {
        String nome = jCampoNome.getText();
        String sobrenome = jCampoSobrenome.getText();
        String numero = jCampoNumero.getText();


        if (!nome.trim().isEmpty() && !sobrenome.trim().isEmpty() && !numero.replaceAll("[^0-9]", "").trim().isEmpty()) {
            Validator<String> validator = new NumberValidator(true);

            if (validator.validate(numero)) {
                agenda.adicionaContato(nome, sobrenome, numero);
                main.atualizarListaContatos();
            } else {
                JOptionPane.showMessageDialog(this, "Número já cadastrado.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios (*).");
        }
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWindow().setVisible(true);
            }
        });
    }
}
