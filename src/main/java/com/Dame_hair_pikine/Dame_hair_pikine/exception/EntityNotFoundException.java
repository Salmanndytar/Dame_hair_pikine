package com.Dame_hair_pikine.Dame_hair_pikine.exception;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException{
    @Getter
    private ErrorCodes errorCodes;

    public EntityNotFoundException(String message){
        super(message);
    }
    public EntityNotFoundException(String message, Throwable cause){
       super(message, cause);
    }
    public EntityNotFoundException(String message, Throwable cause, ErrorCodes errorCodes){
        super(message, cause);
        this.errorCodes=errorCodes;
    }

    public EntityNotFoundException(String message, ErrorCodes errorCodes){
        super(message);
        this.errorCodes=errorCodes;
    }

    }
