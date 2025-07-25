#!/bin/bash
# db_cleanup.sh - Drop all tables for Trade Reconciliation Simulator

DB_USER="root"
DB_PASS="password"
DB_NAME="trade_recon"

tables="trades_source_a trades_source_b matched_trades mismatched_trades unmatched_trades pnl_summary"
for t in $tables; do
  mysql -u $DB_USER -p$DB_PASS -D $DB_NAME -e "DROP TABLE IF EXISTS $t;"
done

echo "All tables dropped from $DB_NAME." 