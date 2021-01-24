package com.xworkz.city.dto;

import com.xworkz.city.ward.CityWard;
import com.xworkz.city.constant.WardName;

public class CityDTO {
	private int wardNumber;
    private WardName cityWard;
    private String corporatorName;
    private int population;
    private String area;
    
    /**
	 * 
	 */
	public CityDTO() {
		System.out.println("invoked cityward");
	}
	/**
	 * @param wardNumber
	 * @param WardName
	 * @param population
	 */
	public CityDTO(int wardNumber, WardName cityWard, int population,String area,String corporatorName) {
		this.wardNumber = wardNumber;
		this.cityWard= cityWard;
		this.population = population;
		this.area=area;
		this.corporatorName=corporatorName;
	}
	public int getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(short wardNumber) {
		this.wardNumber = wardNumber;
	}
	public WardName getWardName() {
		return cityWard;
	}
	public void setWardName(CityWard wardName) {
		this.cityWard = cityWard;
	}
	public String getCorporatorName() {
		return corporatorName;
	}
	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
