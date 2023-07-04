package CSFre.CSFre.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_REVIEW_BY_ID = """
            
            """;








}
