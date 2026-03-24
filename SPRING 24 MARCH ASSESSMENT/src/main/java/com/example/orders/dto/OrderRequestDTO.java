package com.example.orders.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class OrderRequestDTO {
	
	  
	 

	@NotBlank
    @Size(min = 3)
    private String custName;

    @NotBlank
    @Email
    private String custEmail;

    @NotBlank
    private String prodName;

    @NotNull
    @Min(1)
    private Integer qty;

    @NotNull
    @Min(1)
    private Double pricePerUnt;
    

	    public OrderRequestDTO() {
	    	
	    }
	    
	    
		public OrderRequestDTO(String custName, String custEmail, String prodName, Integer qty, Double pricePerUnt) {
			super();
			this.custName = custName;
			this.custEmail = custEmail;
			this.prodName = prodName;
			this.qty = qty;
			this.pricePerUnt = pricePerUnt;
		
		}
		
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustEmail() {
			return custEmail;
		}
		public void setCustEmail(String custEmail) {
			this.custEmail = custEmail;
		}
		public String getProdName() {
			return prodName;
		}
		public void setProdName(String prodName) {
			this.prodName = prodName;
		}
		public Integer getQty() {
			return qty;
		}
		public void setQty(Integer qty) {
			this.qty = qty;
		}
		public Double getPricePerUnt() {
			return pricePerUnt;
		}
		public void setPricePerUnt(Double pricePerUnt) {
			this.pricePerUnt = pricePerUnt;
		}
		
	    
	    

	    
}
