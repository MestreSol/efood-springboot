package com.bigo.efood.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {
    public ModelMapper modelMappar(){
        return new ModelMapper();
    }
}
