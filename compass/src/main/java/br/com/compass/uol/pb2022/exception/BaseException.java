package br.com.compass.uol.pb2022.exception;

public class BaseException extends RuntimeException{

    public BaseException(String message){
        super(message);
    }

    public BaseException(String message, Throwable cause){
        super(message, cause);
    }
}
