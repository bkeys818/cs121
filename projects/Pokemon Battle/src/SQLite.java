import java.sql.*;
import java.util.function.Function;


public class SQLite {
    private String url;
    public SQLite(String url) {
        this.url = "jdbc:sqlite:" + url;
    }

    public ResultSet query(String statement) {
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            return stmt.executeQuery(statement);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public ResultSet query(String statement, Function<PreparedStatement,Void> assignParams) {
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(statement)) {
            assignParams.apply(pstmt);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
