/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacteos;

/**
 *
 * @author anton
 */
public class Producto {

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    private String tipo;
    private String cantidadLeche;
    private int peso;
    
    //Constructor por defecto
    public void Queso(){
        
    }
    /**
     * Constructor con parametros
     * @param tipoLeche
     * @param cantidadLeche
     * @param peso 
     */
    public void Queso(String tipoLeche, String cantidadLeche, int peso){
        this.setTipo(tipoLeche);
        this.setCantidadLeche(cantidadLeche);
        this.setPeso(peso);
        
    }
    /**
     * 
     * @return Devuelve el tipo de leche,
     * la cantidad de leche y el peso
     */
    
    //Metodos getter y setter de los atributos de la clase
    
    public String getTipoLeche(){
    return getTipo();
    }
    
    
    public void setTipoLeche(String tipoLeche){
        this.setTipo(tipoLeche);
    }
    
    public  String getCantidadLeche(){
        return cantidadLeche;
    }
    
    public void setCantidadLeche(String cantidadLeche){
        this.cantidadLeche = cantidadLeche;
    }
        
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    /**
     * Metodo imprimir, que imprime los datos por pantalla
     */
    public void imprimir_cabecera(){
        System.out.println("Tienda de quesos Chipen");
        System.out.println("Para coger cualquier producto, mire la etiqueta.");
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Tipo de leche: " + this.getTipo());
        System.out.println("Cantidad de leche: " + this.getCantidadLeche());
    }//Cierre del metodo

    public String imprimir_detalle(){
        return "Peso: " + this.getPeso() + "Tipo de leche: " + this.getTipo() + "Cantidad de Leche: ";
    }
    
    
    } //Cierre de la clase

    
    
    

