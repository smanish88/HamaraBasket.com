/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket.model;

/**
 *
 * @author manish
 */
public class ItemWithQualityFixed extends Item{

    public ItemWithQualityFixed(int sellByValue, int qualityValue) {
        super(sellByValue, qualityValue);
    }

    @Override
    public void updateQualityValue() {
        //no change in quality ever
    }
    
}
