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
public abstract class Item {

    /**
     * Quality of an item is never negative
     */
    public static int MINUMUM_QUALITY_VALUE = 0;

    /**
     * Quality of an item is never more than 50
     */
    public static int MAXIMUM_QUALITY_VALUE = 50;

    /**
     * Number of days in which item has to be sell
     */
    private int sellByValue;

    /**
     * Number denoting how valuable item is
     */
    private int qualityValue;

    public Item(int sellByValue, int qualityValue) {
        this.sellByValue = sellByValue;
        this.qualityValue = qualityValue;
    }

    public int getSellByValue() {
        return sellByValue;
    }

    public void setSellByValue(int sellByValue) {
        this.sellByValue = sellByValue;
    }

    public int getQualityValue() {
        return qualityValue;
    }

    public void setQualityValue(int qualityValue) {
        this.qualityValue = qualityValue;
    }

    public void increaseSellByValue(int sellByValue) {
        this.sellByValue += sellByValue;
    }

    public void increaseQualityValue(int qualityValue) {
        this.qualityValue += qualityValue;
        maintainQualityValueBoundary();

    }
    
    public void decreaseSellByValue(int sellByValue) {
        if (!isSellByDatePassed()) {
            this.sellByValue -= sellByValue;
        }
        
    }

    public void decreaseQualityValue(int qualityValue) {
        this.qualityValue -= qualityValue;
        maintainQualityValueBoundary();

    }
    
    public boolean isSellByDatePassed() {
        return sellByValue == 0;
    }
    
    public void maintainQualityValueBoundary() {
        if (qualityValue < MINUMUM_QUALITY_VALUE) {
            qualityValue = MINUMUM_QUALITY_VALUE;
        }
        
        if (qualityValue > MAXIMUM_QUALITY_VALUE) {
            qualityValue = MAXIMUM_QUALITY_VALUE;
        }
    }
    public abstract void updateQualityValue();
}
