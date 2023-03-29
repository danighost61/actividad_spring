package com.prueba.demo.Servicios;

import java.util.ArrayList;

import com.prueba.demo.Entidad.personas;

public class servicios_personas {

    private ArrayList<personas> lista=new ArrayList<>();

    public servicios_personas(){
        lista.add(new personas(1070954243,"Juan","Andres",3,"juanandres02@gmail.com",10111111));
        lista.add(new personas(1071954343,"camilo","cubides",33,"Camilocubides02@gmail.com",312787343));
        lista.add(new personas(1070354343,"nicolas","Garzon",43,"nicolasgarzon02@gmail.com",312287343));
        lista.add(new personas(1070254343,"carlos","Damian",54,"carlosddamia02@gmail.com",311783443));
        lista.add(new personas(1070955343,"daniel","Funeme",54,"ghoastfuneme02@gmail.com",310787343));

    }


    // tamaño del arreglo
    public int cantidad(){
        return lista.size();

    }

    //mostrar lista
    public ArrayList<personas> mostrar(){
        return lista;
    }


    //sumar numeros cedula
    public Double totalprecios(){
    Double  suma= Double.valueOf(0);
    for (personas x: lista){
        suma+= x.getCedula();
    }
    return suma;
    }

    //agregar personas
    public String agregar(personas p){
        lista.add(p);
        return "Se registro correctamente";
    }

    //buscar personas
    public  personas buscarpornombre(String nombre){
        personas per=null;
        for (personas p:lista){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                per=p;
                break;
            }
        }
        return per;
    }

    public String actualizar(personas p){
        for (int i=0; i<lista.size(); i++){
            personas per = lista.get(i);
            if (per.getCedula() == p.getCedula()){
                lista.set(i, p);
                return "Se actualizó correctamente";
            }
        }
        return "No se encontró la persona a actualizar";
    }


    public String eliminar(double cedula) {
        for (int i = 0; i < lista.size(); i++) {
            personas per = lista.get(i);
            if (per.getCedula() == cedula) {
                lista.remove(i);
                return "Se eliminó correctamente";
            }
        }
        return "No se encontró la persona a eliminar";
    }





}
