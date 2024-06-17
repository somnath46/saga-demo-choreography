package com.tnt.saga.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnt.saga.commons.dto.OrderRequestDto;
import com.tnt.saga.commons.dto.OrderStatus;
import com.tnt.saga.order.entity.PurchaseOrder;
import com.tnt.saga.order.repository.OrderRepository;

@Service
public class  OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public PurchaseOrder create(OrderRequestDto requestDto) {
		final var savedOrder = orderRepository.save(convertDtoToEntity(requestDto));
		// TODO: produce kafka event regarding order
		requestDto.setOrderId(savedOrder.getId());

		return savedOrder;
	}

	public List<PurchaseOrder> getAll() {
		return orderRepository.findAll();
	}

	private PurchaseOrder convertDtoToEntity(OrderRequestDto dto) {
		PurchaseOrder purchaseOrder = new PurchaseOrder();
		purchaseOrder.setProductId(dto.getProductId());
		purchaseOrder.setUserId(dto.getUserId());
		purchaseOrder.setOrderStatus(OrderStatus.ORDER_CREATED);
		purchaseOrder.setPrice(dto.getAmount());
		return purchaseOrder;
	}
}
