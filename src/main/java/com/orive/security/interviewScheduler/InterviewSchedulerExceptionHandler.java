package com.orive.security.interviewScheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class InterviewSchedulerExceptionHandler {

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ResponseDto> notFoundException(ResourceNotFoundException notFoundException) {
        log.info( "No resource found");
        return new ResponseEntity<>( ResponseUtil.getFailureResponse( notFoundException.getMessage() ), notFoundException.getCode() );
    }


}
