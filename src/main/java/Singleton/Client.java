package Singleton;
public class Client {
    public static void main(String[] args) {
        DataBaseConnection db = DataBaseConnection.getInstance();
        DataBaseConnection db2 = DataBaseConnection.getInstance();

        System.out.println(db);
        System.out.println(db2);

    }
}
