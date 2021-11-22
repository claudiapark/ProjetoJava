package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;


import model.DAO;

public class Aluno {
	private String nome;
	private int idade;
	private String fone;
	private String email;
	
	
	
public Aluno(String nome, int idade, String fone, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.fone = fone;
		this.email = email;
	}

public Aluno() {
		super();
		
	}
	//getters/setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void inserir () throws Exception{
		String sql = "INSERT INTO tb_aluno (nome, idade, fone, email) VALUES (?, ?, ?, ?)";
		Connection conn = DAO.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nome);
		ps.setInt(2, idade);
		ps.setString(3, fone);
		ps.setString(4, email);
		ps.execute();
		ps.close();
		conn.close();
		}
	
	
	
}
