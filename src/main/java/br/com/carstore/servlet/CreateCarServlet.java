package br.com.carstore.servlet;

import br.com.carstore.model.Car;
import br.com.carstore.dao.CarDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String carName = request.getParameter("carName");

        Car car = new Car();

        car.setName(carName);

        CarDAO carDao = new CarDAO();

        carDao.createCar(car);



        request.getRequestDispatcher("index.html").forward(request, resp);

    }

}

