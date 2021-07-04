/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket.model;

/**
 * This kind of item's quality is decrease by 
 * each passing day
 * @author manish
 */
public class ItemWithQualityDecreaseByDay extends Item{

    public ItemWithQualityDecreaseByDay(int sellByValue, int qualityValue) {
        super(sellByValue, qualityValue);
    }

    @Override
    public void updateQualityValue() {
        decreaseSellByValue(1);
        if (isSellByDatePassed()) { //once sellBy date has been passed ,
            decreaseQualityValue(2); //quality decrease twice as fast
        } else {
            decreaseQualityValue(1);
        }
    }
    
}
