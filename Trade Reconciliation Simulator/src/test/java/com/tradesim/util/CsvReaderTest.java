package com.tradesim.util;

import com.tradesim.model.Trade;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CsvReaderTest {
    @Test
    public void testReadTradesFromCsv() throws IOException {
        String csvContent = "tradeId,timestamp,symbol,quantity,price,direction\n" +
                "T1001,2024-06-01 09:00:00,AAPL,100,190.50,Buy\n" +
                "T1002,2024-06-01 09:01:00,MSFT,200,320.10,Sell";
        Path tempFile = Files.createTempFile("trades", ".csv");
        Files.write(tempFile, csvContent.getBytes());

        List<Trade> trades = CsvReader.readTradesFromCsv(tempFile.toString());
        assertEquals(2, trades.size());
        Trade t1 = trades.get(0);
        assertEquals("T1001", t1.getTradeId());
        assertEquals(LocalDateTime.of(2024, 6, 1, 9, 0, 0), t1.getTimestamp());
        assertEquals("AAPL", t1.getSymbol());
        assertEquals(100, t1.getQuantity());
        assertEquals(190.50, t1.getPrice());
        assertEquals("Buy", t1.getDirection());
        Trade t2 = trades.get(1);
        assertEquals("T1002", t2.getTradeId());
        assertEquals(LocalDateTime.of(2024, 6, 1, 9, 1, 0), t2.getTimestamp());
        assertEquals("MSFT", t2.getSymbol());
        assertEquals(200, t2.getQuantity());
        assertEquals(320.10, t2.getPrice());
        assertEquals("Sell", t2.getDirection());

        Files.deleteIfExists(tempFile);
    }
} 