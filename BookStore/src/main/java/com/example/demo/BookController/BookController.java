package com.example.demo.BookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BookRepository.BookRepository;
import com.example.demo.Model.Book;
@RestController
public class BookController {
	
    @Autowired
	private BookRepository repository;
	
		@PostMapping("/addBook")
		public String saveBookString(@RequestBody Book book) {
			repository.save(book);
			return "the changed is :"+book.getId();
		}
		public String deleteBook() {
			repository .deletebyId(id)
			return
					
		}
		@GetMapping("/findAllBooks")
		public List<Book> getBooks(){
		repository.findAll();
	}

}
}
