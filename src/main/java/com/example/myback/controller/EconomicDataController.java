package com.example.myback.controller;

import com.example.myback.model.EconomicData;
import com.example.myback.service.EconomicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/economic-data")
public class EconomicDataController {

    @Autowired
    private EconomicDataService service;

    @GetMapping
    public List<EconomicData> getAllEconomicData() {
        return service.getAllEconomicData();
    }

    // 추가적인 엔드포인트 구현 (예: 특정 연도의 데이터 가져오기, 데이터 추가 등)
}