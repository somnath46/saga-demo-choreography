package com.tnt.saga.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnt.saga.order.entity.PurchaseOrder;

public interface OrderRepository extends JpaRepository<PurchaseOrder, Integer> {

}
