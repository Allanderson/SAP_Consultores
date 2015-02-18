/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexao.ConnectionFactory;
import javabeans.Usuario;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allanderson Nunes
 */
public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    public UsuarioDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public boolean setUsuario(Usuario usuario) {
        return false;
    }

    public List getUsuario(String login, String senha) {
        String sql = "select * from usuario where login = ? and senha = ?";
        /*try{
         pstm = conexao.prepareStatement(sql);
         pstm.setString(1, login);
         pstm.setString(2, senha);
         rs = pstm.executeQuery();
            
         List<Usuario> retornarUsuario = new ArrayList<Usuario>();
            
         while(rs.next()){
         Usuario usuario = new Usuario();
         usuario.setLogin(login);
         usuario.setSenha(senha);
         usuario.setId(rs.getInt("id"));
         }
         }
         */
        return null;
    }

    public boolean updateUsuario(Usuario usuario) {
        return false;
    }

    public boolean deleteUsuario(Usuario usuario) {
        return false;
    }

    public List listarUsuariosClientes() {
        try {

            String sql = "select id, nome, endereco, telefone from usuario "
                    + "where nivel = 3";
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<Usuario> listarUsuarios = new ArrayList<Usuario>();

            while (rs.next()) {
                Usuario usuarios = new Usuario();
                usuarios.setId(rs.getInt("id"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setEndereco(rs.getString("endereco"));
                usuarios.setTelefone(rs.getString("telefone"));
                System.out.println("Nome: " + usuarios.getNome());
                listarUsuarios.add(usuarios);
            }

            return listarUsuarios;
        } catch (SQLException sqlex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
                    null, sqlex);
        }
        return null;

    }
}
