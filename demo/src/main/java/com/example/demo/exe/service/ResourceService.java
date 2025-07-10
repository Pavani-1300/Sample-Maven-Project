//package com.example.demo.exe.service;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.exe.Resources;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import ch.qos.logback.core.Layout;
//
//import java.util.stream.Collectors;
//import java.util.Collections;
//
// 
//@Service
//public class ResourceService {
// 
//    private List<Resources> resourceItems = new ArrayList<>();
// 
//    public void loadResources() throws IOException {
//        // Load JSON file (adjust path as needed)
//    	ObjectMapper mapper = new ObjectMapper();
//        InputStream inputStream = new ClassPathResource("resource_Layout.json").getInputStream();
//        Layout layout = mapper.readValue(inputStream, Layout.class);
//
//        
//        
//        
////        for(Resources resource : layout) {
////            if (resource.getConveyorPLC() != null) {
////                resourceItems.addAll(resource.getConveyorPLC());
////            }
////            if (resource.getZeromAMR() != null) {
////                resourceItems.addAll(resource.getZeromAMR());
////            }
////            if (resource.getAndOrAMR() != null) {
////                resourceItems.addAll(resource.getAndOrAMR());
////            }
////        }
//    }
// 
//    // Get all resources
//    public List<Resources> getAllResources() {
//        return resourceItems;
//    }
// 
//    // Get resources by type
//    public List<Resources> getResourcesByType(int type) {
//        return resourceItems.stream()
//                .filter(resource -> resource.getType() == type)
//                .collect(Collectors.toList());
//    }
// 
//    // Get resource by handle
//    public Resources getResourceByHandle(int handle) {
//        return resourceItems.stream()
//                .filter(resource -> resource.getHandle() == handle)
//                .findFirst()
//                .orElse(null);
//    }
//}
//



//@Service
//public class ResourceService {
//    private List<Resource> resources;
// 
//    public void loadResources() {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//            InputStream inputStream = new ClassPathResource("Warehouse_Layout.json").getInputStream();
//            JsonNode root = mapper.readTree(inputStream);
//            JsonNode resourcesNode = root.get("resources");
//            if (resourcesNode == null || !resourcesNode.isArray()) {
//                throw new IllegalStateException("Resources array not found or invalid in JSON");
//            }
//            this.resources = mapper.convertValue(resourcesNode, new TypeReference<List<Resource>>() {});
//            if (this.resources == null) {
//                this.resources = Collections.emptyList();
//            }
//            System.out.println("Total resources loaded: " + resources.size());
//            for (Resource resource : resources) {
//                if (resource.getType() != null && resource.getType() == 0) {
//                    System.out.printf("%s (Type %d, Handle %d, AreaCode %s, InstIndex %s, PlcIndex %s, Links %s)%n",
//                            resource.getName(),resource.getType(), resource.getHandle(),
//                            resource.getAreaCode(), resource.getInstIndex(),
//                            resource.getPlcIndex(), resource.getLinks());
//                } else {
//                    System.out.printf("%s (Type %d, Handle %d, AreaCode %s, InstIndex %s)%n",
//                            resource.getName(), resource.getType(), resource.getHandle(),
//                            resource.getAreaCode(), resource.getInstIndex());
//                }
//            }
//        } catch (IOException e) {
//            System.err.println("Error loading resources: " + e.getMessage());
//            e.printStackTrace();
//            throw new RuntimeException("Failed to load Warehouse_Layout.json", e);
//        }
//    }
// 
//    public List<Resource> getResourcesByType(int type) {
//        return resources.stream()
//                .filter(resource -> resource.getType() != null && resource.getType() == type)
//                .collect(Collectors.toList());
//    }
//    
//    
// 
//    public Optional<Resource> getResourceByHandle(int handle) {
//        return resources.stream()
//                .filter(resource -> resource.getHandle() != null && resource.getHandle() == handle)
//                .findFirst();
//    }
// 
//    public Optional<Resource> getResourceByName(String name) {
//        return resources.stream()
//                .filter(resource -> resource.getName() != null && resource.getName().equals(name))
//                .findFirst();
//    }
//}
// 