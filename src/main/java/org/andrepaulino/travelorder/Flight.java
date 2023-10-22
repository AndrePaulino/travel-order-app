package org.andrepaulino.travelorder;

import lombok.Data;

@Data
public class Flight {
    public Flight() {
    }

    private Long id;
    private Long travelOrderId;
    private String fromAirport;
    private String toAirport;
}
