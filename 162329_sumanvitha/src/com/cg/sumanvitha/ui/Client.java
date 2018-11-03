package com.cg.sumanvitha.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.sumanvitha.bean.TransportBean;
import com.cg.sumanvitha.service.ITransportService;
import com.cg.sumanvitha.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) {
		TransportBean transportBean = new TransportBean();
		ITransportService service = new TransportServiceImpl();
		Map<String,String> transportDetails = service.getTransportDetails();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mode of transport");
		int count = 1;
		for (Map.Entry<String, String>   entrySet:transportDetails.entrySet()) {
			System.out.println(count+". "+entrySet.getValue());
			
			count++;
		}
		try{
		System.out.println("enter option");
	
		int choice = scanner.nextInt();
		int count1 = 1;
		for (Map.Entry<String, String>   entrySet:transportDetails.entrySet()) {
			if(choice == count1) {
				transportBean.setTransportCategoryId(entrySet.getValue());
	
			}
			count1++;
		}
		int id = (int) (Math.random()*10000);
		transportBean.setId(id);
		System.out.println("enter reason");
		scanner.nextLine();
		String reason = scanner.nextLine();
		transportBean.setReason(reason);
		System.out.println("when\n"+"1.this week\n+"+"2.next week\n"+"3.next month");
		
		}
		catch(Exception e) {
			System.err.println("invalid");
		}
		try{
		int whenchoice=scanner.nextInt();
		
		if(whenchoice == 1){
			transportBean.setWhen("this week");
		}
		if(whenchoice == 1){
			transportBean.setReason("next week");
		}
		if(whenchoice == 1){
			transportBean.setReason("next month");
		}
		service.addTransport(transportBean);
		LocalDateTime ldt =LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a");
		System.out.println("Booked with id "+transportBean.getId()+" on "+ldt.format(f));
		
		}
		catch(Exception e)
		{
			System.err.println("invalid");
		}
	
		
		
		
	}
}


