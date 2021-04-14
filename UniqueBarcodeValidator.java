package com.mehmetpekdemir.ecommerce.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.mehmetpekdemir.ecommerce.repository.ProductRepository;

public final class UniqueBarcodeValidator implements ConstraintValidator<UniqueBarcode, String> {

	private final ProductRepository productRepository;

	public UniqueBarcodeValidator(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public boolean isValid(String barcode, ConstraintValidatorContext context) {
		return !productRepository.existsByBarcode(barcode);
	}

}
