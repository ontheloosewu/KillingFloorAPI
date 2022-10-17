package dev.wu.killingfloor;

import dev.wu.entities.Zed;
import dev.wu.repos.ZedRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class ZedRepoTests {

    @Autowired
    ZedRepo zedRepo;

    @Test
    void get_all_zeds(){
        List<Zed> zeds = this.zedRepo.findAll();
        System.out.println(zeds);
    }

}
