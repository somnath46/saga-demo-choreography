package com.tnt.saga.commons.event;

import java.time.Instant;
import java.util.UUID;

import com.tnt.saga.commons.dto.OrderRequestDto;
import com.tnt.saga.commons.dto.OrderStatus;
import lombok.Data;

@Data
public class OrderEvent implements Event {

	private OrderRequestDto orderRequestDto;
    private OrderStatus orderStatus;
    
    public OrderEvent(OrderRequestDto orderRequestDto, OrderStatus orderStatus) {
		this.orderRequestDto = orderRequestDto;
		this.orderStatus = orderStatus;
	}

	public UUID getEventId() {
		return UUID.randomUUID();
	}

	public Instant getDate() {
		return Instant.now();
	}
}
