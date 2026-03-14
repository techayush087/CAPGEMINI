package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SBU {
	@Value("${sbuCode}")
      private String sbuId;
	@Value("${sbuHead}")
      private String sbuHead;
	@Value("${sbuName}")
      private String sbuName;
      
      
      public SBU() {
    	  
      }
	  public String getSbuId() {
		  return sbuId;
	  }
	  public void setSbuId(String sbuId) {
		  this.sbuId = sbuId;
	  }
	  public String getSbuName() {
		  return sbuName;
	  }
	  public void setSbuName(String sbuName) {
		  this.sbuName = sbuName;
	  }
	  public String getSbuHead() {
		  return sbuHead;
	  }
	  public void setSbuHead(String sbuHead) {
		  this.sbuHead = sbuHead;
	  }
      
	  public String toString() {
	        return "SBU Details [sbuId=" + sbuId + 
	               ", sbuName=" + sbuName + 
	               ", sbuHead=" + sbuHead + "]";
	    }
	 
      
     
}
