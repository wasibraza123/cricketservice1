package com.wasib.cricketservice;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Players {


    private int id;
    private String name;
    private String country;
    private float avg;
    private int wickets;

    

    public Players(int id, String name,String country, float avg, int wickets){

        this.id = id;
        this.name = name;
        this.country = country;
        this.avg = avg;
        this.wickets = wickets;
    }
    public String getName()
    {
        return this.name;
    }
}
