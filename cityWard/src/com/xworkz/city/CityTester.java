package com.xworkz.city;

import com.xworkz.city.dto.CityDTO;
import com.xworkz.city.ward.CityWard;
import com.xworkz.city.constant.WardName;

public class CityTester {
	

		public static void main(String[] args) {
			CityWard ward=new CityWard(50);
			
			 CityDTO dto=new CityDTO(3, WardName.KRPURAM, 50000,"Keshavapur","Vishalakshi");
			 ward.addWardInfo(dto);
			 ward.display();
			 
			 CityDTO dto2=new CityDTO(3, WardName.KRPURAM, 50000,"KRMarket","Aishwarya");
			 ward.addWardInfo(dto2);
			 ward.display();
			 
			 
			 
			 ward.displayByNameOrNumber(WardName.KRPURAM, 3);

		}


}
