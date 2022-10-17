package dev.wu.controllers;

import dev.wu.entities.Weapon;
import dev.wu.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/weapons")
public class WeaponController {

    @Autowired
    WeaponService weaponService;

    @GetMapping
    public ResponseEntity<List<Weapon>> getAllWeapons(){
        return ResponseEntity.ok(this.weaponService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Weapon> getWeaponById(@PathVariable String id){
        Optional<Weapon> weaponOptional = weaponService.getWeaponById(Integer.parseInt(id));
        return weaponOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
