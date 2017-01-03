package com.greenfox;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Rita on 2016.12.22..
 */

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "order")
    private List<Item> items;

}
