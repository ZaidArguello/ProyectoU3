package mysql;

import java.sql.DriverManager;

/**
 *
 * @author 18PUERID0068
 */
public class Conexion {

    private String cnx = null;
    private final String servidor = "localhost";
    private static final String usuario = "root";
    private static final String pwd = "";
    private static final String base = "18progb0000";
    private String url;

    public Conexion obtener() throws SQLException, ClassNotFoundException {
        this.url = "jdbc:mysql://" + servidor + "/" + base + "";
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getCon(url, usuario, pwd);
            } catch (ClassNotFoundException ex) {
            }
        }
    }

    public void cerrar() throws SQLExcepction {
        if (cnx != null) {
            cnx.close();
        }
    }
}
