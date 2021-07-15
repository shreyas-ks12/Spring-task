package com.fis.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DeviceType {

	@Value("${devicetype.type}")
	String DeviceType;

	public DeviceType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeviceType(String DeviceType) {
		super();
		this.DeviceType = DeviceType;
	}
	

	public String getDeviceType() {
		return DeviceType;
	}

	public void setDeviceType(String DeviceType) {
		this.DeviceType = DeviceType;
	}

	@Override
	public String toString() {
		return "DeviceType " + DeviceType + "]";
	}
	
	
	
}
