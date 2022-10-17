package dev.wu.repos;

import dev.wu.entities.Zed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZedRepo extends JpaRepository<Zed, Integer> {
}
