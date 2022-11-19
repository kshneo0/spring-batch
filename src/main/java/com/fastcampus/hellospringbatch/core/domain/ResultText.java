package com.fastcampus.hellospringbatch.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * fileName : PlainText
 * author :  KimSangHoon
 * date : 2022/11/10
 */
@Entity
@Getter
@Setter
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "result_text")
public class ResultText {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String text;
}
