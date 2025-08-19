# C14-ProjetoSalaDeAula

Projeto Maven - Exemplo com Gson
Este é um projeto Java simples que utiliza Maven para gerenciamento de dependências e a biblioteca Gson para serialização e desserialização de objetos em JSON.

🚀 Tecnologias utilizadas
Java 21 ou superior
Maven (para build e dependências)
Gson (para manipulação de JSON)

📦 Instalação
1. Clonar o repositório
   
    git clone https://github.com/seu-usuario/ProjetoMaven.git
    cd ProjetoMaven
   
2. Verificar instalação do Maven
Confirme se o Maven está instalado corretamente:

   mvn -v
   
3. Compilar o projeto

   mvn clean install

4. Executar o projeto

   mvn exec:java -Dexec.mainClass="Main"

📚 Dependências
O projeto utiliza a biblioteca Gson

    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.13.0</version>
    </dependency>

   ## 📝 Simulação e Resolução de Conflitos

# Cenário de Conflito Simulado
Criamos intencionalmente um conflito de merge onde ambos os desenvolvedores alteraram a mesma linha de código:

**Conflito:**
```python
   <<<<<<< tobs-branch
   String json = gson.toJson("Hello im goKu!");
   =======
   String json = gson.toJson("Exemplo de GSON em uso");
   >>>>>>> main

# Resolvemos o conflito
   String json = gson.toJson("Usando GSON");
