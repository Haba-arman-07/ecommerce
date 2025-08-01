package com.ecom.CommonEntity.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseModel {
    private int code;
    private String status;
    private Object data;
    private String message;

    public ResponseModel(HttpStatus status, Object data, String message){
        this.code = status.value();
        this.status = status.getReasonPhrase();
        this.data = data;
        this.message = message;
    }

}
