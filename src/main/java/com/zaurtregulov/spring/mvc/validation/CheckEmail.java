package com.zaurtregulov.spring.mvc.validation;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    String value() default "@gmail.com";

    String message() default "email must end @gmail.com";

    Class<?>[] groups() default {};

    Class<?>[] payload() default {};
}
