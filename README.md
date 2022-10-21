# Factory Method

## Problemas e Situações
- Como posso escrever um código onde as classes instânciadas possam variar dentro de uma mesma interface?
- Como deixar meu código desacoplado das classes concretas?

## Solução
- Extrair a lógica de criação dos objetos para uma Factory Method.
 - **Factory Method é um padrão que define uma interface para criar um objeto, porém permite as CLASSES decidirem a instanciação para as subclasses. Ou seja, você tem uma interface,
  depois os objetos concretos que implementam essa interface e dentro de cada um desses objetos(factorys) você define o conjunto de métodos específicos que você deseja para depois implementar
  essas classes em subclasses de escolha.**

## Exemplo
- Uma Factory de Monstros.
- Cria uma interface de monstro(que pode ter métodos padrões).
- Depois cria classes que implementam essa interface, e cria 3 objetos de monstros O M1 que cospe fogo, o M2 que dispara Raio e o M3 que Cospe Fogo, dispara Raio e Sopra Gelo.
- Após isso podemos criar a Level 1 Factory, a Level 2 Factory a Level 3 Factory, cada uma delas tendo sua própria lógica de criação dos mostros.
