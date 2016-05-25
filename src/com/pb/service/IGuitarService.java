package com.pb.service;

import java.util.List;


import com.pb.pojo.Guitar;

public interface IGuitarService {
	//ÒµÎñ²ã
	public void addGuitar(Guitar guitar) throws Exception;
	public Guitar getGuitarByNum(Guitar guitar);
	public List<Guitar> search();
	public void delete(Guitar guitar);
	public void update(Guitar guitar);
}
