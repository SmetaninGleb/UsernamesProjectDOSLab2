package ru.innopolis.dos.lab2.SaveYourName.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.innopolis.dos.lab2.SaveYourName.dto.UserNameDto;
import ru.innopolis.dos.lab2.SaveYourName.services.UserNameService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserNameController {

    private final UserNameService userNameService;

    @Autowired
    public UserNameController(UserNameService userNameService) {
        this.userNameService = userNameService;
    }

    @PostMapping("/addUserName")
    public ResponseEntity<HttpStatus> addUserName(@RequestBody @Valid UserNameDto userNameDto) {
        userNameService.saveUserName(userNameDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public List<UserNameDto> getAllUserNames() {
        return userNameService.getUserNames();
    }

}
