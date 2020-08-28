package conexao_BD_Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoSIE {

	private Connection conexao;

	private String url;

	private String user;

	private String senha;

	private Statement st;
	
	private String driver;

	// varivel para utilizada para implementar padrao singleton
	private static ConexaoSIE instancia;
	
	private ConexaoSIE() {
		this.url = "jdbc:mysql://localhost/mvcsimplesjdbc";
		this.user = "root";
		this.senha = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver nao encontrdao!");
		}

		try {
			this.conexao = DriverManager.getConnection(this.url, this.user,
					this.senha);
			System.out.println("Conexão realizada com sucesso!");

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	// retorna a instancia da conexao ativa
	public synchronized static ConexaoSIE getInstancia() {
		if (instancia == null) {
			instancia = new ConexaoSIE();
		}
		return instancia;
	}

	public Connection getConexao() {
		return conexao;
	}

	// recebe a sql, executa a consulta e retorna um ResultSet
	public synchronized ResultSet executa(String sql) {
		try {
			this.st = this.conexao.createStatement();
			return st.executeQuery(sql);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	/**
	 * @return the st
	 */
	public Statement getSt() {
		return st;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConexaoSIE [conexao=");
		builder.append(conexao);
		builder.append(", url=");
		builder.append(url);
		builder.append(", user=");
		builder.append(user);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", st=");
		builder.append(st);
		builder.append(", driver=");
		builder.append(driver);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
