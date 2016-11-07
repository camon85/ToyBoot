package com.camon.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by camon on 2016-11-04.
 */
@Entity
@Data
public class Article {

  @Id
  @GeneratedValue
  private Long id;

  private String content;

  private Date createDate;

  private Date updateDate;
}
