package br.com.carstore.servlet;

import br.com.carstore.dao.CarDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-car")
public class DeleteCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String carId = req.getParameter("id");

        CarDAO carDAO = new CarDAO();

        carDAO.deleteCarById(carId);

        resp.sendRedirect("/find-all-cars");

    }

}