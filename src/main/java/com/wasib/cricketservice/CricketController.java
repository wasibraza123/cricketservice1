package com.wasib.cricketservice;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("cricket")
public class CricketController {
    CricketRespository repo;
    public CricketController (){
        repo = new CricketRespository();
    }
    @GetMapping("all")
    public Collection<Players> getAll(){
        return repo.viewAll();
    }

    @PostMapping("add")
    public String addplayer (@RequestBody Players p){
        repo.save(p);
        return "Player Saved as " + p.getName();
    }
          
        }
    

