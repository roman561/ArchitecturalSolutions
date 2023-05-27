package edu.ua.khpi.architectural.solutions.lab8;

public class Main {
    public static void main(String[] args) {
        BuilderSQL mySQLBuilder = new MySQLBuilder();
        mySQLBuilder.select(" Name, Age ").whereSQL("age>30").limit(20);
        System.out.println(" Result query : " + mySQLBuilder.getSQL());

        BuilderSQL pgSQLBuilder = new PostgresSQLBuilder();
        pgSQLBuilder.select(" Name, Age ").whereSQL("age>50").limit(50);
        System.out.println(" Result query : " + pgSQLBuilder.getSQL());

    }
}
