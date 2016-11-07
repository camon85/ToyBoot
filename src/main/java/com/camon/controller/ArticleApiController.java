package com.camon.controller;

import com.camon.domain.Article;
import com.camon.service.ArticleApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by camon on 2016-11-04.
 */
@RestController
@RequestMapping("/api/articles")
public class ArticleApiController {
  @Autowired
  private ArticleApiService articleService;

  @RequestMapping(method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.CREATED)
  public Article add(@RequestBody Article article) {
    return articleService.add(article);
  }

  @RequestMapping(method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  public List<Article> findAll(@RequestParam(required = false) String content) {
    return articleService.findAll(content);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  public Article findById(@PathVariable Long id) {
    return articleService.findById(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  @ResponseStatus(HttpStatus.OK)
  public Article modify(@PathVariable Long id, @RequestBody Article article) {
    return articleService.modify(id, article);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void remove(@PathVariable Long id) {
    articleService.remove(id);
  }
}