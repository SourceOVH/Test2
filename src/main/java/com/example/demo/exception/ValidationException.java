package com.example.demo.exception;

import com.example.demo.entity.BookEntity;
import com.example.demo.utils.UtilBook;

public class ValidationException extends  Exception {
    public static void Validate(BookEntity book) throws javax.validation.ValidationException {
        if (book.getTitle() == null || book.getTitle().isBlank() || book.getTitle().length() < 4 || book.getTitle().length() > 32) {
            throw new javax.validation.ValidationException("Название книги должно быть от 4 до 32");
        }
        if (book.getAuthor() == null || book.getAuthor().isBlank() || book.getAuthor().length() < 3 || book.getAuthor().length() > 18) {
            throw new javax.validation.ValidationException("Имя должно быть от 3 до 18");
        }
        if (book.getPublisher() == null || book.getPublisher().isBlank() || book.getPublisher().length() < 4 || book.getPublisher().length() > 32) {
            throw new javax.validation.ValidationException("Издательство должно быть от 4 до 32");
        }
        if (book.getYear() == 0 || book.getYear() < 0 || book.getYear() > 2024 || book.getYear() < 1654) {
            throw new javax.validation.ValidationException("Год публикации не может быть меньше 1654 года и больше 2024");
        }
        if (book.getKind() == null || book.getKind().isBlank() || book.getKind().length() < 1 || book.getKind().length() > 30) {
            throw new javax.validation.ValidationException("Тип книги должен содержать хотя бы один символ");
        }
    }
}