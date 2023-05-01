package com.rajeshkawali.exception;

//package com.backbase.dbs.payment.extension;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class NeedStepUpExceptionHandler {

    @ExceptionHandler(NeedStepUpException.class)
    @ResponseBody
    public ResponseEntity<Void> handleMyException(NeedStepUpException e) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("WWW-Authenticate", "mock challenge=\"" + e.getChallenge() + "\"");
        return new ResponseEntity(null, headers, HttpStatus.UNAUTHORIZED);
    }
}