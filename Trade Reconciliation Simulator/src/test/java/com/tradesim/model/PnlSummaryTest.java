package com.tradesim.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PnlSummaryTest {
    @Test
    public void testPnlSummaryConstructorAndGetters() {
        LocalDate date = LocalDate.of(2024, 6, 1);
        PnlSummary ps = new PnlSummary(date, 1000.0, 10, 2, 1);
        assertEquals(date, ps.getDate());
        assertEquals(1000.0, ps.getTotalPnl());
        assertEquals(10, ps.getMatchedTradesCount());
        assertEquals(2, ps.getMismatchedTradesCount());
        assertEquals(1, ps.getUnmatchedTradesCount());
    }

    @Test
    public void testSetters() {
        PnlSummary ps = new PnlSummary(LocalDate.now(), 0.0, 0, 0, 0);
        LocalDate date = LocalDate.of(2024, 6, 2);
        ps.setDate(date);
        ps.setTotalPnl(2000.0);
        ps.setMatchedTradesCount(20);
        ps.setMismatchedTradesCount(3);
        ps.setUnmatchedTradesCount(2);
        assertEquals(date, ps.getDate());
        assertEquals(2000.0, ps.getTotalPnl());
        assertEquals(20, ps.getMatchedTradesCount());
        assertEquals(3, ps.getMismatchedTradesCount());
        assertEquals(2, ps.getUnmatchedTradesCount());
    }
} 