package com.example.demo.exe;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resources{
	
	@JsonProperty("ConveyorPLC")
	private List<ConveyorPLC> conveyorPLC;
	@JsonProperty("ZeromAMR")
	private List<ZeromAMR> zeromAMR;
	@JsonProperty("AndOrAMR")
	private List<AndOrAMR> andOrAMR;
	
	
	public List<ConveyorPLC> getConveyorPLC() {
		return conveyorPLC;
	}
	public void setConveyorPLC(List<ConveyorPLC> conveyorPLC) {
		this.conveyorPLC = conveyorPLC;
	}
	public List<ZeromAMR> getZeromAMR() {
		return zeromAMR;
	}
	public void setZeromAMR(List<ZeromAMR> zeromAMR) {
		this.zeromAMR = zeromAMR;
	}
	public List<AndOrAMR> getAndOrAMR() {
		return andOrAMR;
	}
	public void setAndOrAMR(List<AndOrAMR> andOrAMR) {
		this.andOrAMR = andOrAMR;
	}
	

	
	
}
