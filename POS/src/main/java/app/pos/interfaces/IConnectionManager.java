/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.interfaces;

import app.pos.db.Parametro;
import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public interface IConnectionManager {
    boolean Connect();
    void Disconnect();
    <T> T ExecuteCommand(String command, ArrayList<Parametro<?>> parametros);
}
