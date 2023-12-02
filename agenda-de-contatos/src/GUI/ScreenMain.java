//package GUI;
//
//import Validators.NumberValidator;
//import Validators.Validator;
//import domain.Agenda;
//import domain.Contato;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class ScreenMain extends JFrame {
//
//    private final Agenda agenda = Agenda.getInstance();
//    private DefaultListModel<String> modeloLista;
//    private JTextField campoNome;
//    private JTextField campoSobrenome;
//    private JTextField campoNumero;
//    private JList<String> listaContatosUI;
//
//
//    public ScreenMain() {
//        modeloLista = new DefaultListModel<>();
//
//        // Componentes da interface
//        JLabel labelNome = new JLabel("Nome:*");
//        labelNome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kaik Aciole\\Documents\\POO\\agendaDeContatos\\agenda-de-contatos\\src\\img\\adicionar-contato.png"));
//
//        JLabel labelsobrenome = new JLabel("Sobrenome:");
//        JLabel labelNumero = new JLabel("Numero:*");
//
//        campoNome = new JTextField(20);
//        campoSobrenome = new JTextField(20);
//        campoNumero = new JTextField(20);
//
//        JButton botaoAdicionar = new JButton("Adicionar");
//        botaoAdicionar.setBounds(80,160,80,40);
//        botaoAdicionar.setFont(new Font("Arial", Font.BOLD, 20));
//        botaoAdicionar.setBackground(new Color(105, 208, 186));
//        botaoAdicionar.setForeground(new Color(10,10,10));
//        botaoAdicionar.addActionListener(e -> adicionarContato());
//        botaoAdicionar.addActionListener(e -> adicionarContato());
//
//
//        JButton botaoExibir = new JButton("Exibir");
//        botaoExibir.addActionListener(e -> exibirContato(listaContatosUI.getSelectedIndex()));
//
//        listaContatosUI = new JList<>(modeloLista);
//
//        // Layout da interface
//        setLayout(new BorderLayout());
//
//        JPanel painelFormulario = new JPanel(new GridLayout(8, 3));
//        painelFormulario.add(labelNome);
//        painelFormulario.add(campoNome);
//        painelFormulario.add(labelsobrenome);
//        painelFormulario.add(campoSobrenome);
//        painelFormulario.add(labelNumero);
//        painelFormulario.add(campoNumero);
//
//        JPanel painelBotoes = new JPanel();
//        painelBotoes.add(botaoAdicionar);
//        painelBotoes.add(botaoExibir);
//
//        add(painelFormulario, BorderLayout.NORTH);
//        add(painelBotoes, BorderLayout.CENTER);
//        add(new JScrollPane(listaContatosUI), BorderLayout.SOUTH);
//
//        // Configurações da janela
//        setTitle("Agenda de Contatos");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    private void adicionarContato() {
//        String nome = campoNome.getText();
//        String sobrenome = campoSobrenome.getText();
//        String numero = campoNumero.getText();
//
//
//        if (!nome.isEmpty() && !numero.isEmpty()) {
//            Validator<String> validator = new NumberValidator(true);
//
//            if (validator.validate(numero)) {
//                agenda.adicionaContato(nome, sobrenome, numero);
//                modeloLista.addElement(nome + " " + sobrenome + " - " + numero);
//
//                // Limpar campos após adicionar
//                campoNome.setText("");
//                campoSobrenome.setText("");
//                campoNumero.setText("");
//            } else {
//                JOptionPane.showMessageDialog(this, "Número inválido ou já cadastrado (formato: (xx)xxxxx-xxxx");
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
//        }
//    }
//
//    private void exibirContato(int index) {
//        Contato contato = agenda.get(index);
//
//        ScreenContato window = new ScreenContato(contato);
//        window.show();
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new ScreenMain());
//    }
//}