package com.example.myback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EconomicData {

    @Id
    private String id;
    private int year;
    private double gdp;
    private double inflationRate;
    private double unemploymentRate;
    //환율이나 주식 시장 지수 같은  필드를 나중에 추가 할 수도 ?/??????
    // 생성자, 게터 및 세터 생략

}