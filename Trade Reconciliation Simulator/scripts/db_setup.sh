#!/bin/bash
# db_setup.sh - Set up Trade Reconciliation Simulator database schema

DB_USER="root"
DB_PASS="password"
DB_NAME="trade_recon"

mysql -u $DB_USER -p$DB_PASS -e "CREATE DATABASE IF NOT EXISTS $DB_NAME;"
mysql -u $DB_USER -p$DB_PASS $DB_NAME < $(dirname "$0")/../sql/schema.sql

echo "Database schema created in $DB_NAME." 