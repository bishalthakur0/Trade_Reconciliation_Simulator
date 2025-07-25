#!/bin/bash
# log_rotate.sh - Rotate and archive logs

LOG_DIR="$(dirname \"$0\")/../logs"
ARCHIVE_DIR="$LOG_DIR/archive"
mkdir -p "$ARCHIVE_DIR"

timestamp=$(date +"%Y%m%d_%H%M%S")
for log in "$LOG_DIR"/*.log; do
  [ -e "$log" ] || continue
  mv "$log" "$ARCHIVE_DIR/$(basename "$log" .log)_$timestamp.log"
done

echo "Logs rotated and archived to $ARCHIVE_DIR." 