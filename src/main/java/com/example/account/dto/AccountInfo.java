package com.example.account.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
// 기존 AccountDto는 controller 와 service 간의 데이터를 주고 받는 것에
// 최적화 된 Dto라면

// AccountInfoDto에서 필요로 하는 것은 Account의 특정 정보들을
// 따로 뽑아서 사용자에게 응답을 주는
// controller 와 client 간 주고 받는 응답이기 때문

// 전용 Dto를 만들지 않으면 복잡한 상황이 생기고
// 의도지 않은 장애가 발생할 수 있기 때문
public class AccountInfo {
    private String accountNumber;
    private Long balance;
}
