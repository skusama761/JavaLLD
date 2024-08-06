package Singleton;

public class DataBaseConnection {
    private static DataBaseConnection instance = null;
    String dbUrl;
    String userName;
    String password;
    public static DataBaseConnection getInstance() {
        if (instance == null) {
            synchronized(DataBaseConnection.class){
                if (instance == null) {
                    instance = new DataBaseConnection();
                }

            }
        }
        return instance;
    }
    private DataBaseConnection() {}
}
