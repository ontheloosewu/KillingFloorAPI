package dev.wu.repos;

import dev.wu.entities.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepo extends JpaRepository<Weapon, Integer> {
}
