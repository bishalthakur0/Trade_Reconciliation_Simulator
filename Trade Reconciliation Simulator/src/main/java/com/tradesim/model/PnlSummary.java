package com.tradesim.model;

import java.time.LocalDate;

public class PnlSummary {
    private LocalDate date;
    private double totalPnl;
    private int matchedTradesCount;
    private int mismatchedTradesCount;
    private int unmatchedTradesCount;

    public PnlSummary(LocalDate date, double totalPnl, int matchedTradesCount, int mismatchedTradesCount, int unmatchedTradesCount) {
        this.date = date;
        this.totalPnl = totalPnl;
        this.matchedTradesCount = matchedTradesCount;
        this.mismatchedTradesCount = mismatchedTradesCount;
        this.unmatchedTradesCount = unmatchedTradesCount;
    }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public double getTotalPnl() { return totalPnl; }
    public void setTotalPnl(double totalPnl) { this.totalPnl = totalPnl; }

    public int getMatchedTradesCount() { return matchedTradesCount; }
    public void setMatchedTradesCount(int matchedTradesCount) { this.matchedTradesCount = matchedTradesCount; }

    public int getMismatchedTradesCount() { return mismatchedTradesCount; }
    public void setMismatchedTradesCount(int mismatchedTradesCount) { this.mismatchedTradesCount = mismatchedTradesCount; }

    public int getUnmatchedTradesCount() { return unmatchedTradesCount; }
    public void setUnmatchedTradesCount(int unmatchedTradesCount) { this.unmatchedTradesCount = unmatchedTradesCount; }

    @Override
    public String toString() {
        return "PnlSummary{" +
                "date=" + date +
                ", totalPnl=" + totalPnl +
                ", matchedTradesCount=" + matchedTradesCount +
                ", mismatchedTradesCount=" + mismatchedTradesCount +
                ", unmatchedTradesCount=" + unmatchedTradesCount +
                '}';
    }
} 