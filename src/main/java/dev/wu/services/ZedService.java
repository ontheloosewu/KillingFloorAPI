package dev.wu.services;

import dev.wu.entities.Zed;
import dev.wu.repos.ZedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZedService {

    @Autowired
    ZedRepo zedRepo;

    public List<Zed> findAll() { return zedRepo.findAll(); }
}
