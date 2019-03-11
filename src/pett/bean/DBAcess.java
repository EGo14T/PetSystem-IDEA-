package pett.bean;

import java.sql.*;

public class DBAcess {
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=gbk";
    private String username = "root";
    private String password = "admin";
    private Connection conn;
    private Statement stm;
    private ResultSet rs;

    //创建连接

    public boolean creatConn() {
        boolean b = false;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            b = true;
            System.out.println("成功连接");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return b;
    }


    public boolean update(String sql) {
        boolean b = false;
        try {
            stm = conn.createStatement();
            stm.execute(sql);
            b = true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return b;
    }

    //查询
    public void query(String sql) {
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //判断有无数据
    public boolean next() {
        boolean b = false;
        try {
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return b;
    }

    //获取表字段值
    public String getValue(String field) {
        String value = null;
        try {
            if (rs != null) {
                value = rs.getString(field);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return value;
    }

    //关闭连接
    public void closeConn() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //关闭statement
    public void closeStm() {
        try {
            if (stm != null) {
                stm.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //关闭ResultSet
    public void closeRs() {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getDriver() {

        return driver;
    }

    public void setDriver(String driver) {

        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {

        this.stm = stm;
    }

    public ResultSet getRs() {

        return rs;
    }

    public void setRs(ResultSet rs) {

        this.rs = rs;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Connection getConn() {

        return conn;
    }
    
}


