package edu.ua.khpi.architectural.solutions.lab8;

public class PostgresSQLBuilder implements BuilderSQL{
    private StringBuilder query;
    public PostgresSQLBuilder() {
        this.query = new StringBuilder();
    }
    public BuilderSQL select(String columns) {
        this.query.append(" Select " + columns);
        return this;
    }
    public BuilderSQL whereSQL(String condition) {
        this.query.append(" Where " + condition);
        return this;
    }
    public BuilderSQL limit(int limit) {
        this.query.append(" Limit " + limit);
        return this;
    }
    public String getSQL() {
        return this.query.toString();
    }
}
