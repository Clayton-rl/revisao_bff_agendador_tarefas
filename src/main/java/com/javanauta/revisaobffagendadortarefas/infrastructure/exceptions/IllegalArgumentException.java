package com.javanauta.revisaobffagendadortarefas.infrastructure.exceptions;

public class IllegalArgumentException extends RuntimeException{

    public IllegalArgumentException(String mensagem) {
        super(mensagem);
    }

    public IllegalArgumentException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }
}
