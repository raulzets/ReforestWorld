/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RW.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rauls
 */
public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    String sql = 
    "INSERT INTO users(id, nome, email, senha) values (null,'"+nome+"','"+email+"','"+senha+"');";
    System.out.println(sql);
    PreparedStatement statment = conexao.prepareStatement(sql);
    statment.execute();
    conexao.close();
    }
    
}