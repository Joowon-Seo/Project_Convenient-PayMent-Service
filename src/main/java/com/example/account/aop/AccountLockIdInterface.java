package com.example.account.aop;

public interface AccountLockIdInterface {
    // LockAopAspect에서 args로 request를 가져오려고하는데
    // useBalance, cancelBalance 타입이 다른 문제가 발생하여
    // Interface를 활용

    String getAccountNumber();
}
