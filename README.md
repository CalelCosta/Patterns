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

## Vantagens

- Quem usar as fábricas de monstros não terá acesso as classes concretas, o que ajuda no desacoplamento.
- Remove a dependência da aplicação, pois quem utiliza as fábricas também pode definir seu conjunto de lógica.

## Tipos de Factorys
As factorys podem ter variações em seus usos, aumentando ou diminuindo a complexidade.

- 1° Podemos criar uma factory para cada objeto concreto, Ex: M1Factory, M2Factory...Isso aumenta a complexidade pois quem utilizar essa classe vai ter conhecimento de cada factory q utilizar e da Interface padrão e não é a mais usual no dia dia.
- 2° **Simple Factory**. Ao invés de criarmos uma interface da Factory, criamos uma única classe que encapsula toda a complexidade de criacção dos Monstros por exemplo. Nessa classe criamos um orderMonster e as características dos monstros é passada via parâmetro, oque diminui bastante a complexidade. O utilizador depende apenas da classe abstrata/interface de Monstro e da MonsterSimpleFactory.
- 3° **Half Simple**. Podemos criar uma fábrica para cada grupo de Mostros e voltamos com a Interface de Monstros nesse caso que será implementada pelo utilizador. Nessa forma criamos uma fabrica para MFire, MCold...E cada uma dessas fábricas fica responsável por seus objetos concretos, como MCold1 e MColdBoss e assim por diante.
