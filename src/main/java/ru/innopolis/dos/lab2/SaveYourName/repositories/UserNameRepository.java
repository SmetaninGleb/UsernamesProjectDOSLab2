package ru.innopolis.dos.lab2.SaveYourName.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.innopolis.dos.lab2.SaveYourName.models.UserName;

@Repository
public interface UserNameRepository extends JpaRepository<UserName, Long> {
}
