package GUI;

import domain.Agenda;
import domain.Contato;

import javax.swing.*;
import java.awt.*;



public class MainWIndow extends JFrame {

    /* variaveis inicializadas */

    private DefaultListModel<String> modeloLista;

    private JButton adicionar;
    private final Agenda agenda = Agenda.getInstance();
    private JButton editar;
    private JButton excluir;
    private JPanel painelPrincipal;
    private JList<String> listaContatosUI;


    public MainWIndow(){
        setTitle("Agenda de Contatos");
        setVisible(true);
        setSize(450, 500);
        setBackground(new Color(158, 59, 59));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JList lista = new JList();
        lista.setBounds(0, 0, 450, 380);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());

        JPanel painelLista = new JPanel();
        painelLista.setBounds(0, 0, JFrame.MAXIMIZED_HORIZ, 380);
        painelLista.setBackground(new Color(255, 255, 255));
        painelLista.setAutoscrolls(true);
//        painelLista.setLayout(new );
        painelLista.add(lista);


        JButton adicionar = new JButton("Adicionar");
        adicionar.setBounds(10, 400, 130, 50);
        adicionar.setBackground(new Color(20, 19, 45));
        adicionar.setForeground(new Color(255, 255, 255));
        adicionar.addActionListener(e -> Adicionar(listaContatosUI.getSelectedIndex()));

        JButton editar = new JButton("Editar");
        editar.setBounds(150, 400, 130,50);
        editar.setBackground(new Color(20, 19, 45));
        editar.setForeground(new Color(255, 255, 255));

        JButton excluir = new JButton("Excluir");
        excluir.setBounds(290, 400, 130, 50);
        excluir.setBackground(new Color(20, 19, 45));
        excluir.setForeground(new Color(255, 255, 255));




        add(adicionar);
        add(editar);
        add(excluir);
        add(painelLista);


    }

    private void Adicionar(int index){
        Contato contato = agenda.get(index);
        ScreenContato window = new ScreenContato(contato);
        window.show();
    }


    public static void main(String[] args) {
        new MainWIndow();
    }
}
