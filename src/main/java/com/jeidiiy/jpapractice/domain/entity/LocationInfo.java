package com.jeidiiy.jpapractice.domain.entity;

import lombok.*;

import javax.persistence.Embeddable;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode
@Getter
@Embeddable
public class LocationInfo {
    private String address;
    private String city;
    private String postalCode;
    private String country;
}
