package com.pb.service.impl;

import java.util.List;

import com.pb.dao.IGuitarDao;
import com.pb.dao.impl.GuitarDaoImpl;
import com.pb.pojo.Guitar;
import com.pb.service.IGuitarService;

public class GuitarServiceImpl implements IGuitarService {
	//dao ²ã
	private IGuitarDao guitar=new GuitarDaoImpl();
	
	@Override
	public void addGuitar(Guitar guitar) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Guitar getGuitarByNum(Guitar guitar) {
		// TODO Auto-generated method stub
		return ;
	}

	@Override
	public List<Guitar> search() {
		// TODO Auto-generated method stub
		return ;
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
