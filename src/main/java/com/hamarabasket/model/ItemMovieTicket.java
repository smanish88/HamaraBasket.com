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
public class ItemMovieTicket extends Item{

    public ItemMovieTicket(int sellByValue, int qualityValue) {
        super(sellByValue, qualityValue);
    }

    @Override
    public void updateQualityValue() {
        decreaseSellByValue(1);
        if (isSellByDatePassed()) {
            setQualityValue(0);
        } else if (getSellByValue() <= 5) {
            increaseQualityValue(3);
        } else if (getSellByValue() <= 10) {
            increaseQualityValue(2);
        } else {
            increaseQualityValue(1);
        }
    }
    
}
