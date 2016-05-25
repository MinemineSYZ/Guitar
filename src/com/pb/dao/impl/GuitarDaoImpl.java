
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
		
		//�������ݿ�
		Connection conn=DBAccess.getConnection();
		 Statement st=conn.createStatement();
		 //SQL
		  try {
			  try {
		            String sql = "INSERT INTO guitar(serialNumber, price, builder,model, type, backWood, topWood)"
		                    + " VALUES ('55514', 3000, 'Ted', 'HH', 'electric', 'Alex', 'Wood')";  // �������ݵ�sql���
		             
		            st = (Statement) conn.createStatement();    // ��������ִ�о�̬sql����Statement����
		             
		            int count = st.executeUpdate(sql);  // ִ�в��������sql��䣬�����ز������ݵĸ���
		             
		            System.out.println("��guitar���в��� " + count + " ������"); //�����������Ĵ�����
		             
		            conn.close();   //�ر����ݿ�����
	             
	        } catch (SQLException e) {
	            System.out.println("��������ʧ��" + e.getMessage());
	        }
		 
		  }	
	

	@Override
	public Guitar getGuitarByNum(Guitar guitar) {
		// TODO Auto-generated method stub
		//�������ݿ�
		Connection conn=DBAccess.getConnection();
		 Statement st=conn.createStatement();
		 Guitar guit;
		 try {
	            String sql = "select * from staff where serialNumber like %"+guitar.getSerialNumber()+"%";     // ��ѯ���ݵ�sql���
	            st = (Statement) conn.createStatement();    //��������ִ�о�̬sql����Statement����st���ֲ�����
	             
	            ResultSet rs = st.executeQuery(sql);    //ִ��sql��ѯ��䣬���ز�ѯ���ݵĽ����
	            System.out.println("���Ĳ�ѯ���Ϊ��");
	            while (rs.next()) { // �ж��Ƿ�����һ������
	                 
	                // �����ֶ�����ȡ��Ӧ��ֵ
	                String name = rs.getString("nameyj");
	                int age = rs.getInt("age");
	                String sex = rs.getString("sex");
	                String address = rs.getString("address");
	                String depart = rs.getString("depart");
	                String worklen = rs.getString("worklen");
	                String wage = rs.getString("wage");
	                 
	               //��װ�����ֶ�
	                
	                
	                guit=new Guitar();
	             
	              
	             
	            }
	            conn.close();   //�ر����ݿ�����
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
