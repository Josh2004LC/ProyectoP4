/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.db;

import app.pos.interfaces.IConnectionManager;
import oracle.jdbc.driver.OracleConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Josh
 */
public class ConnectionManager implements IConnectionManager {
    private Connection connection;

    public ConnectionManager() {
        this.connection = null;
    }

    @Override
    public boolean Connect() {
        try {
            this.connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "P4Proyec", "Dev2024");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void Disconnect() {
        try {
            if (!this.connection.isClosed()) {
                this.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T ExecuteCommand(String command, ArrayList<Parametro<?>> parametros) {
        try {
            // Convertir la conexión del JDBC a tipo Oracle.
            OracleConnection oracleConnection = (OracleConnection) this.connection;
            // Crear el procedimiento para parametrizar las configurations.
            CallableStatement obProcedimiento = oracleConnection.prepareCall(command);

            // Generar los parámetros.
            for (Parametro<?> parametro : parametros) {
                if (!parametro.isRespuesta()) {
                    if (parametro.getTipoSQL() == Types.ARRAY) {
                        obProcedimiento.setArray(
                                parametros.indexOf(parametro) + 1,
                                oracleConnection.createOracleArray(parametro.getNombreTipo(), parametro.getValue())
                        );
                    } else {
                        obProcedimiento.setObject(parametros.indexOf(parametro) + 1, parametro.getValue(), parametro.getTipoSQL());
                    }
                } else {
                    obProcedimiento.registerOutParameter(parametros.indexOf(parametro) + 1, parametro.getTipoSQL());
                }
            }

            // Ejecutar el procedimiento.
            obProcedimiento.executeUpdate();
            // Extraer la respuesta.
            Parametro<?> respuesta = parametros.stream().filter(Parametro::isRespuesta).findAny().orElse(null);
            assert respuesta != null;
            return (T) obProcedimiento.getObject(parametros.size());
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
