
package Persistencia;

import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Control {
    UsuarioJpaController usu = new UsuarioJpaController();

    public void crear (Usuario u){
        usu.create(u);
    }


    public List<Usuario> traerUsuarios (){
        return usu.findUsuarioEntities();
    }
    public void borrar(int i){
        try {
            usu.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Usuario traeruno(int a){
        return usu.findUsuario(a);
    }
    public void editar(Usuario b){
        try {
            usu.edit(b);
        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
