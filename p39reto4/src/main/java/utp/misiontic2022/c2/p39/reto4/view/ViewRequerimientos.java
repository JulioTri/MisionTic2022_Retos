package utp.misiontic2022.c2.p39.reto4.view;

import java.util.ArrayList;

import utp.misiontic2022.c2.p39.reto4.controller.ControllerRequerimientos;

import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_3;


public class ViewRequerimientos {

    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();

    public static void requerimiento1(){
        try {

            ArrayList<Requerimiento_1> listaRequemiento1;
            listaRequemiento1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 req1 : listaRequemiento1) {
                System.out.println(
                    req1.getFechaCompra() + " " + 
                    req1.getCodigoCompra() + " " + 
                    req1.getNombreProveedor() + " " +
                    req1.getValorPagado() 
                );
            }


        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> listaRequerimiento2;
            listaRequerimiento2 = controlador.consultarRequerimiento2();
            for (Requerimiento_2 req2 : listaRequerimiento2) {
                System.out.println(
                    req2.getFechaInicio() + " " + 
                    req2.getNombreCiudad() + " " +
                    req2.getNombreConstructora() + " " + 
                    req2.getNombreLider() + " " +
                    req2.getCodigoTipo() + " " +
                    req2.getEstrato() 
                );
            } 
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> listaRequerimiento3;
            listaRequerimiento3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 req3 : listaRequerimiento3) {
                System.out.println(
                    req3.getNombreAbreviado()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

