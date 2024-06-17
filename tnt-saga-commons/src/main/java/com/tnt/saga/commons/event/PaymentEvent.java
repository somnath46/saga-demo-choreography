package com.tnt.saga.commons.event;

import java.time.Instant;
import java.util.UUID;

import com.tnt.saga.commons.dto.PaymentRequestDto;
import com.tnt.saga.commons.dto.PaymentStatus;

public class PaymentEvent implements Event {

	private PaymentRequestDto paymentRequestDto;
	private PaymentStatus paymentStatus;

	public PaymentEvent(PaymentRequestDto paymentRequestDto, PaymentStatus paymentStatus) {
		this.paymentRequestDto = paymentRequestDto;
		this.paymentStatus = paymentStatus;
	}

	public UUID getEventId() {
		return UUID.randomUUID();
	}

	public Instant getDate() {
		return Instant.now();
	}
}
