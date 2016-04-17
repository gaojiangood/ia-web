package ia.core;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.seasar.doma.jdbc.DomaAbstractConfig;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.H2Dialect;
import org.seasar.doma.jdbc.dialect.MssqlDialect;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionalDataSource;

public class AppConfig extends DomaAbstractConfig {

	@Resource(name="testdb")
    private DataSource dataSource;

    protected static final Dialect dialect = new MssqlDialect();

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }
    

    @Override
    public Dialect getDialect() {
        return dialect;
    }

//    protected static LocalTransactionalDataSource createDataSource() {
//    	
//  	Context ctx;
//    	  DataSource ds= null;
//    	  try{
//    	   ctx = new InitialContext();
//    	   ds = (DataSource)ctx.lookup("java:comp/env/jdbc/_testdb");
//    	   if(ds==null){
//    	   System.err.println();
//    	   return null;
//    	   }
//    	   return new LocalTransactionalDataSource(ds);
//    	   
//    	  }catch (NamingException e) {
//  			// TODO Auto-generated catch block
//  			e.printStackTrace();
//  		}
//        /*SimpleDataSource dataSource = new SimpleDataSource();
//        try {
//			Class.forName("org.hsqldb.jdbc.JDBCDriver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        dataSource.setUrl("jdbc:hsqldb:hsql://localhost/proddb");
//        dataSource.setUser("prod");
//        dataSource.setPassword("prod");
//        return new LocalTransactionalDataSource(dataSource);
//*/ 
//    	  return new LocalTransactionalDataSource(ds);
//    	  }
//
//    public static LocalTransaction getLocalTransaction() {
//        return dataSource.getLocalTransaction(defaultJdbcLogger);
//    }

}