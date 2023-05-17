package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String Name);
    User findByEmail(String email);
    Optional<User> findById(Integer id);
    <S extends User> S save(S entity);
    List<User> findAll();
    void delete(User user);
    void deleteById(Integer integer);
}
