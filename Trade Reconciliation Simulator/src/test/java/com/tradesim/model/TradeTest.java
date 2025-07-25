package com.tradesim.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TradeTest {
    @Test
    public void testTradeConstructorAndGetters() {
        LocalDateTime now = LocalDateTime.now();
        Trade trade = new Trade("T1001", now, "AAPL", 100, 190.5, "Buy");
        assertEquals("T1001", trade.getTradeId());
        assertEquals(now, trade.getTimestamp());
        assertEquals("AAPL", trade.getSymbol());
        assertEquals(100, trade.getQuantity());
        assertEquals(190.5, trade.getPrice());
        assertEquals("Buy", trade.getDirection());
    }

    @Test
    public void testSetters() {
        Trade trade = new Trade("", LocalDateTime.now(), "", 0, 0.0, "");
        trade.setTradeId("T2002");
        trade.setSymbol("MSFT");
        trade.setQuantity(200);
        trade.setPrice(320.1);
        trade.setDirection("Sell");
        assertEquals("T2002", trade.getTradeId());
        assertEquals("MSFT", trade.getSymbol());
        assertEquals(200, trade.getQuantity());
        assertEquals(320.1, trade.getPrice());
        assertEquals("Sell", trade.getDirection());
    }
} 