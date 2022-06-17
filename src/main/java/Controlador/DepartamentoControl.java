/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
        
import java.util.List;
import Modelo.Departamento;
import Modelo.Empleado;
import Modelo.Empresa;
import Servicio.DepartamentoServicio;
import Servicio.EmpleadoServicio;
import Servicio.EmpresaServicio;

/**
 *
 * @author NOTEBOOK
 */
public class DepartamentoControl {
     private final DepartamentoServicio departamentoService = new DepartamentoServicio();
    public final EmpresaServicio empresaService = new EmpresaServicio();
    public final EmpleadoServicio empleadoService = new EmpleadoServicio();
            
    public Departamento crearDepartamento(int codigo, String nombre, Empresa empresa, String ubicacion){
        return departamentoService.crearDepartamento(new Departamento(codigo, nombre, empresa, ubicacion));
    }
    
    public List<Departamento> listarDepartamentos(){
        return departamentoService.listarDepartamentos();
    }
    
    public Departamento getDepartamentoByCode(int code){
        return departamentoService.getDepartamentoByCode(code);
    }
    
    public void asignarGerenteDepartamento(int codigo, Empleado empleado){
        departamentoService.asignarGerente(codigo, empleado);
        
    }
    
    public void actualizarDepartamento(int codigo, Departamento departamentoNew){
        departamentoService.actualizarDepartamenti(codigo, departamentoNew);
    }
    
    
    public Departamento eliminarDepartamento(int codigo){
        return departamentoService.eliminarDepartamento(codigo);
    }
    
    // Metodos privados validacion departamento:
    
    private boolean validarCodigo(int codigo){
        return codigo > 0;
    }
    
    private boolean validarNumMaximoCaracters(String texto){
        return texto.length() <= 200;
    }

   
     // Metodos validacion KeyEvent
    
    // valida que solo se ingresen numeros en el campo "codigo"
    public boolean validarSoloNumeros(char codigo){
        boolean flag = false;
        if(Character.isDigit(codigo)){
            flag = true;
        }
        return flag;
    }
    
    // valida que solo se ingrese texto en el campo ------
    public boolean validarSoloTexto(char texto){
        boolean flag = false;
        if(Character.isLetter(texto) || Character.isSpaceChar(texto) || Character.isUpperCase(texto)){
            flag = true;
        }
        return flag;
                
    }
}