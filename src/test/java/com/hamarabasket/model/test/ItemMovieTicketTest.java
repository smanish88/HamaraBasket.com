/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket.model.test;

import com.hamarabasket.model.ItemMovieTicket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author manish
 */
public class ItemMovieTicketTest {
    
    private ItemMovieTicket item;
    
    @BeforeEach
    public void setUp() {
        item = new ItemMovieTicket(10, 10);
    }
    
    @Test
    public void sellByValueDecreaseByOneDay() {
        item.updateQualityValue();
        Assertions.assertEquals(9, item.getSellByValue());
    }
    
    @Test
    public void qualityIncreaseByOneIfSellByDayGreateThanTen() {
        item = new ItemMovieTicket(12, 10);
        item.updateQualityValue();
        Assertions.assertEquals(11, item.getQualityValue());
    }
    
    @Test
    public void qualityIncreaseByThreeIfSellByDayLessOrEqualToFive() {
         item = new ItemMovieTicket(4, 10);
        item.updateQualityValue();
        Assertions.assertEquals(13, item.getQualityValue());
    }
    
    @Test
    public void qualityIncreaseByTwoIfSellByDayLessOrEqualToTen() {
         item = new ItemMovieTicket(9, 10);
        item.updateQualityValue();
        Assertions.assertEquals(12, item.getQualityValue());
    }
    
}
