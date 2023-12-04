package repository;

import domain.Agenda;
import domain.Contato;
import domain.RedeSocial;
import domain.Relacionamento;

import java.io.*;

public class CSVDataService {
    private static final Agenda agenda = Agenda.getInstance();
    private static final ContatoRepository repository = ContatoRepository.getInstance();

    private static String tratarNulo(String str) {
        return str == null ? "" : str;
    }

    public static void exportar() {

        try {
            OutputStream fos = new FileOutputStream("agenda.csv");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Nome;Sobrenome;Numero;Relacionamento;Endereço;Aniversario;RedeSocial");

            for (Contato contato : agenda.listarContatos()) {
                String escreveContato = contato.getNome() + ";" + contato.getSobrenome() + ";" + contato.getNumero() + ";" +
                        tratarNulo(contato.getRelacionamento().toString()) + ";" + tratarNulo(contato.getEndereco()) + ";" +
                        tratarNulo(contato.getAniversario()) + ";" + tratarNulo(contato.getRedeSocial().toString());
                bw.newLine();
                bw.write(escreveContato);
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void importar() {
        try {
            InputStream is = new FileInputStream("agenda.csv");
            Reader reader = new InputStreamReader(is);
            BufferedReader bufReader = new BufferedReader(reader);
            String line = null;

            bufReader.readLine();
            while ((line = bufReader.readLine()) != null) {
                String[] data = line.split(";");
                Contato contato = new Contato(data[0], data[1], data[2]);
                contato.setRelacionamento(Relacionamento.valueOf(data[3].toUpperCase()));
                contato.setEndereco(data[4]);
                contato.setAniversario(data[5]);
                contato.setRedeSocial(RedeSocial.valueOf(data[6].toUpperCase()));

                repository.add(contato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
