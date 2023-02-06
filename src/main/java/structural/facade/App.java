package structural.facade;

import java.sql.Connection;

/**
 * Suppose we have an application with set of interfaces to use MySql/Oracle database and to generate different types of reports,
 * such as HTML report, PDF report etc.
 * So we will have different set of interfaces to work with different types of database.
 * Now a client application can use these interfaces to get the required database connection and generate reports.
 * But when the complexity increases or the interface behavior names are confusing, client application will find it difficult to manage it.
 * So we can apply Facade design pattern here and provide a wrapper interface on top of the existing interface to help client application.
 * **/
public class App {
    public static void main(String[] args) {
        String tableName="Employee";

        // without facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        // with facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
