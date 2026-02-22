interface DBConnection {
    void connect();
}

class MySQLConnection implements DBConnection {
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}

//Oracle connection:
class OracleConnection implements DBConnection {
    public void connect() {
        System.out.println("Connected to Oracle Database");
    }
}
