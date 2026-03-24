package com.example.orders.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class OrderResponseDTO {

	 
	    private Long orderId;

	    private String custName;
	    private String custEmail;
	    private String prodName;
	    private Integer qty;
	    private Double pricePerUnt;
	    private Double totalAmt;
	    
	    public OrderResponseDTO() {
	    	
	    }
	    
	    

		public OrderResponseDTO(Long orderId, String custName, String custEmail, String prodName, Integer qty,
				Double pricePerUnt, Double totalAmt) {
			super();
			this.orderId = orderId;
			this.custName = custName;
			this.custEmail = custEmail;
			this.prodName = prodName;
			this.qty = qty;
			this.pricePerUnt = pricePerUnt;
			this.totalAmt = totalAmt;
		}



		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
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

		public Double getTotalAmt() {
			return totalAmt;
		}

		public void setTotalAmt(Double totalAmt) {
			this.totalAmt = totalAmt;
		}
	    
	    
		
}
