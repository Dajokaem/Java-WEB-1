/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.Control;
import java.util.List;

/**
 *
 * @author jos56
 */
public class CTUsuario {
    Control ct = new Control();
    
    public void crear(Usuario u){
        ct.crear(u);
    }
    public List<Usuario> traerUsuarios(){
        return ct.traerUsuarios();
    }
}
