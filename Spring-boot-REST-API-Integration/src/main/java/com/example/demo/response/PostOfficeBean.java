/**
 * 
 */
package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author HP
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostOfficeBean {
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Description")
	private String desc;
	
	@JsonProperty("BranchType")
	private String branchType;
	
	@JsonProperty("DeliveryStatus")
	private String deliveryStatus;
	
	@JsonProperty("Circle")
	private String circle;
	
	@JsonProperty("District")
	private String district;
	
	@JsonProperty("Division")
	private String division;
	
	@JsonProperty("Region")
	private String region;
	
	@JsonProperty("State")
	private String state;
	
	@JsonProperty("Country")
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "PostOfficeBean [name=" + name + ", desc=" + desc + ", branchType=" + branchType + ", deliveryStatus="
				+ deliveryStatus + ", circle=" + circle + ", district=" + district + ", division=" + division
				+ ", region=" + region + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
