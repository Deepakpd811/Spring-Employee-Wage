package com.bridgelab.employeeWage.exception;

import com.bridgelab.employeeWage.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class EmployeePayrollExceptionalHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){

        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();

        List<String> errMsg = errorList.stream()
                                .map((objErr) -> objErr.getDefaultMessage() )
                                .toList();

        ResponseDTO responseDTO = new ResponseDTO("Exception while processing Rest Request", errMsg);
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }

}
