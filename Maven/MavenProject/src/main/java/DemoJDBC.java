import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {

        /*
        import package
        load and register driver
        create connection
        create statement
        execute statement
        process the result
        close
         */
        System.out.println("Connection established");
        /* Read Data from DB */
//        String url = "jdbc:postgresql://localhost:5432/Demo";
//        String uname = "postgres";
//        String pass = "8@3MitoarnTledd";
//        String query = "Select * from student";
//
//
//        //Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(query);
////        rs.next();
////        System.out.println(rs.getString("sname"));
//        //System.out.println(rs.next());
////        while(rs.next()){
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2)+ " - ");
//            System.out.print(rs.getInt(3));
//            System.out.println();
//        }

//         /* Create/Insert data into DB*/
        int sid = 102;
        String sname = "Jasmine";
        int smarks = 45;

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "8@3MitoarnTledd";
       // String query = "insert into student values(4, 'John', 30)";
        // Values coming from user:
       //String query = "insert into student values(" + sid + ",'" + sname + "'," + smarks + ")";
        String query = "insert into student values(?,?,?)";

        Connection con = DriverManager.getConnection(url,uname,pass);
       // Statement st = con.createStatement();
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,smarks);
        st.execute();

//        /* Update data into DB*/
//        String url = "jdbc:postgresql://localhost:5432/Demo";
//        String uname = "postgres";
//        String pass = "8@3MitoarnTledd";
//        String query = "update student set sname = 'Harsh' where sid = 4";
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//        st.execute(query);

        /* Delete data into DB*/
//        String url = "jdbc:postgresql://localhost:5432/Demo";
//        String uname = "postgres";
//        String pass = "8@3MitoarnTledd";
//        String query = "delete from student where sid = 4";
//
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        Statement st = con.createStatement();
//        st.execute(query);


        con.close();
        System.out.println("Connection closed");



    }
}