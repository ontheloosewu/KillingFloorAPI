package dev.wu.services;

import dev.wu.entities.Weapon;
import dev.wu.repos.WeaponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeaponService {

    @Autowired
    WeaponRepo weaponRepo;

    public List<Weapon> findAll() { return weaponRepo.findAll(); }

    public Optional<Weapon> getWeaponById(int id) { return weaponRepo.findById(id); }

}
