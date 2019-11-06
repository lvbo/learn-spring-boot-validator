package io.github.lvbo.lsb.validator.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author lvbo
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext context) {
        if (phoneField == null) {
            return true;
        } else {
            return phoneField.matches("[0-9]+")
                    && (phoneField.length() > 8) && (phoneField.length() < 14);
        }
    }
}
