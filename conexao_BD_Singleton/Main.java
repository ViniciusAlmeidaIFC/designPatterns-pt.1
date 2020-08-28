package conexao_BD_Singleton;

public class Main {

	public static void main(String[] args) {
		
		String user = "root" ;
		String senha=  "";
		String url = "jdbc:mysql://localhost/mvcsimplesjdbc";
		String driver = "com.mysql.jdbc.Driver";
		
		ConexaoSIE con = ConexaoSIE.getInstancia();
		con.setSenha(senha);
		con.setUrl(url);
		con.setUser(user);
		con.setDriver(driver);
		System.out.println(con);
		con = ConexaoSIE.getInstancia();
		System.out.println(con);
		

	}

}
