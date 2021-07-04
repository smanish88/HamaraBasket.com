/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket.model.test;

import com.hamarabasket.model.ItemWithQualityIncreaseByDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author manish
 */
public class ItemWithQualityIncreaseByDayTest {

    private ItemWithQualityIncreaseByDay item;

    @BeforeEach
    public void setUp() {
        item = new ItemWithQualityIncreaseByDay(10, 10);
    }

    @Test
    public void sellByValueDecreaseByOneDay() {
        item.updateQualityValue();
        Assertions.assertEquals(9, item.getSellByValue());
    }

    @Test
    public void qualityDecreaseTwiceFastIfSellByValuePassed() {
        item = new ItemWithQualityIncreaseByDay(0, 10);
        item.updateQualityValue();
        Assertions.assertEquals(8, item.getQualityValue());
    }

    @Test
    public void qualityDecreaseByOneIfSellByValueNotPassed() {
        item = new ItemWithQualityIncreaseByDay(10, 10);
        item.updateQualityValue();
        Assertions.assertEquals(11, item.getQualityValue());
    }
}
