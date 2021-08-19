package javajichu_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2_1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb",
					"root","0512");
			Statement st=conn.createStatement();
			String sql="insert into student values(0,'小明')";
			int i=st.executeUpdate(sql);
			if(i==1) {
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
			}
			st.close();
			conn.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("驱动类不存在");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("地址不正确，或用户名密码错误");
		}
	}

}
