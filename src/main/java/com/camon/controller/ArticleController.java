package com.camon.controller;

import com.camon.service.ArticleApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by camon on 2016-11-04.
 */
@Controller
@RequestMapping("/articles")
public class ArticleController {

  @Autowired
  private ArticleApiService service;

  @RequestMapping(method = RequestMethod.GET)
  public String list(@RequestParam(required = false) String content, Model model) {
    model.addAttribute("articles", service.findAll(content));
    return "article/list";
  }
}
