package com.bridgelab.employeeWage.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseDTO {

    private String message;
    private Object data;

    public ResponseDTO(String message, Object data){
        this.message = message;
        this.data = data;
    }


}
