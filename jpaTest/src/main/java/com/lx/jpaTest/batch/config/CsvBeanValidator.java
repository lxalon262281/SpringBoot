package com.lx.jpaTest.batch.config;

import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.beans.factory.InitializingBean;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * 自定义检验器
 * @param <T>
 */
public class CsvBeanValidator<T> implements Validator<T>,InitializingBean {

    private javax.validation.Validator validator;

    @Override
    public void validate(T t) throws ValidationException {
        Set<ConstraintViolation<T>> constraintViolations =
                validator.validate(t);
        if (constraintViolations.size() > 0) {

            StringBuilder  message = new StringBuilder();
            for (ConstraintViolation<T> violation : constraintViolations) {
                message.append(violation.getMessage() + "\n");
            }
            System.out.println();
            throw new ValidationException(message.toString());
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ValidatorFactory factory =  Validation.buildDefaultValidatorFactory();
        validator = factory.usingContext().getValidator();
    }


}
