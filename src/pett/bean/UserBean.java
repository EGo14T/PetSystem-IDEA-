package pett.bean;

import java.util.ArrayList;
import java.util.List;

public class UserBean {

    public static String str = null; // 将StringBuffer转化成字符串
    public static StringBuffer sb = new StringBuffer(); // StringBuffer便于字符串的增删改查操作


    //登录验证
    public boolean valid(String username, String password) {
        boolean isValid = false;
        DBAcess db = new DBAcess();
        if (db.creatConn()) {
            String sql = "select * from user where userName='" + username + "' and password='" + password + "'";
            System.out.println("账号："+username);
            System.out.println("密码："+password);
            db.query(sql);
            if (db.next()) {
                isValid = true;
            }
            db.closeRs();
            db.closeStm();
            db.closeConn();
        }
        return isValid;
    }

}
