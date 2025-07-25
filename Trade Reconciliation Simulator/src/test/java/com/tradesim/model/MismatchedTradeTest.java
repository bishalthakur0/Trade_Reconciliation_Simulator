package com.tradesim.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MismatchedTradeTest {
    @Test
    public void testMismatchedTradeConstructorAndGetters() {
        LocalDateTime now = LocalDateTime.now();
        MismatchedTrade mm = new MismatchedTrade("T1004", "TSLA", 50, 60, 700.0, 701.0, "Buy", "Sell", "Direction mismatch", now);
        assertEquals("T1004", mm.getTradeId());
        assertEquals("TSLA", mm.getSymbol());
        assertEquals(50, mm.getQuantityA());
        assertEquals(60, mm.getQuantityB());
        assertEquals(700.0, mm.getPriceA());
        assertEquals(701.0, mm.getPriceB());
        assertEquals("Buy", mm.getDirectionA());
        assertEquals("Sell", mm.getDirectionB());
        assertEquals("Direction mismatch", mm.getMismatchReason());
        assertEquals(now, mm.getDetectedTime());
    }

    @Test
    public void testSetters() {
        MismatchedTrade mm = new MismatchedTrade("", "", 0, 0, 0.0, 0.0, "", "", "", LocalDateTime.now());
        mm.setTradeId("T1005");
        mm.setSymbol("GOOG");
        mm.setQuantityA(70);
        mm.setQuantityB(80);
        mm.setPriceA(1500.0);
        mm.setPriceB(1501.0);
        mm.setDirectionA("Buy");
        mm.setDirectionB("Sell");
        mm.setMismatchReason("Price mismatch");
        LocalDateTime detectedTime = LocalDateTime.now();
        mm.setDetectedTime(detectedTime);
        assertEquals("T1005", mm.getTradeId());
        assertEquals("GOOG", mm.getSymbol());
        assertEquals(70, mm.getQuantityA());
        assertEquals(80, mm.getQuantityB());
        assertEquals(1500.0, mm.getPriceA());
        assertEquals(1501.0, mm.getPriceB());
        assertEquals("Buy", mm.getDirectionA());
        assertEquals("Sell", mm.getDirectionB());
        assertEquals("Price mismatch", mm.getMismatchReason());
        assertEquals(detectedTime, mm.getDetectedTime());
    }
} 