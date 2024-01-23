package com.example.myback.service;



import com.example.myback.model.EconomicData;
import com.example.myback.repository.EconomicDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EconomicDataService {

    @Autowired
    private EconomicDataRepository repository;

    public List<EconomicData> getAllEconomicData() {
        return repository.findAll();
    }

    // 다른 필요한 메서드 추가 (예: 데이터 추가, 업데이트, 삭제 등)
}

