package com.fastcampus.hellospringbatch.core.service;

import com.fastcampus.hellospringbatch.dto.PlayerDto;
import com.fastcampus.hellospringbatch.dto.PlayerSalaryDto;
import org.springframework.stereotype.Service;

import java.time.Year;

/**
 * fileName : PlayerSalaryService
 * author :  KimSangHoon
 * date : 2022/11/19
 */
@Service
public class PlayerSalaryService {

    public PlayerSalaryDto calcSalary(PlayerDto player) {
        int salary = (Year.now().getValue() - player.getBirthYear()) * 1_000_000;
        return PlayerSalaryDto.of(player, salary);
    }
}
