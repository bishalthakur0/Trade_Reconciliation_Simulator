# Trade Reconciliation Simulator

**Prepared by:** [Your Name]
**Date:** [Today's Date]
**Version:** 1.0

## 1. Purpose
The Trade Reconciliation Simulator is a mock post-trade processing system designed to simulate real-world functionalities such as trade matching, P&L (Profit and Loss) calculation, and trade reconciliation. This system introduces artificial latency using multithreading to closely mimic live market conditions and asynchronous processes.

## 2. Scope
- Read trades from two or more files representing different sources (e.g., internal system vs. external counterparty).
- Match trades based on defined criteria (trade ID, quantity, price, symbol).
- Calculate P&L per matched trade and cumulatively.
- Perform reconciliation by identifying matched, mismatched, and missing trades.
- Use multithreading to simulate processing delays and concurrency.
- Store reconciliation results in a SQL database.
- Include basic shell scripts for automation (e.g., cleanup, loading data).

## 3. Functional Requirements
### 3.1 Trade File Ingestion
- Accept trade files in CSV or delimited format.
- Each file must contain trade ID, timestamp, symbol, quantity, price, and direction (Buy/Sell).

### 3.2 Trade Matching
- Match trades from two different files/sources based on:
  - Trade ID (primary key)
  - Symbol
  - Quantity and Price (tolerance optional)
  - Direction (Buy vs. Sell)

### 3.3 P&L Calculation
- For matched trades: Compute P&L = (Sell Price - Buy Price) * Quantity.
- Store results in memory and database.

### 3.4 Reconciliation Logic
- Classify trades into:
  - Matched: All fields align.
  - Mismatched: Trade ID matches but fields differ.
  - Unmatched: Trade exists in one file only.
- Log all results to files and database.

### 3.5 Multithreading Simulation
- Simulate real-world trade processing delay.
- Separate threads for file reading, matching, and reconciliation.
- Introduce artificial latency (e.g., Thread.sleep()).

### 3.6 Data Storage
- Store trade and reconciliation results in an SQL database.
- Tables:
  - trades_source_a
  - trades_source_b
  - matched_trades
  - mismatched_trades
  - unmatched_trades
  - pnl_summary

### 3.7 Shell Scripting
- Automate:
  - File ingestion
  - DB cleanup and setup
  - Log rotation and archival

## 4. Non-Functional Requirements
- **Performance:** Must process 10,000+ trades within 30 seconds (target).
- **Concurrency:** Handle concurrent file ingestion and matching without race conditions.
- **Scalability:** Allow extension to support more than 2 trade sources.
- **Portability:** Should run on any Unix-based environment with Java, SQL, and Shell.
- **Maintainability:** Modular code structure with proper documentation and logging.

## 5. Tech Stack
- **Language:** Java (core logic, multithreading)
- **Database:** MySQL or PostgreSQL
- **Scripting:** Bash Shell Scripts
- **File I/O:** CSV, JSON (optional)
- **Tools:** JDBC, Maven/Gradle (build tool)

## 6. User Roles & Interfaces
### 6.1 Developer
- Run the simulator via command line or script.
- Configure input file paths and parameters.

### 6.2 Analyst
- View reconciliation logs and P&L outputs.
- Export reports for audit or review.

## 7. Assumptions and Constraints
- Trade files are assumed to be well-formatted and clean.
- Timestamps are not used for matching but stored for audit.
- Tolerance logic (e.g., price rounding) is not in scope unless specified.

## 8. Acceptance Criteria
- Trades from two files are matched and categorized correctly.
- P&L calculations are accurate.
- Logs and database reflect real-time reconciliation.
- Multithreaded processing works without data loss or corruption.
- Shell scripts automate the workflow reliably.

## 9. Future Enhancements (Optional)
- Add web UI for visualization.
- Support FIX message parsing.
- Add support for configurable tolerance levels.
- Integrate with messaging queues (Kafka/RabbitMQ)

---

## Getting Started

### Prerequisites
- Java 8 or higher
- MySQL or PostgreSQL
- Bash shell (for scripts)
- Maven or Gradle

### Setup
1. Clone the repository.
2. Configure database connection in `src/main/resources/application.properties`.
3. Build the project using Maven/Gradle.
4. Run the provided shell scripts for DB setup and data ingestion.

### Usage
- Place trade files in the designated input directory.
- Run the simulator via command line or script.
- View logs and database tables for reconciliation results.

### Data Model
- See `/docs/data_model.md` for table structures and sample data.

### Contributing
- Fork the repo and submit pull requests.

### License
- [Specify License] 
