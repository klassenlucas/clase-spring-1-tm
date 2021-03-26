package com.meli.numeros_romanos.controllers;

import com.meli.numeros_romanos.entities.Converter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {
    @GetMapping(path= "/{number}")
    public Converter convertIntToRoman(@PathVariable int number) {
        return new Converter(number);
    }
}
