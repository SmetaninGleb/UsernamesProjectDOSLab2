package ru.innopolis.dos.lab2.SaveYourName.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.innopolis.dos.lab2.SaveYourName.dto.UserNameDto;
import ru.innopolis.dos.lab2.SaveYourName.models.UserName;
import ru.innopolis.dos.lab2.SaveYourName.repositories.UserNameRepository;

import java.util.List;

@Service
public class UserNameServiceImpl implements UserNameService {

    private UserNameRepository userNameRepository;

    @Autowired
    public UserNameServiceImpl(UserNameRepository userNameRepository) {
        this.userNameRepository = userNameRepository;
    }

    @Override
    public void saveUserName(UserNameDto userNameDto) {
        UserName newUserName = new UserName();
        newUserName.setUsername(userNameDto.getUsername());
        userNameRepository.save(newUserName);
    }

    @Override
    public List<UserNameDto> getUserNames() {
        return userNameRepository
                .findAll()
                .stream()
                .map(userName -> {
                    UserNameDto dto = new UserNameDto();
                    dto.setUsername(userName.getUsername());
                    return dto;
                })
                .toList();
    }
}
