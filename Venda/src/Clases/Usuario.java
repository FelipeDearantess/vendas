
package Clases;


public class Usuario {
    private String idUSuario;
    private String nome;
    private String snome;
    private String senha;
    private int perfil;
  

    public Usuario(String idUSuario, String nome, String snome, String senha, int perfil) {
        this.idUSuario = idUSuario;
        this.nome = nome;
        this.snome = snome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdUSuario() {
        return idUSuario;
    }

    public void setIdUSuario(String idUSuario) {
        this.idUSuario = idUSuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
}

   
    
  

