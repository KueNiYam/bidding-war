package com.example.biddingwar

import org.springframework.data.repository.CrudRepository

// <Entity, PK 타입>
interface BiddingWarRepository: CrudRepository<Product, Long>