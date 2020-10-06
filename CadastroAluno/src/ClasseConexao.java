import java.sql.*;

public class ClasseConexao {
/** Par�metros para conex�o. */
private Connection conexao;
private String Server ="jdbc:mysql://localhost:3306/cadastro?useSSL=false&serverTimezone=UTC";
private String usuario="root";
private String senha="";
/** Criando a conex�o no construtor. */
public ClasseConexao() {
try {
Class.forName("com.mysql.jdbc.Driver");
conexao = DriverManager.getConnection(Server,usuario,senha);
}catch(Exception ex) {
ex.printStackTrace();
}
}
/** Criando um m�todo para acessar a conex�o. */
public Connection getConexao() {
return conexao;
}
}