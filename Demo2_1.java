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
			String sql="insert into student values(0,'С��')";
			int i=st.executeUpdate(sql);
			if(i==1) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}
			st.close();
			conn.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("�����಻����");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("��ַ����ȷ�����û����������");
		}
	}

}
