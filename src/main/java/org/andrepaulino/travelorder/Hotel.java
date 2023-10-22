package org.andrepaulino.travelorder;

import lombok.Data;

@Data
public class Hotel {
    public Hotel() {
    }

    private Long id;
    private Long travelOrderId;
    private Integer nights;
}