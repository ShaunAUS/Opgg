package com.example.opggProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class AverageRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    private Long winCnt;
    private Long loseCnt;
    private Long averagePoint;

    private Enum soloLank;

    private Enum freeLank;
}
