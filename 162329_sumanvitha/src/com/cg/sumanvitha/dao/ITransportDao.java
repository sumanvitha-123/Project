package com.cg.sumanvitha.dao;

import java.util.Map;

import com.cg.sumanvitha.bean.TransportBean;

public interface ITransportDao {

	

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean transportBean);

}
