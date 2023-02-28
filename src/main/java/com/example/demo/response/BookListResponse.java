package com.example.demo.response;

import com.example.demo.entity.BookEntity;
import com.example.demo.response.BaseResponse;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BookListResponse extends BaseResponse {

    public BookListResponse(Iterable<BookEntity> data) {
        super(true, "Список книг");
        this.data = data;
    }

    private Iterable<BookEntity> data;
}