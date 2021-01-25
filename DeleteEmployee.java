package sevrlet;

import service.EmployeeService;
import service.EmployeeServicee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 孙宇
 * @Description
 * @date 2020/11/10 19:30
 */
public class DeleteEmployee  extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServicee();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        String id = req.getParameter("id");
        employeeService.deleteEmployeeService(Integer.parseInt(id));
        resp.sendRedirect("/all_employee");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
