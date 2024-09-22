package com.example.ecommerce_order_system.repositories;

import com.example.ecommerce_order_system.entities.Tweet;
import org.springframework.data.repository.CrudRepository;

public interface TweetRepository extends CrudRepository<Tweet, Long> {
}
