package com.cg.entity;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name="Product_table")
@Data
public class Product {
  
	@Id
	private int pid;
	private String name;
	private int Qty;
	private int price;
	private LocalDate mfd;
}
