package com.tradesim.model;

import java.time.LocalDateTime;

public class Trade {
    private String tradeId;
    private LocalDateTime timestamp;
    private String symbol;
    private int quantity;
    private double price;
    private String direction; // "Buy" or "Sell"

    public Trade(String tradeId, LocalDateTime timestamp, String symbol, int quantity, double price, String direction) {
        this.tradeId = tradeId;
        this.timestamp = timestamp;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.direction = direction;
    }

    public String getTradeId() { return tradeId; }
    public void setTradeId(String tradeId) { this.tradeId = tradeId; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeId='" + tradeId + '\'' +
                ", timestamp=" + timestamp +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", direction='" + direction + '\'' +
                '}';
    }
} 