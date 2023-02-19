package com.example.stereotypeannotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepo {

    public String Hellorepo() {
      return   "This is Repo class";
    }
}
