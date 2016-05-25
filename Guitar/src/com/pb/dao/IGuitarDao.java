package com.pb.dao;

import java.util.List;

import com.pb.pojo.Guitar;
import com.pb.pojo.GuitarSpec;

public interface IGuitarDao {
    //Êı¾İ·ÃÎÊ²ã
	public void addGuitar(Guitar guitar) throws Exception;
	public Guitar getGuitarByNum(Guitar guitar);
	public List<Guitar> search();
	public void delete(Guitar guitar);
	public void update(Guitar guitar);
	


}
