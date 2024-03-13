package com.xmoney.db;

import java.io.Serial;

public class DbException extends RuntimeException {
    public DbException(String message) {
        super(message);
    }
}
