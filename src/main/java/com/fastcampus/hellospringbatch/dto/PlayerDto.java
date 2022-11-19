package com.fastcampus.hellospringbatch.dto;


import lombok.Data;

/**
 * fileName : PlayerDto
 * author :  KimSangHoon
 * date : 2022/11/19
 */
@Data
public class PlayerDto {
    private String ID;
    private String lastName;
    private String firstName;
    private String position;
    private int birthYear;
    private int debutYear;
}
