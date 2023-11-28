
package Usuario;

public class Pessoa {
    private int idpessoa;
    private String nome;
    private String contato;
    private String cpd;
    private String senha;

    public Pessoa(String nome, String contato, String cpd, String senha) {
        this.nome = nome;
        this.contato = contato;
        this.cpd = cpd;
        this.senha = senha;
    }

    public Pessoa(String cpd, String senha) {
        this.cpd = cpd;
        this.senha = senha;
    }

    
    
   
    public int getIdPessoa() {
        return idpessoa;
    }

    public void setIdPessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCPD() {
        return cpd;
    }

    public void setCPD(String CPD) {
        this.cpd = CPD;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
