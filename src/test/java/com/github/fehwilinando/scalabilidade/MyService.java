package com.github.fehwilinando.scalabilidade;

import org.springframework.stereotype.Service;

@Service
public class MyService {


    @Log
    public boolean doAction(Long id) {
        return true;
    }
}
