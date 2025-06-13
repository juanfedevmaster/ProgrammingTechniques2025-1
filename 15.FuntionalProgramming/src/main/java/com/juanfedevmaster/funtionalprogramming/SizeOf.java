/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.funtionalprogramming;

import java.util.function.Function;

/**
 *
 * @author jufeq
 */
public class SizeOf implements Function<String, Integer>{

    @Override
    public Integer apply(String t) {
        return t.length();
    }
    
}
