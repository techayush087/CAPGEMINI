package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Car {
    @Value("${carname}")
    private String name;
    @Autowired
    @Qualifier("CNGEngine")
    private IEngine engine;
 
    @Autowired
    @Qualifier("JKTyre")
    private ITyre tyre;

    
    public Car() {
    	
    }
    
    
	public Car(IEngine engine,ITyre tyre) {
		super();
	
		this.engine = engine;
		this.tyre = tyre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IEngine getEngine() {
		return engine;
	}
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	public ITyre getTyre() {
		return tyre;
	}
	public void setTyre(ITyre tyre) { 
		this.tyre = tyre;
	}
    
	public void printCar() {
		System.out.println("Car Name :" + getName());
		System.out.println("Car Engine :" + engine.getBHP());
		System.out.println("Car Tyre :" + tyre.getTyreDetails());
		
	}
    
    
} 
