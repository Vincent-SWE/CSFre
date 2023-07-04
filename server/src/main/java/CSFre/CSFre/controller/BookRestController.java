package CSFre.CSFre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import CSFre.CSFre.model.Book;
import CSFre.CSFre.service.BookService;

@RestController
public class BookRestController {
    

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public ResponseEntity<String> findBookByT(@RequestBody String request) {
        String response = bookService.findBookByT(request);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @GetMapping("/book/{letter}")
    public ResponseEntity<String> findBookByLetter(@PathVariable("letter") String letter) {
        String book  = bookService.findBookByLetter(letter);
        if (book == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(book);
    }














    
}





