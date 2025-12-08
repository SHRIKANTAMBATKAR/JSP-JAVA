package dao;

import java.sql.*;
import java.util.*;
import Model.Employee;
import shrikant.DBUtil;

public class EmployeeDAO {

    public boolean saveEmployee(Employee emp) {
        boolean result = false;
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employee(name, deg, age, salary) VALUES (?, ?, ?, ?)"
            );

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDeg());
            ps.setInt(3, emp.getAge());
            ps.setInt(4, emp.getSalary());

            result = ps.executeUpdate() > 0;
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setDeg(rs.getString("deg"));
                e.setAge(rs.getInt("age"));
                e.setSalary(rs.getInt("salary"));

                list.add(e);
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Employee getEmployeeById(int id) {
        Employee e = null;
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE id=?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setDeg(rs.getString("deg"));
                e.setAge(rs.getInt("age"));
                e.setSalary(rs.getInt("salary"));
            }

            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return e;
    }

    public boolean updateEmployee(Employee emp) {
        boolean result = false;

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE employee SET name=?, deg=?, age=?, salary=? WHERE id=?"
            );

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDeg());
            ps.setInt(3, emp.getAge());
            ps.setInt(4, emp.getSalary());
            ps.setInt(5, emp.getId());

            result = ps.executeUpdate() > 0;
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // Delete employee
    public boolean deleteEmployee(int id) {
        boolean result = false;

        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE id=?");
            ps.setInt(1, id);
            result = ps.executeUpdate() > 0;

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}




