package com.tnt.saga.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnt.saga.payment.entity.UserTransaction;

public interface UserTransactionRepository extends JpaRepository<UserTransaction, Integer> {

}
