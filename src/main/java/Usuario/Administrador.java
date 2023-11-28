package Usuario;

public class Administrador {
    private int idadm;
    private String cpd;
    private String senha;

    public Administrador(String cpd, String senha) {
        this.cpd = cpd;
        this.senha = senha;
    }

   
    public int getIdAdministrador() {
        return idadm;
    }

    public void setIdAdministrador(int idadm) {
        this.idadm = idadm;
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
