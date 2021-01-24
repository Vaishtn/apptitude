package com.xworkz.city.ward;

import com.xworkz.city.dto.CityDTO;
import com.xworkz.city.constant.WardName;
public class CityWard {
	private CityDTO[] dtos;
	int currentIndex = 0;

	/**
	* 
	*/
	public CityWard(int size) {
		this.dtos = new CityDTO[size];
	}

	public void addWardInfo(CityDTO dto) {
		if(dto!=null && this.currentIndex<3) {
			/*
			 * WardName name=dto.getWardName(); int number=dto.getWardNumber(); String
			 * corName=dto.getCorporatorName(); int population=dto.getPopulation(); String
			 * area=dto.getArea();
			 */
			if(dto.getWardName()!=null && dto.getWardNumber()>0 && dto.getPopulation()>5000 && dto.getArea()!=null && dto.getClass()!=null) {
				System.out.println("we can add ward info");
				System.out.println("current index is "+this.currentIndex);
				dtos[this.currentIndex]=dto;
				this.currentIndex++;
			}else {
				System.out.println("population is less or values can not be null");
			}
		}
    	   
       }

	public void displayByNameOrNumber(WardName ward, int wardNumber) {
		if (ward != null || wardNumber > 0) {
			boolean start = false;
			for (int i = 0; i < this.dtos.length; i++) {
				if (this.dtos[i] != null) {
					CityDTO ref = this.dtos[i];
					WardName localstart = ref.getWardName();
					int localnumber = ref.getWardNumber();
					if (ward.equals(localstart) || wardNumber == localnumber) {
						start = true;
						System.out.println("ward name is  " + ref.getWardName());
						System.out.println(ref.getWardNumber());
						System.out.println(ref.getArea());
						System.out.println(ref.getCorporatorName());
						System.out.println(ref.getPopulation());
						//break;
					}
				}
			}
			if (start == false) {
				System.out.println("starting point not found");

			}
		}
	}

	public void display() {
		for (int i = 0; i < dtos.length; i++) {
			CityDTO dto = this.dtos[i];
			if (this.dtos[i] != null) {
				System.out.println(dto.getArea());
				System.out.println(dto.getCorporatorName());
				System.out.println(dto.getPopulation());
				System.out.println(dto.getWardName());
				System.out.println(dto.getWardNumber());
				System.out.println("***********************************************");
			}
		}
	}

}
