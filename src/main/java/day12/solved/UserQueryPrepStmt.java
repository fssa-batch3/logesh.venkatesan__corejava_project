package day12.solved;





import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import day11.solved.ConnectionUtil;




//Explain in class what is the difference between Statement and PreparedStatement 
public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String query ="INSERT INTO USER (username, email,  password) VALUES ( ?, ?, ? );";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, "vasanth");
		pst.setString(2, "jayaprakash.jaisankar@fssa.freshworks.com");
		pst.setString(3, "password007");
		System.out.println(pst.toString());
		int rows2 = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2 );
		pst.close();
	
	}
	
}