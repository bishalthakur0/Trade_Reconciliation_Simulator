package com.tradesim.model;

import java.time.LocalDateTime;

public class MismatchedTrade {
    private String tradeId;
    private String symbol;
    private int quantityA;
    private int quantityB;
    private double priceA;
    private double priceB;
    private String directionA;
    private String directionB;
    private String mismatchReason;
    private LocalDateTime detectedTime;

    public MismatchedTrade(String tradeId, String symbol, int quantityA, int quantityB, double priceA, double priceB, String directionA, String directionB, String mismatchReason, LocalDateTime detectedTime) {
        this.tradeId = tradeId;
        this.symbol = symbol;
        this.quantityA = quantityA;
        this.quantityB = quantityB;
        this.priceA = priceA;
        this.priceB = priceB;
        this.directionA = directionA;
        this.directionB = directionB;
        this.mismatchReason = mismatchReason;
        this.detectedTime = detectedTime;
    }

    public String getTradeId() { return tradeId; }
    public void setTradeId(String tradeId) { this.tradeId = tradeId; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public int getQuantityA() { return quantityA; }
    public void setQuantityA(int quantityA) { this.quantityA = quantityA; }

    public int getQuantityB() { return quantityB; }
    public void setQuantityB(int quantityB) { this.quantityB = quantityB; }

    public double getPriceA() { return priceA; }
    public void setPriceA(double priceA) { this.priceA = priceA; }

    public double getPriceB() { return priceB; }
    public void setPriceB(double priceB) { this.priceB = priceB; }

    public String getDirectionA() { return directionA; }
    public void setDirectionA(String directionA) { this.directionA = directionA; }

    public String getDirectionB() { return directionB; }
    public void setDirectionB(String directionB) { this.directionB = directionB; }

    public String getMismatchReason() { return mismatchReason; }
    public void setMismatchReason(String mismatchReason) { this.mismatchReason = mismatchReason; }

    public LocalDateTime getDetectedTime() { return detectedTime; }
    public void setDetectedTime(LocalDateTime detectedTime) { this.detectedTime = detectedTime; }

    @Override
    public String toString() {
        return "MismatchedTrade{" +
                "tradeId='" + tradeId + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantityA=" + quantityA +
                ", quantityB=" + quantityB +
                ", priceA=" + priceA +
                ", priceB=" + priceB +
                ", directionA='" + directionA + '\'' +
                ", directionB='" + directionB + '\'' +
                ", mismatchReason='" + mismatchReason + '\'' +
                ", detectedTime=" + detectedTime +
                '}';
    }
} 