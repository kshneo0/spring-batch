package com.fastcampus.hellospringbatch.core.repository;

import com.fastcampus.hellospringbatch.core.domain.PlainText;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * fileName : PlainTestRepository
 * author :  KimSangHoon
 * date : 2022/11/10
 */
public interface PlainTextRepository extends JpaRepository<PlainText, Integer> {
    Page<PlainText> findBy(Pageable pageable);
}
