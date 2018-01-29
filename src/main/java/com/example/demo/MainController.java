package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
public class MainController {
    @RequestMapping ("/")
    public ArrayList booker(){
        SimpleExaminer booky = new SimpleExaminer();
        ArrayList result = booky.getBooks();
        return result;

    }

}
