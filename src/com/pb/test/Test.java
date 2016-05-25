package com.pb.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pb.dao.Dao;
import com.pb.dao.db.DBAccess;
import com.pb.dao.impl.GuitarDaoImpl;
import com.pb.pojo.Guitar;
import com.pb.pojo.GuitarSpec;
import com.pb.util.Wood;

public class Test {
	public static void main(String[] args) {
		Guitar guitar=new Guitar("sdf",11.3,"dfd","dfd","dfd","dfd","dfd");
		
		Dao.addGuitar(guitar);
}
}