package com.example.myback.repository;



import com.example.myback.model.EconomicData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EconomicDataRepository extends MongoRepository<EconomicData, String> {
    // 여기에 필요한 쿼리 메서드를 추가할 수 있습니다.
    // 예: 연도별 데이터 찾기, GDP가 특정 값 이상인 데이터 찾기 등
}
