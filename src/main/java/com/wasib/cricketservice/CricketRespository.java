package com.wasib.cricketservice;

import java.util.Collection;
import java.util.HashMap;

public class CricketRespository implements ICricket<Players>{

    private HashMap<Integer,Players> respository;
    public CricketRespository(){
        respository = new HashMap<>();
        respository.put(1,new Players((1), "Javaid Miandad", "Pakistan", 67.8f , 54));
        respository.put(2,new Players((2), "Wasim Akram", "Pakistan", 80.93f , 444));
    }

    
    @Override
    public void save(Players t) {
        respository.put(t.getId(),t);

    }

    @Override
    public Collection<Players> viewAll() {
        return respository.values();
    }

    @Override
    public void update(Players t) {
        
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override public void delete (Players t){
    throw new UnsupportedOperationException("Unimplemented method '_'");}



    
}
