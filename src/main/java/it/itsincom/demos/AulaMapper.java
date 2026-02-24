package it.itsincom.demos;

import org.codejargon.fluentjdbc.api.query.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AulaMapper implements Mapper<Aula> {
    @Override
    public Aula map(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        return new Aula(id);
    }
}
