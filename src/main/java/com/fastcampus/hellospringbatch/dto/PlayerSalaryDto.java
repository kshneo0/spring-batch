package com.fastcampus.hellospringbatch.dto;

import lombok.Data;

/**
 * fileName : PlayerSalaryDto
 * author :  KimSangHoon
 * date : 2022/11/19
 */
@Data
public class PlayerSalaryDto {
    private String ID;
    private String lastName;
    private String firstName;
    private String position;
    private int birthYear;
    private int debutYear;
    private int salary;

    public static PlayerSalaryDto of(PlayerDto player, int salary) {
        PlayerSalaryDto playerSalary = new PlayerSalaryDto();
        playerSalary.setID(player.getID());
        playerSalary.setLastName(player.getLastName());
        playerSalary.setFirstName(player.getFirstName());
        playerSalary.setPosition(player.getPosition());
        playerSalary.setBirthYear(player.getBirthYear());
        playerSalary.setDebutYear(player.getDebutYear());
        playerSalary.setSalary(salary);
        return playerSalary;
    }
}
