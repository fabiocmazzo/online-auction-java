package com.example.auction.item.api;

import lombok.Value;
import java.util.Optional;
import java.util.UUID;

public abstract class DeliveryOption {

    public final class PickUp extends DeliveryOption {
    }
    
    @Value
    public final class Deliver extends DeliveryOption {
        private final String name;
        private final int price;
        private final Location location;

        public Deliver(String name, int price, Location location) {
            this.name = name;
            this.price = price;
            this.location = location;
        }
    }
    
    @Value
    public final class ByNegotiation extends DeliveryOption {
        private final Location location;

        public ByNegotiation(Location location) {
            this.location = location;
        }
    }

}
