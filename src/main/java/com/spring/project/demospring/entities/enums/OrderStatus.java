package com.spring.project.demospring.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private Integer value;

    OrderStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static OrderStatus valueOf(Integer code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getValue() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code.");
    }
}
