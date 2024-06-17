package com.tnt.saga.order.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.saga.commons.dto.OrderRequestDto;
import com.tnt.saga.order.entity.PurchaseOrder;
import com.tnt.saga.order.service.OrderService;

@RestController
@RequestMapping("/v1/api/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping
	public ResponseEntity<PurchaseOrder> create(@RequestBody OrderRequestDto dto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(orderService.create(dto));
	}

	public ResponseEntity<List<PurchaseOrder>> getAll() {
		return ResponseEntity.ok(orderService.getAll());
	}
}
