package com.tradesim.model;

import java.time.LocalDateTime;

public class UnmatchedTrade {
    private String tradeId;
    private String source; // "A" or "B"
    private String symbol;
    private int quantity;
    private double price;
    private String direction;
    private LocalDateTime detectedTime;

    public UnmatchedTrade(String tradeId, String source, String symbol, int quantity, double price, String direction, LocalDateTime detectedTime) {
        this.tradeId = tradeId;
        this.source = source;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.direction = direction;
        this.detectedTime = detectedTime;
    }

    public String getTradeId() { return tradeId; }
    public void setTradeId(String tradeId) { this.tradeId = tradeId; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }

    public LocalDateTime getDetectedTime() { return detectedTime; }
    public void setDetectedTime(LocalDateTime detectedTime) { this.detectedTime = detectedTime; }

    @Override
    public String toString() {
        return "UnmatchedTrade{" +
                "tradeId='" + tradeId + '\'' +
                ", source='" + source + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", direction='" + direction + '\'' +
                ", detectedTime=" + detectedTime +
                '}';
    }
} 