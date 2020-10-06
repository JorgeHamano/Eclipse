import java.sql.*;

public class ClasseConexao {
/** Parâmetros para conexão. */
private Connection conexao;
private String Server ="jdbc:mysql://localhost:3306/cadastro?useSSL=false&serverTimezone=UTC";
private String usuario="root";
private String senha="";
/** Criando a conexão no construtor. */
public ClasseConexao() {
try {
Class.forName("com.mysql.jdbc.Driver");
conexao = DriverManager.getConnection(Server,usuario,senha);
}catch(Exception ex) {
ex.printStackTrace();
}
}
/** Criando um método para acessar a conexão. */
public Connection getConexao() {
return conexao;
}
}