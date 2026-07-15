/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristianluis.controller;

import com.cristianluis.model.Rol;
import com.cristianluis.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class AuthSistema {
    private static ArrayList <Usuario> ListaUsuarios = new ArrayList<>();

    public AuthSistema(){
        Usuario usuarioAdmin = new Usuario("admi",
                                                    "admin", "adimin", Rol.ADMIN);
        Usuario usuarioUser = new Usuario("user",
                                                    "admin", "adimin", Rol.USER);
        Usuario usuarioYo = new Usuario("Cristian",
                                                    "123", "Crisitian Luis", Rol.ADMIN);
        
        ListaUsuarios.add(usuarioAdmin);
        ListaUsuarios.add(usuarioUser);
        ListaUsuarios.add( usuarioYo);
    }
    
    public Usuario login (String nombreUsuario, String clave){
        
        for(Usuario usuarioBuscado : ListaUsuarios ){
            
            if( usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                    && usuarioBuscado.getPassword().equals(clave))
                return usuarioBuscado;
        }
        return null;
    }
    
    
    public static ArrayList<Usuario> getListaUsuarios() {
        return ListaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> ListaUsuarios) {
        AuthSistema.ListaUsuarios = ListaUsuarios;
    }
    
}
