package com.haas.nsk.andy;

public enum EventState {
    SUCCESS("Успешно", 1),
    IN_PROGRESS("В процессе", 0),
    ERROR("Ошибка", -1);

    private final String name;

    private final int code;

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    EventState(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
