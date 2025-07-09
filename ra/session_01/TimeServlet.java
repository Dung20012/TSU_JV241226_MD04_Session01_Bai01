package ra.session_01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "TimeServlet", value = "/time")
    public class TimeServlet extends HttpServlet{
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // thiết lập content type
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            // lấy thời gian hiện tại
            LocalDateTime now = LocalDateTime.now();
            String currentTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            // output
            out.println("<html><body>");
            out.println("<h1>Thời gian hiện tại:</h1>");
            out.println("<p>" + currentTime + "</p>");
        }
    }
