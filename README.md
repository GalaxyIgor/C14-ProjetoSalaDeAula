# Projeto Maven - Exemplo com Gson

## Descrição do Projeto

Este projeto demonstra uma aplicação simples em Java usando Maven para gerenciamento de dependências, compilação e execução. O foco é a utilização da biblioteca **Gson** para conversão de objetos Java em JSON. O projeto contém uma classe `Main` que imprime mensagens no console e converte uma string simples para JSON usando Gson.

---

## Estrutura do Projeto

- `src/main/java/Main.java` - Classe principal com o exemplo de uso do Gson.
- `pom.xml` - Arquivo de configuração do Maven definindo dependências e configuração do build.

---

## Requisitos

- Java JDK 24 (ou superior)
- Maven instalado e configurado no PATH do sistema

---

## Instruções para Configuração e Instalação

1. **Clone ou copie o projeto para sua máquina:**

   git clone <url-do-repositorio>
   cd ProjetoMaven


2. **Verifique se o Java está instalado:**

   java -version

Deve retornar informações sobre a versão 24 do JDK.

3. **Verifique se o Maven está instalado:**

   mvn -v
   

Deve retornar a versão do Maven e a versão do Java configuradas.

---

## Instalação das Dependências e Build

Para baixar as dependências definidas no `pom.xml` e compilar o projeto, execute:

   mvn clean install


Este comando irá:

- Limpar qualquer build anterior (`clean`)
- Baixar bibliotecas necessárias (ex: Gson)
- Compilar o código-fonte
- Gerar os arquivos compilados no diretório `target`

---

## Execução do Projeto

Após compilar, você pode rodar a aplicação com:

   mvn exec:java -Dexec.mainClass="Main"
   

Alternativamente, execute diretamente o `.class` compilado:

   java -cp target/classes:~/.m2/repository/com/google/code/gson/gson/2.13.0/gson-2.13.0.jar Main


(Substitua o caminho do JAR do Gson conforme seu repositório local do Maven.)

---

## Exemplo de Saída Esperada

   Rodando o projeto Maven!
   "Usando GSON"


---


   
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
