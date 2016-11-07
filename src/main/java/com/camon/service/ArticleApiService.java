package com.camon.service;

import com.camon.domain.Article;
import com.camon.repository.ArticleApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by camon on 2016-11-04.
 */
@Service
@Transactional
public class ArticleApiService {
  @Autowired
  private ArticleApiRepository repository;

  public List<Article> findAll(String content) {
    List<Article> articles;

    if (StringUtils.isEmpty(content)) {
      articles = repository.findAll();
    } else {
      articles = repository.findByContentContainingIgnoreCase(content);
    }

    return articles;
  }

  public Article findById(Long id) {
    return repository.findOne(id);
  }

  public Article add(Article article) {
    Date now = new Date();
    article.setCreateDate(now);
    article.setUpdateDate(now);
    return repository.save(article);
  }

  public Article modify(Long id, Article article) {
    Article oldArticle = findById(id);
    oldArticle.setContent(article.getContent());
    oldArticle.setUpdateDate(new Date());
    return repository.save(oldArticle);
  }

  public void remove(Long id) {
    repository.delete(id);
  }
}