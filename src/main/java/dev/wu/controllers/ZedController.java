package dev.wu.controllers;

import dev.wu.entities.Zed;
import dev.wu.services.ZedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/zeds")
public class ZedController {

    @Autowired
    ZedService zedService;

    @GetMapping
    public ResponseEntity<List<Zed>> getAllZeds() { return ResponseEntity.ok(zedService.findAll()); }
}
