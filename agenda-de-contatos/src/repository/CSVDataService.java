package repository;

import domain.Contato;
import domain.RedeSocial;
import domain.Relacionamento;

import java.io.*;

public class CSVDataService extends InMemoryDataService {

    public CSVDataService() {
        File file = new File("agenda.csv");

        if (file.exists()) {
            try (InputStream is = new FileInputStream(file)) {
                Reader reader = new InputStreamReader(is);
                BufferedReader bufReader = new BufferedReader(reader);
                String line = null;

                while ((line = bufReader.readLine()) != null) {
                    String[] data = line.split(";");
                    Contato c = new Contato(data[0], data[1], data[2]);
                    c.setRelacionamento(Relacionamento.valueOf(data[3]));
                    c.setEndereco(data[4]);
                    c.setAniversario(data[5]);
                    c.setRedeSocial(RedeSocial.valueOf(data[6]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    @Override
    public void add(Contato c) {
        super.add(c);
        try {
            exportar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String tratarNulo(String str) {
        return str == null ? "" : str;
    }

    public void exportar() throws IOException {
        OutputStream fos = new FileOutputStream("agenda.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Nome;Sobrenome;Numero;Relacionamento;Endereço;Aniversario;RedeSocial");

        for (Contato contato : contatos) {
            String escreveContato =  contato.getNome() + ";" +  contato.getSobrenome() + ";" + contato.getNumero() + ";" +
                    tratarNulo(contato.getRelacionamento().toString()) + ";" + contato.getEndereco() + ";" +
                    tratarNulo(contato.getAniversario()) + ";" + tratarNulo(contato.getRedeSocial().toString());
            bw.newLine();
            bw.write(escreveContato);
        }

        bw.close();
    }
}
