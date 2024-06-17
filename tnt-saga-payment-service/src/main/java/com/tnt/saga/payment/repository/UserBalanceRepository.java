package com.tnt.saga.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnt.saga.payment.entity.UserBalance;

public interface UserBalanceRepository extends JpaRepository<UserBalance, Integer> {

}
