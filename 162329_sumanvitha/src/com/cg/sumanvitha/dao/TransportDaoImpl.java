package com.cg.sumanvitha.dao;

import java.util.Map;

import com.cg.sumanvitha.bean.TransportBean;
import com.cg.sumanvitha.util.DataBase;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean transportBean) {
		// TODO Auto-generated method stub
		DataBase.addTransport(transportBean);
		
	}

}
