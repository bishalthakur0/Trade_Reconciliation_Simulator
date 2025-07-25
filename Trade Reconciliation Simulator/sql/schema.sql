-- Trade Reconciliation Simulator Database Schema

CREATE TABLE trades_source_a (
    trade_id VARCHAR(32) PRIMARY KEY,
    timestamp DATETIME NOT NULL,
    symbol VARCHAR(16) NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(18,4) NOT NULL,
    direction VARCHAR(8) NOT NULL
);

CREATE TABLE trades_source_b (
    trade_id VARCHAR(32) PRIMARY KEY,
    timestamp DATETIME NOT NULL,
    symbol VARCHAR(16) NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(18,4) NOT NULL,
    direction VARCHAR(8) NOT NULL
);

CREATE TABLE matched_trades (
    trade_id VARCHAR(32) PRIMARY KEY,
    symbol VARCHAR(16) NOT NULL,
    quantity INT NOT NULL,
    price_a DECIMAL(18,4) NOT NULL,
    price_b DECIMAL(18,4) NOT NULL,
    direction VARCHAR(8) NOT NULL,
    pnl DECIMAL(18,4) NOT NULL,
    match_time DATETIME NOT NULL
);

CREATE TABLE mismatched_trades (
    trade_id VARCHAR(32) PRIMARY KEY,
    symbol VARCHAR(16) NOT NULL,
    quantity_a INT NOT NULL,
    quantity_b INT NOT NULL,
    price_a DECIMAL(18,4) NOT NULL,
    price_b DECIMAL(18,4) NOT NULL,
    direction_a VARCHAR(8) NOT NULL,
    direction_b VARCHAR(8) NOT NULL,
    mismatch_reason VARCHAR(64) NOT NULL,
    detected_time DATETIME NOT NULL
);

CREATE TABLE unmatched_trades (
    trade_id VARCHAR(32) NOT NULL,
    source VARCHAR(1) NOT NULL,
    symbol VARCHAR(16) NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(18,4) NOT NULL,
    direction VARCHAR(8) NOT NULL,
    detected_time DATETIME NOT NULL,
    PRIMARY KEY (trade_id, source)
);

CREATE TABLE pnl_summary (
    date DATE PRIMARY KEY,
    total_pnl DECIMAL(18,4) NOT NULL,
    matched_trades_count INT NOT NULL,
    mismatched_trades_count INT NOT NULL,
    unmatched_trades_count INT NOT NULL
); 