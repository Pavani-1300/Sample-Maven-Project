package com.example.demo.exe;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZeromAMR{
	
	 private String version;
	    private String name;
	    private int type;
	    private int protocol;
	    private int handle;
	    private String access;
	    private List<Integer> functions;
	    @JsonProperty("area-code")
	    private int areaCode;
	    @JsonProperty("inst-index")
	    private int instIndex;
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public int getProtocol() {
			return protocol;
		}
		public void setProtocol(int protocol) {
			this.protocol = protocol;
		}
		public int getHandle() {
			return handle;
		}
		public void setHandle(int handle) {
			this.handle = handle;
		}
		public String getAccess() {
			return access;
		}
		public void setAccess(String access) {
			this.access = access;
		}
		public List<Integer> getFunctions() {
			return functions;
		}
		public void setFunctions(List<Integer> functions) {
			this.functions = functions;
		}
		public int getAreaCode() {
			return areaCode;
		}
		public void setAreaCode(int areaCode) {
			this.areaCode = areaCode;
		}
		public int getInstIndex() {
			return instIndex;
		}
		public void setInstIndex(int instIndex) {
			this.instIndex = instIndex;
		}
	    
	    
	    
}
