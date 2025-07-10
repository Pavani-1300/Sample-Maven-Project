package com.example.demo.exe.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.example.demo.exe.Resources;
import com.example.demo.exe.ZeromAMR;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.Layout;

@Service
public class ServiceResource {
	
	  private List<Resources> resourceItems = new ArrayList<>();
	  
	    public void loadResources() throws IOException {
	    	
	    	ObjectMapper mapper = new ObjectMapper();
	        InputStream inputStream = new ClassPathResource("resource_Layout.json").getInputStream();
	        JsonNode root = mapper.readTree(inputStream);
            JsonNode resourcesNode = root.get("resources");
	        
//	        System.out.println(resourcesNode);

	        Resources resourcesJsondata = mapper.convertValue(resourcesNode, Resources.class);
	        
	        resourcesJsondata.getAndOrAMR();
	        
	        //System.out.println(resourcesJsons.getConveyorPLC());
	        String input = "ConveyorPLC";
	        JsonNode inputNode = resourcesNode.get(input);
	        
	      
	        for(JsonNode element: inputNode) {
	        	System.out.println(element);
	        }
	        
	        
	        
	        
	    }

}
