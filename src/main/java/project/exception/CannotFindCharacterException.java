package project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CannotFindCharacterException extends RuntimeException {

    public CannotFindCharacterException(){
        super("Cannot find Character for provided parameter");
    }
}
