#!/bin/bash
# ingest_trades.sh - Copy trade files to input directory

INPUT_DIR="$(dirname \"$0\")/../input"
mkdir -p "$INPUT_DIR"

for file in "$@"; do
  cp "$file" "$INPUT_DIR/"
done

echo "Trade files copied to $INPUT_DIR." 