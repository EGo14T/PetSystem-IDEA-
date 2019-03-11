package pett.bean;
import java.sql.*;
import javax.swing.*;

public class MasterBean {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=gbk";
    private String username = "root";
    private String password = "admin";
    private Connection con;
    private Statement st;
    private ResultSet rs;


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

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Statement getStatment() {
        try {
            Class.forName(getDriver());
            con = DriverManager.getConnection(getUrl(), getUsername(), getPassword());
            return con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();

        }return null;
    }


    public boolean addmaster(String mrId,String mrName,String mrSex,String mrAge,String mrAddress,String mrTel,String mrPet){
        try{
            String sql = "insert into master"+"(id,name,sex,age,address,tel,pet)"+"Values ("+"'"+mrId+"'"+","+"'"+mrName+"'"+","+"'"+mrSex+"'"+","+"'"+mrAge+"'"+","+"'"+mrAddress+"'"+","+"'"+mrTel+"'"+","+"'"+mrPet+"'"+")";
            st = getStatment();
            int row = st.executeUpdate(sql);
            if (row==1){
                st.close();
                con.close();
                return true;
            }else{
                st.close();
                con.close();
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean adddocter(String mrId,String mrName,String mrSex,String mrAge,String mrAddress,String mrTel,String mrSkill){
        try{
            String sql = "insert into doctor"+"(id,name,sex,age,address,tel,skill)"+"Values ("+"'"+mrId+"'"+","+"'"+mrName+"'"+","+"'"+mrSex+"'"+","+"'"+mrAge+"'"+","+"'"+mrAddress+"'"+","+"'"+mrTel+"'"+","+"'"+mrSkill+"'"+")";
            st = getStatment();
            int row = st.executeUpdate(sql);
            if (row==1){
                st.close();
                con.close();
                return true;
            }else{
                st.close();
                con.close();
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean addpet(String petId,String petKind,String petSex,String petAge,String petAddress,String mrPetName,String mrPetTel){
        try{
            String sql = "insert into pet"+"(id,kind,sex,age,address,name,tel)"+"Values ("+"'"+petId+"'"+","+"'"+petKind+"'"+","+"'"+petSex+"'"+","+"'"+petAge+"'"+","+"'"+petAddress+"'"+","+"'"+mrPetName+"'"+","+"'"+mrPetTel+"'"+")";
            st = getStatment();
            int row = st.executeUpdate(sql);
            if (row==1){
                st.close();
                con.close();
                return true;
            }else{
                st.close();
                con.close();
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }




















    public boolean delmaster(String mrName){
        try{
            String sql = "delete from master where name = '"+mrName+"'";
            st = getStatment();
            int row = st.executeUpdate(sql);
            if (row==1){
                st.close();
                con.close();
                return true;
            }else{
                st.close();
                con.close();
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean deldoctor(String mrName){
        try{
            String sql = "delete from doctor where name = '"+mrName+"'";
            st = getStatment();
            int row = st.executeUpdate(sql);
            if (row==1){
                st.close();
                con.close();
                return true;
            }else{
                st.close();
                con.close();
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean delpet(String petId){
        try{
            String sql = "delete from pet where id = '"+petId+"'";
            st = getStatment();
            int row = st.executeUpdate(sql);
            if (row==1){
                st.close();
                con.close();
                return true;
            }else{
                st.close();
                con.close();
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }








    //查询要修改的宠物主人的信息
    public ResultSet selectUpdateMaster(String mrName){
        try{
            String sql = "select * from master where name = '"+mrName+"'";
            st = getStatment();
            return st.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectUpdateDoctor(String mrName){
        try{
            String sql = "select * from doctor where name = '"+mrName+"'";
            st = getStatment();
            return st.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selectUpdatePet(String petId){
        try{
            String sql = "select * from pet where id = '"+petId+"'";
            st = getStatment();
            return st.executeQuery(sql);
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }



    //修改宠物主人的信息
    public boolean updateMaster(String mrId,String mrName,String mrSex,String mrAge,String mrAddress,String mrTel,String mrPet){
        try{
            String sql = "update master set name = '"+mrName+"',sex = '"+mrSex+"',age = '"+mrAge+"',address = '"+mrAddress+"',tel = '"+mrTel+"',pet = '"+mrPet+"' where id = '"+mrId+"'";
            st = getStatment();
            st.executeUpdate(sql);
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatedoctor(String mrId,String mrName,String mrSex,String mrAge,String mrAddress,String mrTel,String mrSkill){
        try{
            String sql = "update doctor set name = '"+mrName+"',sex = '"+mrSex+"',age = '"+mrAge+"',address = '"+mrAddress+"',tel = '"+mrTel+"',skill = '"+mrSkill+"' where id = '"+mrId+"'";
            st = getStatment();
            st.executeUpdate(sql);
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatepet(String petId,String petKind,String petSex,String petAge,String petAddress,String mrPetName,String mrPetTel){
        try{
            String sql = "update pet set kind = '"+petKind+"',sex = '"+petSex+"',age = '"+petAge+"',address = '"+petAddress+"',name = '"+mrPetName+"',tel = '"+mrPetTel+"' where id = '"+petId+"'";
            st = getStatment();
            st.executeUpdate(sql);
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

}
