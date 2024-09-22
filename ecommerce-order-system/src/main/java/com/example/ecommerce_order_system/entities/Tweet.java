package com.example.ecommerce_order_system.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private long tweetId;

    private User user;

    private String content;

    @CreationTimestamp
    private Instant creationTimestamp;

}
