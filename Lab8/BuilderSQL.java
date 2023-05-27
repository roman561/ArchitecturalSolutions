package edu.ua.khpi.architectural.solutions.lab8;

public interface BuilderSQL {
    BuilderSQL select(String columns);
    BuilderSQL whereSQL(String condition);
    BuilderSQL limit(int limit);
    String getSQL();
}
