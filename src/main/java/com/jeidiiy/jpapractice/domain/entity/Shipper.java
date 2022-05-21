package com.jeidiiy.jpapractice.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Shippers")
@Entity
public class Shipper {
    @Id
    @GeneratedValue
    private Long id;

    private String shipperName;

    private String phone;
}
