package com.todolist.todolist.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Priority {
    HIGH,
    MEDIUM,
    LOW;

    @JsonCreator
    public static Priority from(String value){
        return Priority.valueOf(value.toUpperCase());
    }
}
