package ar.edu.unlp.info.oo2.ejercicio1_JavaLogging;

public class Prueba {
  public static void main(String[] args) {
    DatabaseRealAccess database = new DatabaseRealAccess();
    String password = "p455w0rD";
    DatabaseRealAccessProxy proxy = null;
    try {
      proxy = new DatabaseRealAccessProxy(database, password);
    } catch (Exception e) {
      // TODO: handle exception
    }
    proxy.getSearchResults("select * from comics where id=1");
    proxy.login(password);
    proxy.insertNewRow(null);
  }
}
