package com.example.controller;

import com.example.model.MovieEntity;
import com.example.repository.MovieRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Resource
    private MovieRepository movieRepository;
    //method implementations with walkthroughs below

    @GetMapping(value = { "", "/" })
    List<MovieEntity> getMovies() {
        List<MovieEntity> result = movieRepository.findAll();
        return result;
    }

    @GetMapping("/by-title")
    List<MovieEntity> byTitle(@RequestParam String title) {
        return movieRepository.findOneByTitle(title);
    }
}
