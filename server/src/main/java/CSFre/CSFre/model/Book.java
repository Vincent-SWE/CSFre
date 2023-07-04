package CSFre.CSFre.model;

public class Book {
    
    private String bookId;
    private String title;
    private String authors;
    private Integer pages;
    private Integer rating;
    private Integer ratingCount;
    private String genre;
    private String imageUrl;


    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    
    public Integer getPages() {
        return pages;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public Integer getRatingCount() {
        return ratingCount;
    }
    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    


}
