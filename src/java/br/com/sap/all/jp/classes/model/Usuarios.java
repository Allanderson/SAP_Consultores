

package br.com.sap.all.jp.classes.model;

/**
 *
 * @author Paulinho
 */
public class Usuarios {
    private String usuario = null;
    private String senha = null;
    private int nivel;
    private String nomecompleto = null;
    
    public boolean verificarUsuario (){
        if (this.usuario != null && this.senha != null){
            if (this.usuario.equals("jp") && this.senha.equals("123"))
            return true;
        }
        return false;    
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }
    
}