package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
public class PetroEngine implements IEngine {
       
	 public String getBHP() {
    	 return "150 BHP";
     }
}
