//package GUI;
//
//import domain.Agenda;
//import domain.Contato;
//import domain.Relacionamento;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class ScreenContato extends JFrame {
//    private final Agenda agenda = Agenda.getInstance();
//    private DefaultListModel<String> modeloLista;
//
//    private JTextField campoNome;
//    private JTextField campoSobrenome;
//    private JTextField campoNumero;
//    private JTextField campoRelacionamento;
//    private JTextField campoRedeSocial;
//    private JTextField campoAniversario;
//    private JTextField campoEndereco;
//
//    public ScreenContato(Contato contato) {
//        modeloLista = new DefaultListModel<>();
//
//        // Componentes da interface
//        JLabel labelNome = new JLabel("Nome:*");
//        campoNome = new JTextField(20);
//        campoNome.setText(contato.getNome());
//
//        JLabel labelsobrenome = new JLabel("Sobrenome:");
//        campoSobrenome = new JTextField(20);
//        campoSobrenome.setText(contato.getSobrenome());
//
//        JLabel labelNumero = new JLabel("Numero:*");
//        campoNumero = new JTextField(20);
//        campoNumero.setText(contato.getNumero());
//
//        JLabel labelRelacionamento = new JLabel("Relacionamento:");
//        campoRelacionamento = new JTextField(20);
//        campoRelacionamento.setText(contato.getRelacionamento().toString());
//
//        JLabel labelRedeSocial = new JLabel("Rede social:");
//        campoRedeSocial = new JTextField(20);
//        campoRedeSocial.setText(contato.getRedeSocial().toString());
//
//        JLabel labelAniversario = new JLabel("Aniversario:");
//        campoAniversario = new JTextField(20);
//        campoAniversario.setText(contato.getAniversario());
//
//        JLabel labelEndereco = new JLabel("Endereço:");
//        campoEndereco = new JTextField(20);
//        campoEndereco.setText(contato.getEndereco());
//
//        JButton botaoEditar = new JButton("Editar");
//        botaoEditar.addActionListener(e -> editarContato(contato.getNome(), contato.getSobrenome()));
//
//        // Layout da interface
//        setLayout(new BorderLayout());
//
//        JPanel painelFormulario = new JPanel(new GridLayout(7, 7));
//
//        painelFormulario.add(labelNome);
//        painelFormulario.add(campoNome);
//
//        painelFormulario.add(labelsobrenome);
//        painelFormulario.add(campoSobrenome);
//
//        painelFormulario.add(labelNumero);
//        painelFormulario.add(campoNumero);
//
//        painelFormulario.add(labelRelacionamento);
//        painelFormulario.add(campoRelacionamento);
//
//        painelFormulario.add(labelRedeSocial);
//        painelFormulario.add(campoRedeSocial);
//
//        painelFormulario.add(labelAniversario);
//        painelFormulario.add(campoAniversario);
//
//        painelFormulario.add(labelEndereco);
//        painelFormulario.add(campoEndereco);
//
//
//        JPanel painelBotoes = new JPanel();
//        painelBotoes.add(botaoEditar);
//
//        add(painelFormulario, BorderLayout.NORTH);
//        add(painelBotoes, BorderLayout.CENTER);
//
//        // Configurações da janela
//        setTitle("Agenda de Contatos");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    private void editarContato(String nome, String sobrenome) {
//        String nomeSobrenome = nome + " " + sobrenome;
//
//        agenda.setNome(nomeSobrenome, campoNome.getText());
//        agenda.setSobrenome(nomeSobrenome, campoSobrenome.getText());
//        agenda.setNumero(nomeSobrenome, campoNumero.getText());
//        //agenda.setRelacionamento(nomeSobrenome, campoRelacionamento.getText());
//        //agenda.setRedeSocial(nomeSobrenome, campoRedeSocial.getText());
//        agenda.setEndereco(nomeSobrenome, campoEndereco.getText());
//        agenda.setAniversario(nomeSobrenome, campoNumero.getText());
//    }
//}
