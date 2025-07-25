package com.tradesim.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MatchedTradeTest {
    @Test
    public void testMatchedTradeConstructorAndGetters() {
        LocalDateTime now = LocalDateTime.now();
        MatchedTrade mt = new MatchedTrade("T1002", "MSFT", 200, 320.1, 320.1, "Sell", 0.0, now);
        assertEquals("T1002", mt.getTradeId());
        assertEquals("MSFT", mt.getSymbol());
        assertEquals(200, mt.getQuantity());
        assertEquals(320.1, mt.getPriceA());
        assertEquals(320.1, mt.getPriceB());
        assertEquals("Sell", mt.getDirection());
        assertEquals(0.0, mt.getPnl());
        assertEquals(now, mt.getMatchTime());
    }

    @Test
    public void testSetters() {
        MatchedTrade mt = new MatchedTrade("", "", 0, 0.0, 0.0, "", 0.0, LocalDateTime.now());
        mt.setTradeId("T1003");
        mt.setSymbol("AAPL");
        mt.setQuantity(150);
        mt.setPriceA(191.0);
        mt.setPriceB(191.5);
        mt.setDirection("Buy");
        mt.setPnl(50.0);
        LocalDateTime matchTime = LocalDateTime.now();
        mt.setMatchTime(matchTime);
        assertEquals("T1003", mt.getTradeId());
        assertEquals("AAPL", mt.getSymbol());
        assertEquals(150, mt.getQuantity());
        assertEquals(191.0, mt.getPriceA());
        assertEquals(191.5, mt.getPriceB());
        assertEquals("Buy", mt.getDirection());
        assertEquals(50.0, mt.getPnl());
        assertEquals(matchTime, mt.getMatchTime());
    }
} 