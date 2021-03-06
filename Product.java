package com.mehmetpekdemir.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "barcode", nullable = false, unique = true, length = 6)
	private String barcode;

	@Column(name = "price", nullable = false)
	private Double price;

	@Column(name = "description", nullable = false, length = 250)
	private String description;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	public Product(String name, String barcode, Double price, String description, Category category) {
		this.name = name;
		this.barcode = barcode;
		this.price = price;
		this.description = description;
		this.category = category;
	}

}
