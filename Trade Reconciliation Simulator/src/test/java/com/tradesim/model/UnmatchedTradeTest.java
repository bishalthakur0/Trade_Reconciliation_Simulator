package com.tradesim.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class UnmatchedTradeTest {
    @Test
    public void testUnmatchedTradeConstructorAndGetters() {
        LocalDateTime now = LocalDateTime.now();
        UnmatchedTrade ut = new UnmatchedTrade("T1006", "A", "TSLA", 50, 700.0, "Buy", now);
        assertEquals("T1006", ut.getTradeId());
        assertEquals("A", ut.getSource());
        assertEquals("TSLA", ut.getSymbol());
        assertEquals(50, ut.getQuantity());
        assertEquals(700.0, ut.getPrice());
        assertEquals("Buy", ut.getDirection());
        assertEquals(now, ut.getDetectedTime());
    }

    @Test
    public void testSetters() {
        UnmatchedTrade ut = new UnmatchedTrade("", "", "", 0, 0.0, "", LocalDateTime.now());
        ut.setTradeId("T1007");
        ut.setSource("B");
        ut.setSymbol("AAPL");
        ut.setQuantity(100);
        ut.setPrice(190.5);
        ut.setDirection("Sell");
        LocalDateTime detectedTime = LocalDateTime.now();
        ut.setDetectedTime(detectedTime);
        assertEquals("T1007", ut.getTradeId());
        assertEquals("B", ut.getSource());
        assertEquals("AAPL", ut.getSymbol());
        assertEquals(100, ut.getQuantity());
        assertEquals(190.5, ut.getPrice());
        assertEquals("Sell", ut.getDirection());
        assertEquals(detectedTime, ut.getDetectedTime());
    }
} 