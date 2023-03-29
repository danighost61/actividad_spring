package com.prueba.demo.controlador;

import com.prueba.demo.Entidad.personas;
import com.prueba.demo.Servicios.servicios_personas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)

@RestController
public class controladorpersonas {

    servicios_personas servicio=new servicios_personas();


    @RequestMapping("/Entrada")/*Ruta de la pagina web*/
    public String mundo(){
        return "Holaaaaaa";
        }

    @GetMapping("/cantidad")
    public String  cantidad(){
            return "la cantidad de productos es:"+ servicio.cantidad();
        }

        @GetMapping("/lista")
        public ArrayList<personas> listaproductos(){
        return  servicio.mostrar();
        }

        @GetMapping("/precio")
        public String totalprecios(){
        return " La suma de todos los productos es: "+servicio.totalprecios();
        }

        @PostMapping("/AgregarPersona")
        public String agregar(@RequestBody personas p){
        return servicio.agregar(p);
        }

        @GetMapping("/buscarpornombre/{dato}")
        public personas buscar(@PathVariable("dato") String nombre){return servicio.buscarpornombre(nombre);}

        @PostMapping("/actualizarPersona")
        public String actualizar(@RequestBody personas p) {return servicio.actualizar(p);


        }



}

