import java.io.IOException;
import java.io.Serializable;

<<<<<<< Updated upstream


public class Cliente extends Pessoa implements Serializable {
    public void gravarPessoa(){}
=======
public class Cliente extends Pessoa implements Serializable {

    public void gravarPessoa(Cliente c){
        try {
            serializador.gravar(c.getCpf() + ".cliente", c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recuperarPessoa(Cliente c, String nome_arquivo) {
        try {
            Cliente cliente = (Cliente) serializador.ler(nome_arquivo);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void editarPessoa(String nome_arquivo) {
        try {
            Cliente cliente = (Cliente) serializador.ler(nome_arquivo);

            serializador.gravar(nome_arquivo, cliente);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

>>>>>>> Stashed changes

    public Cliente(int id, String nome, int cpf, String logradouro, String bairro, String cidade, String estado, String telefone, String email){
        super(id, nome, cpf, logradouro, bairro, cidade, estado, telefone, email);
    }
    public Cliente() {
        super();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
