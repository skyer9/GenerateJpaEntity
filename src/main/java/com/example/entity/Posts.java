package com.example.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.example.entity.Posts")
@Table(name = "posts")
public class Posts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Long id;
  @Column(name = "\"created_date\"", nullable = true)
  private Timestamp createdDate;
  @Column(name = "\"modified_date\"", nullable = true)
  private Timestamp modifiedDate;
  @Column(name = "\"author\"", nullable = true)
  private String author;
  @Column(name = "\"content\"", nullable = false)
  private String content;
  @Column(name = "\"title\"", nullable = false)
  private String title;
}