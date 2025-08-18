package Inatel.C14.Aula3.Maven;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rodando o projeto Maven!");

        Gson gson = new Gson();
        String json = gson.toJson("Hello GSON");
        System.out.println(json);
    }
}