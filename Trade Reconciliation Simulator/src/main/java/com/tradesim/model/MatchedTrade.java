package com.tradesim.model;

import java.time.LocalDateTime;

public class MatchedTrade {
    private String tradeId;
    private String symbol;
    private int quantity;
    private double priceA;
    private double priceB;
    private String direction;
    private double pnl;
    private LocalDateTime matchTime;

    public MatchedTrade(String tradeId, String symbol, int quantity, double priceA, double priceB, String direction, double pnl, LocalDateTime matchTime) {
        this.tradeId = tradeId;
        this.symbol = symbol;
        this.quantity = quantity;
        this.priceA = priceA;
        this.priceB = priceB;
        this.direction = direction;
        this.pnl = pnl;
        this.matchTime = matchTime;
    }

    public String getTradeId() { return tradeId; }
    public void setTradeId(String tradeId) { this.tradeId = tradeId; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPriceA() { return priceA; }
    public void setPriceA(double priceA) { this.priceA = priceA; }

    public double getPriceB() { return priceB; }
    public void setPriceB(double priceB) { this.priceB = priceB; }

    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }

    public double getPnl() { return pnl; }
    public void setPnl(double pnl) { this.pnl = pnl; }

    public LocalDateTime getMatchTime() { return matchTime; }
    public void setMatchTime(LocalDateTime matchTime) { this.matchTime = matchTime; }

    @Override
    public String toString() {
        return "MatchedTrade{" +
                "tradeId='" + tradeId + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", priceA=" + priceA +
                ", priceB=" + priceB +
                ", direction='" + direction + '\'' +
                ", pnl=" + pnl +
                ", matchTime=" + matchTime +
                '}';
    }
} 