package CSFre.CSFre.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import CSFre.CSFre.model.Book;

@Repository
public class BookRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    // Write my SQL query statements here

    // select * from book2018 where title like "t%"
    private final String SQL_FIND_BOOK_BY_T = """
        select * from book2018 where title like "t%"
        order by title
        limit 10
        """;
    

        private final String SQL_FIND_BOOK_BY_LETTER = """
        select * from book2018 where title like "?%"
        order by title
        """;
    


    // public List<Book> findBookByT() {
    //     List<Book> list = jdbcTemplate.query(SQL_FIND_BOOK_BY_T, BeanPropertyRowMapper.newInstance(Book.class))
    //     return list;
    // }


    public List<Book> findBookByT() {
        Pageable pageable = PageRequest.of(0, 10);
        return jdbcTemplate.query(SQL_FIND_BOOK_BY_T, BeanPropertyRowMapper.newInstance(Book.class));
    }

        public List<Book> findBookByLetter(String letter) {
        return jdbcTemplate.query(SQL_FIND_BOOK_BY_LETTER, BeanPropertyRowMapper.newInstance(Book.class), letter);
    }

    









}
