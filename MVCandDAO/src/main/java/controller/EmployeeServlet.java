package controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

import dao.EmployeeDAO;
import Model.Employee;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");
        EmployeeDAO dao = new EmployeeDAO();

        if (action == null || action.equals("view")) {
            List<Employee> list = dao.getAllEmployees();
            req.setAttribute("employees", list);
            req.getRequestDispatcher("view.jsp").forward(req, resp);
        }

        else if (action.equals("edit")) {
            int id = Integer.parseInt(req.getParameter("id"));
            Employee emp = dao.getEmployeeById(id);

            req.setAttribute("emp", emp);
            req.getRequestDispatcher("edit.jsp").forward(req, resp);
        }

        else if (action.equals("delete")) {
            int id = Integer.parseInt(req.getParameter("id"));
            dao.deleteEmployee(id);
            resp.sendRedirect("employee?action=view");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");
        EmployeeDAO dao = new EmployeeDAO();

        if (action.equals("add")) {
            String name = req.getParameter("name");
            String deg = req.getParameter("deg");
            int age = Integer.parseInt(req.getParameter("age"));
            int salary = Integer.parseInt(req.getParameter("salary"));

            Employee emp = new Employee(name, deg, age, salary);
            dao.saveEmployee(emp);

            resp.sendRedirect("employee?action=view");
        }

        else if (action.equals("update")) {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            String deg = req.getParameter("deg");
            int age = Integer.parseInt(req.getParameter("age"));
            int salary = Integer.parseInt(req.getParameter("salary"));

            Employee emp = new Employee(name, deg, age, salary);
            emp.setId(id);

            dao.updateEmployee(emp);

            resp.sendRedirect("employee?action=view");
        }
    }
}
