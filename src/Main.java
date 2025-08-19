import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rodando o projeto Maven!");

        Gson gson = new Gson();
        String json = gson.toJson("Exemplo de GSON em uso");
        System.out.println(json);
    }
}