package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing //클래스 자체가 어플리케이션이 뜰 때 오토 스캔이 되는 타입이 된다.
//DB에 데이터를 수정 등을 할 때 annotation이 붙은 위치에 저장하게 해줌
public class JpaAuditingConfiguration {
}
