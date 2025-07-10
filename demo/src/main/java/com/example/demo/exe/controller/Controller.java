package com.example.demo.exe.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.exe.service.ServiceResource;

@RestController
public class Controller {
	
	@Autowired
	private ServiceResource resourceService ;
	
	@GetMapping("get")
	public ResponseEntity<String> trigger() throws IOException{
		resourceService.loadResources();
		return ResponseEntity.ok("done");
	}

}
