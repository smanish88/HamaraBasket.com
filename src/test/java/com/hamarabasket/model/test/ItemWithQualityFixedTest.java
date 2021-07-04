/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket.model.test;

import com.hamarabasket.model.ItemWithQualityFixed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author manish
 */
public class ItemWithQualityFixedTest {
    
    @Test
    public void itemWithQualityFixedShouldNotChangeSellByAndQualityValue() {
        ItemWithQualityFixed itemWithQualityFixed = new ItemWithQualityFixed(10, 10);
        itemWithQualityFixed.updateQualityValue();
        Assertions.assertEquals(10, itemWithQualityFixed.getSellByValue());
        Assertions.assertEquals(10, itemWithQualityFixed.getQualityValue());
    }
}
