package com.example.meuapp;

import java.util.ArrayList;

public class PlanetaDAO {
    ArrayList<Planeta> listaPlanetas;
    public PlanetaDAO() {
        listaPlanetas = new ArrayList<>();
        listaPlanetas.add(new Planeta("Mercurio", R.drawable.mercury, 3.3));
        listaPlanetas.add(new Planeta("Venus", R.drawable.venus, 48.7));
        listaPlanetas.add(new Planeta("Terra", R.drawable.earth, 59.7));
        listaPlanetas.add(new Planeta("Marte", R.drawable.mars, 6.42));
        listaPlanetas.add(new Planeta("Jupiter", R.drawable.jupter, 18900));
        listaPlanetas.add(new Planeta("Saturno", R.drawable.saturn, 5680));
        listaPlanetas.add(new Planeta("Urano", R.drawable.uranus, 868));
        listaPlanetas.add(new Planeta("Neptune", R.drawable.neptune, 1020));
    }

    public ArrayList<Planeta> listaPlanetas(){
        return listaPlanetas;
    };

    public static class PlanetaController {
        PlanetaDAO planetaDAO;
        public PlanetaController(){
            planetaDAO=new PlanetaDAO();
        }
        public ArrayList<Planeta> listaPlanetas() {

            return planetaDAO.listaPlanetas();
        }

    }
}
