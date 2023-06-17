import java.io.*;

public class serializador {
    public static void gravar(String nome_arquivo, Object objeto) throws IOException {
        FileOutputStream arquivo = new FileOutputStream(nome_arquivo);
        ObjectOutputStream escreve = new ObjectOutputStream(arquivo);

        escreve.writeObject(objeto);

        arquivo.close();
        escreve.close();

    }

    public static Object ler(String nome_arquivo) throws IOException, ClassNotFoundException{
        FileInputStream arquivo = new FileInputStream(nome_arquivo);
        ObjectInputStream leitura = new ObjectInputStream(arquivo);

        Object objeto = leitura.readObject();

        arquivo.close();
        leitura.close();

        return objeto;

    }
}
