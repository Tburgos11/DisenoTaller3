/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.disenotaller3;

/**
 *
 * @author CMONTES
 */
public class SoporteTecnico extends Usuario{

    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }
    
    public void brindarAsistencia(Usuario u){
        System.out.println("Brindar asistencia");        
    }
    
    public void resolverproblemaTecnico(Usuario u){
        System.out.println("Resolviendo problema");
    }
    
    public void derviarProblemaDeGestion(Administrador a){
        System.out.println("Derivando problema");
    }
            
}
