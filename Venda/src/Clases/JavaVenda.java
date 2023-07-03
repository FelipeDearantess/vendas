package Clases;

import Formularios.FrmLogin;


public class JavaVenda {

  
    public static void main(String[] args) {
       Dados msDados = new Dados();
       FrmLogin miLogin = new FrmLogin();
       miLogin.setDados(msDados);
       miLogin.setLocationRelativeTo(null);
       miLogin.setVisible(true);
    }
    
}
