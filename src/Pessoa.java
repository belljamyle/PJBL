public abstract class Pessoa {
    public String nome;
    public int cpf;
    public String logradouro;
    public String bairro;
    public String cidade;
    public String telefone;
    public String email;

    abstract public void gravarPessoa();
    public Pessoa(String nome, int cpf, String logradouro, String bairro, String cidade, String telefone, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.email = email;
    }
    public Pessoa() {}

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
