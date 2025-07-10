package com.example.demo.exe;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Layout {

    private String application;
    private String fileVersion;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("configuration-version")
    private int configurationVersion;
    @JsonProperty("layout-sections")
    private List<LayoutSection> layoutSections;
    
    private Resources resources;

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getFileVersion() {
		return fileVersion;
	}

	public void setFileVersion(String fileVersion) {
		this.fileVersion = fileVersion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getConfigurationVersion() {
		return configurationVersion;
	}

	public void setConfigurationVersion(int configurationVersion) {
		this.configurationVersion = configurationVersion;
	}

	public List<LayoutSection> getLayoutSections() {
		return layoutSections;
	}

	public void setLayoutSections(List<LayoutSection> layoutSections) {
		this.layoutSections = layoutSections;
	}

	public Resources getResources() {
		return resources;
	}

	public void setResources(Resources resources) {
		this.resources = resources;
	}
    
}
