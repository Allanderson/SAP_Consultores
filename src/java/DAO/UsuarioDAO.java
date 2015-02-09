/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexaoBanco.ConnectionFactory;
import javaBeans.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        this.conexao = new ConnectionFactory().getConnectionFactory();
    }

    public boolean inserirUsuario(Usuario usuario) {
        String sql = "insert into usuario(nivel, id, nome, endereco, email, "
                + "telefone, login, senha)";
        try {
            pstm = this.conexao.prepareStatement(sql);

            pstm.setInt(1, usuario.getNivel());
            pstm.setLong(2, usuario.getId());
            pstm.setString(3, usuario.getNome());
            pstm.setString(4, usuario.getEndereco());
            pstm.setString(5, usuario.getEmail());
            pstm.setString(6, usuario.getTelefone());
            pstm.setString(7, usuario.getLogin());
            pstm.setString(8, usuario.getSenha());

            int inserir = pstm.executeUpdate();

            if (inserir == 1) {
                return true;
            }
        } catch (SQLException sqlex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException sqlex1) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, sqlex1);
            }
        }
        return false;
    }

    public boolean verificarUsuario(Usuario usuario) {
        String sql = "select * from usuario where login=? and senha=?";
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario.getLogin());
            pstm.setString(2, usuario.getSenha());
            rs = pstm.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException sqlex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException sqlex1) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, sqlex1);
            }
        }
        return false;
    }

    public Usuario getUsuario(String usuario, String senha) {
        String sql = "select * from usuario where login=? and senha=?";
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();

            if (rs.next()) {
                Usuario usuarios = new Usuario();
                usuarios.setLogin(usuario);
                usuarios.setSenha(senha);
                usuarios.setNivel(rs.getInt("nivel"));
                usuarios.setNome(rs.getString("nome"));
                return usuarios;
            }

        } catch (SQLException sqlex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, sqlex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException sqlex1) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, sqlex1);
            }
        }
        return null;
    }
}
