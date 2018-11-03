package com.cg.sumanvitha.service;

import java.util.Map;

import com.cg.sumanvitha.bean.TransportBean;

public interface ITransportService {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean transportBean);

}
