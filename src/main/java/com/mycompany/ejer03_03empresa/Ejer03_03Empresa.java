/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejer03_03empresa;

//import Vista.EmpresaVista;

import Vista.DepartamentoVentana;
import Vista.EmpleadoVentana;
import Vista.EmpresaVentana;


//import Vista.VistaEmpresa;
/**
 *
 * @author NOTEBOOK
 */
public class Ejer03_03Empresa {
    public static void main(String[] args) {
//        VentanaPrincipal mainWindow = new VentanaPrincipal();
//        mainWindow.setVisible(true);
          EmpresaVentana empresaVentana = new EmpresaVentana();
          empresaVentana.setVisible(true);
          DepartamentoVentana departamentoVentana = new DepartamentoVentana();
          departamentoVentana.setVisible(true);
          EmpleadoVentana empleadoVentana = new EmpleadoVentana();
          empleadoVentana.setVisible(true);
                  
    }
}
