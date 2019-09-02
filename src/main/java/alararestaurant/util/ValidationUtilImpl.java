package alararestaurant.util;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

public class ValidationUtilImpl implements ValidationUtil {

    private Validator validator;

    @Autowired
    public ValidationUtilImpl(Validator validator) {
        this.validator = validator;
    }

    @Override
    public <O> Boolean isValid(O object) {
        return this.validator.validate(object).size() == 0;
    }

    @Override
    public <O> Set<ConstraintViolation<O>> violations(O object) {
        return this.validator.validate(object);
    }
}
