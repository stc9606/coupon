package com.example.couponapi;

import com.example.couponapi.controller.dto.CouponIssueResponseDto;
import com.example.couponcore.exception.CouponIssueException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CouponControllerAdvice {

    @ExceptionHandler(CouponIssueException.class)
    public CouponIssueResponseDto handleCouponIssueException(CouponIssueException e) {
        return new CouponIssueResponseDto(false, e.getErrorCode().message);
    }

}
