package dev.wu.services;

import dev.wu.dtos.PerkWeapon;
import dev.wu.entities.Perk;
import dev.wu.dtos.PerkEffect;
import dev.wu.repos.PerkEffectRepo;
import dev.wu.repos.PerkRepo;
import dev.wu.repos.PerkWeaponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerkService {

    @Autowired
    PerkRepo perkRepo;

    @Autowired
    PerkEffectRepo perkEffectRepo;

    @Autowired
    PerkWeaponRepo perkWeaponRepo;

    public List<Perk> getAllPerks() { return this.perkRepo.findAll(); }

    public List<PerkEffect> getAllPerksEffects() { return this.perkEffectRepo.findAll(); }

    public List<PerkWeapon> getAllWeaponsByPerks() { return this.perkWeaponRepo.findAll(); }
}
