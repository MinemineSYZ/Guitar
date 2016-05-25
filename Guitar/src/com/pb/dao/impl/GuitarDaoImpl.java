
package com.pb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.pb.dao.IGuitarDao;
import com.pb.dao.db.DBAccess;
import com.pb.pojo.Guitar;
import com.pb.pojo.GuitarSpec;

public class GuitarDaoImpl implements IGuitarDao{
	
	
	
	@Override
	public void addGuitar(Guitar guitar) throws Exception {
		
		//连接数据库
		Connection conn=DBAccess.getConnection();
		 Statement st=conn.createStatement();
		 //SQL
		  try {
			  try {
		            String sql = "INSERT INTO guitar(serialNumber, price, builder,model, type, backWood, topWood)"
		                    + " VALUES ('55514', 3000, 'Ted', 'HH', 'electric', 'Alex', 'Wood')";  // 插入数据的sql语句
		             
		            st = (Statement) conn.createStatement();    // 创建用于执行静态sql语句的Statement对象
		             
		            int count = st.executeUpdate(sql);  // 执行插入操作的sql语句，并返回插入数据的个数
		             
		            System.out.println("向guitar表中插入 " + count + " 条数据"); //输出插入操作的处理结果
		             
		            conn.close();   //关闭数据库连接
	             
	        } catch (SQLException e) {
	            System.out.println("插入数据失败" + e.getMessage());
	        }
		 
		  }	
	

	@Override
	public Guitar getGuitarByNum(Guitar guitar) {
		// TODO Auto-generated method stub
		//连接数据库
		Connection conn=DBAccess.getConnection();
		 Statement st=conn.createStatement();
		 Guitar guit;
		 try {
	            String sql = "select * from staff where serialNumber like %"+guitar.getSerialNumber()+"%";     // 查询数据的sql语句
	            st = (Statement) conn.createStatement();    //创建用于执行静态sql语句的Statement对象，st属局部变量
	             
	            ResultSet rs = st.executeQuery(sql);    //执行sql查询语句，返回查询数据的结果集
	            System.out.println("最后的查询结果为：");
	            while (rs.next()) { // 判断是否还有下一个数据
	                 
	                // 根据字段名获取相应的值
	                String name = rs.getString("nameyj");
	                int age = rs.getInt("age");
	                String sex = rs.getString("sex");
	                String address = rs.getString("address");
	                String depart = rs.getString("depart");
	                String worklen = rs.getString("worklen");
	                String wage = rs.getString("wage");
	                 
	               //封装数据字段
	                
	                
	                guit=new Guitar();
	             
	              
	             
	            }
	            conn.close();   //关闭数据库连接
		return guit;
	}




	@Override
	public List<Guitar> search() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void delete(Guitar guitar) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void update(Guitar guitar) {
		// TODO Auto-generated method stub
		
	}
	}
