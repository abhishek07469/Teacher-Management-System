package com.Teacher.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.Teacher.bean.Teacher;

public class ExportDAO {

    private Connection conn;

    public ExportDAO(Connection conn) {
        this.conn = conn;
    }

    // ✅ Add Teacher
    public boolean addTeacher(Teacher t) {
        boolean result = false;
        try {
            String sql = "INSERT INTO teacher(name, city, college, age, email, password, gender, bloodgroup, contact) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCity());
            ps.setString(3, t.getCollege());
            ps.setInt(4, t.getAge());
            ps.setString(5, t.getEmail());
            ps.setString(6, t.getPassword());
            ps.setString(7, t.getGender());
            ps.setString(8, t.getBloodgroup());
            ps.setString(9, t.getContact());

            int i = ps.executeUpdate();
            result = i == 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // ✅ Get ALL Teachers
    public List<Teacher> getAllTeachers() {
        List<Teacher> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM teacher";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Teacher t = new Teacher();

                t.setId(rs.getInt("id"));
                t.setName(rs.getString("name"));
                t.setCity(rs.getString("city"));
                t.setCollege(rs.getString("college"));
                t.setAge(rs.getInt("age"));
                t.setEmail(rs.getString("email"));
                t.setPassword(rs.getString("password"));
                t.setGender(rs.getString("gender"));
                t.setBloodgroup(rs.getString("bloodgroup"));
                t.setContact(rs.getString("contact"));

                list.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // ✅ Get Teacher by ID
    public Teacher getTeacherById(int id) {
        Teacher t = null;
        try {
            String sql = "SELECT * FROM teacher WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                t = new Teacher();

                t.setId(rs.getInt("id"));
                t.setName(rs.getString("name"));
                t.setCity(rs.getString("city"));
                t.setCollege(rs.getString("college"));
                t.setAge(rs.getInt("age"));
                t.setEmail(rs.getString("email"));
                t.setPassword(rs.getString("password"));
                t.setGender(rs.getString("gender"));
                t.setBloodgroup(rs.getString("bloodgroup"));
                t.setContact(rs.getString("contact"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    // ✅ UPDATE Teacher
    public boolean updateTeacher(Teacher t) {
        boolean result = false;
        try {
            String sql = "UPDATE teacher SET name=?, city=?, college=?, age=?, email=?, password=?, gender=?, bloodgroup=?, contact=? WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCity());
            ps.setString(3, t.getCollege());
            ps.setInt(4, t.getAge());
            ps.setString(5, t.getEmail());
            ps.setString(6, t.getPassword());
            ps.setString(7, t.getGender());
            ps.setString(8, t.getBloodgroup());
            ps.setString(9, t.getContact());
            ps.setInt(10, t.getId());

            int i = ps.executeUpdate();
            result = i == 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // ✅ DELETE Teacher
    public boolean deleteTeacher(int id) {
        boolean result = false;
        try {
            String sql = "DELETE FROM teacher WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int i = ps.executeUpdate();
            result = i == 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
