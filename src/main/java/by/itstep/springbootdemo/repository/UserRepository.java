package by.itstep.springbootdemo.repository;

import by.itstep.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
