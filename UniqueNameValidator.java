package com.mehmetpekdemir.ecommerce.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.mehmetpekdemir.ecommerce.repository.CategoryRepository;

public final class UniqueNameValidator implements ConstraintValidator<UniqueName, String> {

	private final CategoryRepository categoryRepository;

	public UniqueNameValidator(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext context) {
		return !categoryRepository.existsByName(name);
	}

}
