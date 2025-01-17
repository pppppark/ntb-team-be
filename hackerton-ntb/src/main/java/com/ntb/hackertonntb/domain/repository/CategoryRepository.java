package com.ntb.hackertonntb.domain.repository;

import com.ntb.hackertonntb.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByIdContaining(String keyword);
}