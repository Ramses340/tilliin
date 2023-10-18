/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.main;

import mx.itson.entitis.Publicaciones;
import mx.itson.entitis.Usuario;

/**
 *
 * @author ramse
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Usuario user = new Usuario();
        
        user.setName("Gustavo");
        user.setPassword("gatitos12345");
        user.setEmail("gustavito13@hotmail.com");
        user.setDataDay(17);
        user.setDataMonth(10);
        user.setDataYears(2023);
        user.setType("Estandar");
        
        Usuario user1 = new Usuario();
        
        user1.setName("Pepe");
        user1.setPassword("pepe2004");
        user1.setEmail("pepitogamer@hotmail.com");
        user1.setDataDay(22);
        user1.setDataMonth(12);
        user1.setDataYears(20010);
        user1.setType("Moderador");
        
        Usuario user2 = new Usuario();
        
        user2.setName("james");
        user2.setPassword("hatsunemiku");
        user2.setEmail("jamememes@hotmail.com");
        user2.setDataDay(10);
        user2.setDataMonth(12);
        user2.setDataYears(2004);
        user2.setType("Estandar");
        
        Publicaciones publication = new Publicaciones ();
        
        publication.setType("Gatitos");
        publication.setTitle("Gatito hace backflip");
        publication.setComments("OMG QUE REAL");
        publication.setCalcification("Extremadamente postivio");
        publication.setDate("18/10/2023");
        
        System.out.println(user.getName()+" Publico");
        System.out.println(publication.getTitle());
        System.out.println("Fecha: "+publication.getDate());
        System.out.println("#"+publication.getType());
        System.out.println("Calificacion "+publication.getCalcification());
        System.out.println("--------------------------------------");
        System.out.println("Responde "+user2.getName()+": "+publication.getComments());
        System.out.println("Calificacion del comentario "+publication.getCalcification());
        System.out.println("--------------------------------------");
        System.out.println("Monitoriado por "+user1.getName()+" que es "+user1.getType());
        
        System.out.println("Info del usuario que publico el post");
        System.out.println("Nombre"+user.getName());
        System.out.println("Paswoord "+user.getPassword());
        System.out.println("Email "+user.getEmail());
        System.out.println("Fecha de registro "+"Dia "+user.getDataDay()+" Mess "+user.getDataMonth()+" Year "+user.getDataYears());
        System.out.println("Tipo de usuario "+user.getType());
    }
    
}
