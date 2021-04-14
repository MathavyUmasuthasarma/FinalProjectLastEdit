package com.mehmetpekdemir.ecommerce.dto;

import javax.validation.constraints.NotNull;

import com.mehmetpekdemir.ecommerce.validator.UniqueName;

import lombok.Data;


@Data
public class CategoryUpdateDTO {

	@NotNull
	@UniqueName
	private String name;

}
