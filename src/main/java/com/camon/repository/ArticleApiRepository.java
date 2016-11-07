package com.camon.repository;

import com.camon.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by camon on 2016-11-04.
 */
public interface ArticleApiRepository extends JpaRepository<Article, Long> {
  List<Article> findByContentContainingIgnoreCase(String content);
}
