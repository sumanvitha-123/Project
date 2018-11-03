package com.cg.sumanvitha.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.sumanvitha.bean.TransportBean;

public class DataBase {

	private static Map<String, String> transportDetails = new HashMap();
	
	private static Map<Integer, TransportBean> bookTransport  = new HashMap();
	
	public static Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		
		transportDetails.put("f-1", "flight");
		transportDetails.put("t-2", "train");
		transportDetails.put("ta-1", "taxi");
		return transportDetails;
	}


	public static void addTransport(TransportBean transportBean) {
		// TODO Auto-generated method stub
		
		bookTransport.put(transportBean.getId(), transportBean);
	}

}
