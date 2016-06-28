package com.github.freefly.angularboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by FreeFly on 29.06.2016.
 */
@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public @ResponseBody String allExceptions(Exception e) {
        e.printStackTrace();

        return "{\"message\": \"Some error\"}"; // TODO: fix content-type to application/json
    }
}
