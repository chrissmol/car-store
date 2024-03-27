package br.com.carstore.dao;

import br.com.carstore.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDAO {
    public void createCar(Car car){
        try{

            String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            PreparedStatement preparedStatement =  connection.prepareStatement(SQL);

            preparedStatement.setString(1, car.getName());

            preparedStatement.execute();
            System.out.println("Sucesso ao gravar o nome do carro no banco de dados");

        } catch (Exception e){
            System.out.println("Erro ao gravar o modelo do carro no banco de dados");
        }
    }
}

