package com.pb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pb.dao.db.DBAccess;
import com.pb.pojo.Guitar;



public class Dao {
	public static void addGuitar(Guitar guitar){
		
		//连接数据库
		Connection conn=DBAccess.getConnection();
		
		String str="insert into guitar(serialNumber, price, builder,model, type, backWood, topWood) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(str);
			ps.setString(1,guitar.getSerialNumber());
			ps.setDouble(2,guitar.getPrice());
			ps.setString(3,guitar.getBuilder());
			ps.setString(4,guitar.getModel());
			ps.setString(5,guitar.getType());
			ps.setString(6,guitar.getBackWood());
			ps.setString(7,guitar.getTopWood());
			int flag=ps.executeUpdate();
			if(flag>0){
				System.out.println("fffffff");
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
