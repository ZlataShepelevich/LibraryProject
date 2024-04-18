package org.libraryproject.dao;

import org.libraryproject.models.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();

        book.setBook_id(rs.getInt("book_id"));
        book.setPerson_id(rs.getObject("person_id")==null ? 0 : rs.getInt("person_id"));
        book.setTitle(rs.getString("title"));
        book.setAuthor(rs.getString("author"));
        book.setYear(rs.getInt("year"));

        return book;
    }
}
