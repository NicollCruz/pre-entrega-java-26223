package com.techlab.articulo;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.articulo.model.Articulo;
import com.techlab.articulo.model.ArticuloAlimenticio;
import com.techlab.articulo.model.ArticuloElectronico;
import com.techlab.articulo.model.Categoria;


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Articulo> articulos = new ArrayList<>();

        ArrayList<Categoria> categorias = new ArrayList<>();
        
        precargarCategorias(categorias);

    }

    public static void precargarCategorias(ArrayList<Categoria> categorias) {
        categorias.add(new Categoria(1, "Electrónica", "Productos tecnológicos y electrónicos"));
        categorias.add(new Categoria(2, "Periféricos", "Accesorios para computadora"));
        categorias.add(new Categoria(3, "Alimentos", "Productos alimenticios"));
        categorias.add(new Categoria(4, "Limpieza", "Artículos de limpieza del hogar"));
    }


}
