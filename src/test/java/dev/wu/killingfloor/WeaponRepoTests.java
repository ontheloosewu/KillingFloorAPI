package dev.wu.killingfloor;

import dev.wu.entities.Weapon;
import dev.wu.repos.WeaponRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class WeaponRepoTests {

    @Autowired
    WeaponRepo weaponRepo;

    @Test
    void get_all_weapons(){
        List<Weapon> weapons = this.weaponRepo.findAll();
        System.out.println(weapons);
    }
}
