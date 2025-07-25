package com.tradesim.util;

import com.tradesim.model.Trade;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static List<Trade> readTradesFromCsv(String filePath) {
        List<Trade> trades = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (int i = 1; i < lines.size(); i++) { // skip header
                String[] tokens = lines.get(i).split(",");
                if (tokens.length < 6) continue;
                String tradeId = tokens[0].trim();
                LocalDateTime timestamp = LocalDateTime.parse(tokens[1].trim(), FORMATTER);
                String symbol = tokens[2].trim();
                int quantity = Integer.parseInt(tokens[3].trim());
                double price = Double.parseDouble(tokens[4].trim());
                String direction = tokens[5].trim();
                trades.add(new Trade(tradeId, timestamp, symbol, quantity, price, direction));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trades;
    }
} 