package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
public class CNGEngine implements IEngine {
     public String getBHP() {
    	 return "130 BHP";
     }
}
