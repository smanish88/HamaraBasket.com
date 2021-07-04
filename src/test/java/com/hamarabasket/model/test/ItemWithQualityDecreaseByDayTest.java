/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket.model.test;

import static com.hamarabasket.model.Item.MINUMUM_QUALITY_VALUE;
import com.hamarabasket.model.ItemWithQualityDecreaseByDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author manish
 */
public class ItemWithQualityDecreaseByDayTest {

    private ItemWithQualityDecreaseByDay item;

    @BeforeEach
    public void setUp() {
        item = new ItemWithQualityDecreaseByDay(10, 10);
    }
    
    @Test
    public void sellByValueDecreaseByOneDay() {
        item.updateQualityValue();
        Assertions.assertEquals(9, item.getSellByValue());
    }
    
    @Test
    public void qualityDecreaseTwiceFastIfSellByValuePassed() {
        item = new ItemWithQualityDecreaseByDay(0, 10);
        item.updateQualityValue();
        Assertions.assertEquals(8, item.getQualityValue());
    }
    
    @Test
    public void qualityDecreaseByOneIfSellByValueNotPassed() {
        item = new ItemWithQualityDecreaseByDay(10, 10);
        item.updateQualityValue();
        Assertions.assertEquals(9, item.getQualityValue());
    }
    
    @Test
    public void qualityRemainInLowerBoundary() {
        item = new ItemWithQualityDecreaseByDay(10, MINUMUM_QUALITY_VALUE);
        item.updateQualityValue();
        Assertions.assertEquals(MINUMUM_QUALITY_VALUE, item.getQualityValue());
    }
    
}
