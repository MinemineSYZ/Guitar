package com.pb.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBAccess {
	// ������̬ȫ�ֱ���
    static Connection conn;

    /* ��ȡ���ݿ����ӵĺ���*/
    public static Connection getConnection() {
        Connection con = null;  //���������������ݿ��Connection����
        try {
            Class.forName("com.mysql.jdbc.Driver");// ����Mysql��������
             
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/guitar", "root", "123456");// ������������
             
        } catch (Exception e) {
            System.out.println("���ݿ�����ʧ��" + e.getMessage());
        }
        return con; //���������������ݿ�����
    }

}
