package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class databaseConnection {

    public String host = "localhost";
    public int port = 3306;
    public String dbIsmi = "eticaret";
    public String kullaniciAdi = "root";
    public String parola = ""; // 
    public String databaseType = "com.mysql.cj.jdbc.Driver";
    public String url = "jdbc:mysql://" + host + ":" + port + "/" + dbIsmi;
    public PreparedStatement ps = null;
    public Connection con = null;

    public void connect() {
        try {
            // MySQL JDBC Driver'ını yükle
            Class.forName(databaseType);

            // Bağlantıyı oluştur
            con = DriverManager.getConnection(url, kullaniciAdi, parola);

            // Bağlantı durumunu kontrol et
            if (con != null && !con.isClosed()) {
                System.out.println("Veritabanına başarıyla bağlanıldı!");
            } else {
                System.out.println("Veritabanına bağlanılamadı!");
            }
        } catch (SQLException e) {
            System.out.println("SQL Hatası: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver bulunamadı: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        databaseConnection dbConnection = new databaseConnection();
        dbConnection.connect();
    }
}

