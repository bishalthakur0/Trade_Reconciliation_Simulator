# Data Model: Trade Reconciliation Simulator

## Database Tables

### 1. trades_source_a
| Column      | Type        | Description                       |
|-------------|------------|-----------------------------------|
| trade_id    | VARCHAR     | Unique trade identifier           |
| timestamp   | DATETIME    | Trade timestamp                   |
| symbol      | VARCHAR     | Security symbol                   |
| quantity    | INT         | Number of shares/contracts        |
| price       | DECIMAL     | Trade price                       |
| direction   | VARCHAR     | 'Buy' or 'Sell'                   |

### 2. trades_source_b
| Column      | Type        | Description                       |
|-------------|------------|-----------------------------------|
| trade_id    | VARCHAR     | Unique trade identifier           |
| timestamp   | DATETIME    | Trade timestamp                   |
| symbol      | VARCHAR     | Security symbol                   |
| quantity    | INT         | Number of shares/contracts        |
| price       | DECIMAL     | Trade price                       |
| direction   | VARCHAR     | 'Buy' or 'Sell'                   |

### 3. matched_trades
| Column      | Type        | Description                       |
|-------------|------------|-----------------------------------|
| trade_id    | VARCHAR     | Unique trade identifier           |
| symbol      | VARCHAR     | Security symbol                   |
| quantity    | INT         | Number of shares/contracts        |
| price_a     | DECIMAL     | Price from source A               |
| price_b     | DECIMAL     | Price from source B               |
| direction   | VARCHAR     | 'Buy' or 'Sell'                   |
| pnl         | DECIMAL     | Calculated P&L                    |
| match_time  | DATETIME    | Time of matching                  |

### 4. mismatched_trades
| Column      | Type        | Description                       |
|-------------|------------|-----------------------------------|
| trade_id    | VARCHAR     | Unique trade identifier           |
| symbol      | VARCHAR     | Security symbol                   |
| quantity_a  | INT         | Quantity from source A            |
| quantity_b  | INT         | Quantity from source B            |
| price_a     | DECIMAL     | Price from source A               |
| price_b     | DECIMAL     | Price from source B               |
| direction_a | VARCHAR     | Direction from source A           |
| direction_b | VARCHAR     | Direction from source B           |
| mismatch_reason | VARCHAR | Description of mismatch           |
| detected_time   | DATETIME| Time of mismatch detection        |

### 5. unmatched_trades
| Column      | Type        | Description                       |
|-------------|------------|-----------------------------------|
| trade_id    | VARCHAR     | Unique trade identifier           |
| source      | VARCHAR     | 'A' or 'B'                        |
| symbol      | VARCHAR     | Security symbol                   |
| quantity    | INT         | Number of shares/contracts        |
| price       | DECIMAL     | Trade price                       |
| direction   | VARCHAR     | 'Buy' or 'Sell'                   |
| detected_time | DATETIME  | Time of detection                 |

### 6. pnl_summary
| Column      | Type        | Description                       |
|-------------|------------|-----------------------------------|
| date        | DATE        | Trade date                        |
| total_pnl   | DECIMAL     | Cumulative P&L for the day        |
| matched_trades_count | INT| Number of matched trades          |
| mismatched_trades_count | INT| Number of mismatched trades     |
| unmatched_trades_count | INT| Number of unmatched trades       |

## Sample Data

### trades_source_a
| trade_id | timestamp           | symbol | quantity | price  | direction |
|----------|---------------------|--------|----------|--------|-----------|
| T1001    | 2024-06-01 09:00:00 | AAPL   | 100      | 190.50 | Buy       |
| T1002    | 2024-06-01 09:01:00 | MSFT   | 200      | 320.10 | Sell      |

### trades_source_b
| trade_id | timestamp           | symbol | quantity | price  | direction |
|----------|---------------------|--------|----------|--------|-----------|
| T1001    | 2024-06-01 09:00:01 | AAPL   | 100      | 190.55 | Buy       |
| T1002    | 2024-06-01 09:01:02 | MSFT   | 200      | 320.10 | Sell      |

### matched_trades
| trade_id | symbol | quantity | price_a | price_b | direction | pnl   | match_time           |
|----------|--------|----------|---------|---------|-----------|-------|----------------------|
| T1002    | MSFT   | 200      | 320.10  | 320.10  | Sell      | 0.00  | 2024-06-01 09:02:00  |

### mismatched_trades
| trade_id | symbol | quantity_a | quantity_b | price_a | price_b | direction_a | direction_b | mismatch_reason | detected_time         |
|----------|--------|------------|------------|---------|---------|-------------|-------------|-----------------|----------------------|
| T1001    | AAPL   | 100        | 100        | 190.50  | 190.55  | Buy         | Buy         | Price mismatch  | 2024-06-01 09:02:01  |

### unmatched_trades
| trade_id | source | symbol | quantity | price  | direction | detected_time         |
|----------|--------|--------|----------|--------|-----------|----------------------|
| T1003    | A      | TSLA   | 50       | 700.00 | Buy       | 2024-06-01 09:03:00  |

### pnl_summary
| date       | total_pnl | matched_trades_count | mismatched_trades_count | unmatched_trades_count |
|------------|-----------|----------------------|------------------------|-----------------------|
| 2024-06-01 | 0.00      | 1                    | 1                      | 1                     | 