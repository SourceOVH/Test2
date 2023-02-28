package com.example.demo.response;

import com.example.demo.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class BaseResponse {
    protected boolean success;
    protected String message;
}
