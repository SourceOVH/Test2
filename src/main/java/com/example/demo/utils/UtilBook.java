package com.example.demo.utils;

import com.example.demo.entity.BookEntity;

import javax.validation.ValidationException;

public class UtilBook extends  Exception {
    public static void Validate(BookEntity book) throws ValidationException {
        if (book.getTitle() == null || book.getTitle().isBlank() || book.getTitle().length() < 4 || book.getTitle().length() > 32) {
            throw new ValidationException("Название книги должно быть от 4 до 32");
        }
        if (book.getAuthor() == null || book.getAuthor().isBlank() || book.getAuthor().length() < 3 || book.getAuthor().length() > 18) {
            throw new ValidationException("Имя должно быть от 3 до 18");
        }
        if (book.getPublisher() == null || book.getPublisher().isBlank() || book.getPublisher().length() < 4 || book.getPublisher().length() > 32) {
            throw new ValidationException("Издательство должно быть от 4 до 32");
        }
        if (book.getYear() == 0 || book.getYear() < 0 || book.getYear() > 2024 || book.getYear() < 1654) {
            throw new ValidationException("Год публикации не может быть меньше 1654 года и больше 2024");
        }
        if (book.getKind() == null || book.getKind().isBlank() || book.getKind().length() < 1 || book.getKind().length() > 30) {
            throw new ValidationException("Тип книги должен содержать хотя бы один символ");
        }
    }
}
