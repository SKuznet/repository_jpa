package io.khasang.demo.repository;

import io.khasang.demo.data.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
    Cat findById(long id);
}
