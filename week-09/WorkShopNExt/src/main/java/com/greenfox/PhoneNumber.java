package com.greenfox;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Rita on 2016.12.22..
 */


@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "phone_numbers")
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String value;

    @ManyToMany(mappedBy = "phoneNumbers")
    private Set<Customer> customers;

}
