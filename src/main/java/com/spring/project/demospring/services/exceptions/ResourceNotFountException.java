package com.spring.project.demospring.services.exceptions;

public class ResourceNotFountException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFountException(Object id) {
        super("Resource not found. id: " + id);
    }
}
