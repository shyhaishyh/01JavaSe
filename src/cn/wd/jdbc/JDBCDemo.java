package cn.wd.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class JDBCDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("无法找到驱动类！");
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			Statement stmt = conn.createStatement();
//			String sql = "insert into student(name,saddress,sgrade,semail) values('阿潘','弘毅楼',4,'apan@qq.com')";
//			System.out.println("建立连接成功！");
//			stmt.execute(sql);
			String sql = "select * from student";
			ResultSet rs = stmt.executeQuery(sql);
			Set<Student> set = new HashSet<Student>();
			while(rs.next()){
				Student student = new Student();
				student.setName(rs.getString("name"));
				student.setScode(rs.getInt("scode"));
				student.setSaddress(rs.getString("saddress"));
				student.setSgrade(rs.getInt("sgrade"));
				student.setSemail(rs.getString("semail"));
				set.add(student);
			}
			for (Student student : set) {
				System.out.println(student);
			}
			
		} catch (SQLException e) {
			System.out.println("插入失败！");
			e.printStackTrace();
		}

	}
}
