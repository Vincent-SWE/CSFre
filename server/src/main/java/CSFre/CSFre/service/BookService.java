package CSFre.CSFre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CSFre.CSFre.repository.BookRepository;

@Service
public class BookService {
    

    @Autowired
    BookRepository bookRepository;


    public String findBookByT(String request){
        return bookRepository.findBookByT().toString();
    }

        public String findBookByLetter(String letter){
        return bookRepository.findBookByLetter(letter).toString();
    }





}
