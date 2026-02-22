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

class PostgreSQLConnection implements DBConnection {
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}

class DBConnectionFactory {

    public static DBConnection getConnection(String dbType) {

        if (dbType.equalsIgnoreCase("MYSQL"))
            return new MySQLConnection();

        else if (dbType.equalsIgnoreCase("ORACLE"))
            return new OracleConnection();

        else if (dbType.equalsIgnoreCase("POSTGRES"))
            return new PostgreSQLConnection();

        throw new IllegalArgumentException("Invalid DB Type");
    }
}

public class JdbcFactoryDemo {

    public static void main(String[] args) {

        String db = "MYSQL"; // comes from config file usually

        DBConnection connection =
                DBConnectionFactory.getConnection(db);

        connection.connect();
    }
}

