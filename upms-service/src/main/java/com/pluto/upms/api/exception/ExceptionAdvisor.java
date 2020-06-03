package com.pluto.upms.api.exception;

import com.pluto.upms.api.RestResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/**
 * 参数校验异常处理
 */
@Slf4j
@ControllerAdvice
public class ExceptionAdvisor {

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RestResult<?> validExceptionHandler(MethodArgumentNotValidException e) {
        log.error(e.getMessage(), e);
        return RestResult.failure(HttpStatus.BAD_REQUEST.value(), Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
    }

}
