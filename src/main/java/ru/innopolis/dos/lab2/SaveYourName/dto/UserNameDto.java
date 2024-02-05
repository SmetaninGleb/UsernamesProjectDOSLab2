package ru.innopolis.dos.lab2.SaveYourName.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserNameDto {
    @NotNull
    private String username;
}
