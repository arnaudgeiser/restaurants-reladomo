package ch.hearc.ig.guideresto.persistence.reladomo;

import com.gs.fw.common.mithra.bulkloader.BulkLoader;
import com.gs.fw.common.mithra.bulkloader.BulkLoaderException;
import com.gs.fw.common.mithra.connectionmanager.SourcelessConnectionManager;
import com.gs.fw.common.mithra.databasetype.DatabaseType;
import com.gs.fw.common.mithra.databasetype.OracleDatabaseType;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.TimeZone;
import javax.sql.DataSource;

public class ReladomoConnectionManager implements SourcelessConnectionManager {

  private final DataSource dataSource;
  private static final ReladomoConnectionManager instance;

  static {
    try {
      instance = new ReladomoConnectionManager();
    } catch (PropertyVetoException e) {
      throw new RuntimeException(e);
    }
  }

  public ReladomoConnectionManager() throws PropertyVetoException {
    ComboPooledDataSource cpds = new ComboPooledDataSource();
    cpds.setDriverClass("oracle.jdbc.OracleDriver");
    cpds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
    cpds.setUser("system");
    cpds.setPassword("oracle");
    dataSource = cpds;
  }

  @Override
  public BulkLoader createBulkLoader() throws BulkLoaderException {
    return null;
  }

  @Override
  public Connection getConnection() {
    try {
      return dataSource.getConnection();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public DatabaseType getDatabaseType() {
    return OracleDatabaseType.getInstance();
  }

  @Override
  public TimeZone getDatabaseTimeZone() {
    return TimeZone.getDefault();
  }

  @Override
  public String getDatabaseIdentifier() {
    return "Oracle Docker Image";
  }

  public static synchronized ReladomoConnectionManager getInstance() {
    return instance;
  }
}
