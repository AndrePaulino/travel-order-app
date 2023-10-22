package org.andrepaulino.travelorder;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class TravelOrder extends PanacheEntity {

    public Long getId() {
        return this.id;
    }

    public void setIdToNull() {
        this.id = null;
    }
}
