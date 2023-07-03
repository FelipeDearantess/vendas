
package Clases;

public class Dados {
    private int maxUsu=50;
    private Usuario msUsuarios []= new Usuario[maxUsu];
    private int conUsu=0;
    
    public Dados(){
        Usuario mUsuario = new Usuario("san","san1","san2","123",1);
        msUsuarios[conUsu]= mUsuario;
        conUsu++;
    }
    public int numeroUsuarios(){
        return conUsu;
    }
    public Usuario[]getUsuarios(){
        return msUsuarios;
    }
    public boolean validarUsuario(String usuario,String senha){
        boolean aux =false;
        for(int i =0;i<conUsu;i++){
            if(msUsuarios[i].getIdUSuario().equals(usuario)&&
                msUsuarios[i].getSenha().equals(senha)){
           return true;
       }
       }
       return false;
    }
public int PosicaoUsuario(String usuario){
            for(int i =0;i<conUsu;i++){
            if(msUsuarios[i].getIdUSuario().equals(usuario)){
           return i;
       }
       }
       return -1;
    }

public String adicionarUsuario(Usuario msUsuario){
    if(conUsu == maxUsu){
        return "Nao e Possivel Cadastrar Mais Usuario(Maximo Atingido)";
        }
        msUsuarios[maxUsu] = msUsuario;
        conUsu++;
        return "Usuario Cadastrado Com sucesso";
    }    
    }
