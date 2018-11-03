package com.cg.sumanvitha.service;

import java.util.Map;

import com.cg.sumanvitha.bean.TransportBean;
import com.cg.sumanvitha.dao.ITransportDao;
import com.cg.sumanvitha.dao.TransportDaoImpl;

public class TransportServiceImpl implements ITransportService {

	ITransportDao dao = new TransportDaoImpl();
	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean transportBean) {
		// TODO Auto-generated method stub
		dao.addTransport(transportBean);
		
	}

}
