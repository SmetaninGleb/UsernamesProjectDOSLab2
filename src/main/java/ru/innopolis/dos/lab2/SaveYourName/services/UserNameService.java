package ru.innopolis.dos.lab2.SaveYourName.services;


import ru.innopolis.dos.lab2.SaveYourName.dto.UserNameDto;

import java.util.List;

public interface UserNameService {
    void saveUserName(UserNameDto userNameDto);
    List<UserNameDto> getUserNames();
}
