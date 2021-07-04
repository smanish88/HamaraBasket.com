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
public class ItemWithQualityIncreaseByDay extends Item {

    public ItemWithQualityIncreaseByDay(int sellByValue, int qualityValue) {
        super(sellByValue, qualityValue);
    }

    @Override
    public void updateQualityValue() {
        decreaseSellByValue(1);
        if (isSellByDatePassed()) { //once sellBy date has been passed ,
            decreaseQualityValue(2); //quality decrease twice as fast
        } else {
            increaseQualityValue(1);
        }
    }
    
}
