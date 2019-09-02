package alararestaurant.util;

import javax.validation.ConstraintViolation;
import java.util.Set;

public interface ValidationUtil {

    <E> Boolean isValid(E entity);

    <O> Set<ConstraintViolation<O>> violations(O object);
}
