package javajichu_11;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("������δ�ҵ�");

		}
	}

}
