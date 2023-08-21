# Engenharia de Software 11/8

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.


- Engenharia de Software se divide em três pilares: tempo, escala e o conflito de escolha.
- No que tange a parte do tempo na criação de um software, por conta do software ser intangível, é possível o seu desmembramento, o que leva principalmente a adequação dos softwares mediante as demandas dos clientes.
- Escalabilidade diz respeito a forma de escalar o produto, tendo em vista a distribuição para muitas pessoas, sem haver conflito, sendo acessado por diversas pessoas do mundo inteiro, como por exemplo aplicativos de        
  mensagens. A engenharia de software busca desenvolver produtos escaláveis, pois assim atinge mais pessoas o que torna o app mais lucrativo e impactante na sociedade.
- Por fim, o "trade-Off" se refere a capacidade de ganhar em algo e perder em outro, uma aplicação não pode ser perfeita, por isso ela vai ser melhor em algumas usabilidades e em outras pior, a constante capacidade de 
  equilibrar o jogo entregando o necessário, ganhando em algo e perdendo em outra coisa. É como visto no Teorema CAP, que aborda o conceito que um sistema distribuído pode ter apenas 2 dos 3: consistência, disponibilidade e 
  partição (tolerante a falhas), sendo melhor em algo e perdendo outra coisa.


Requisitos funcionais : Ações do sistema 

Requisitos não funcionais: desempenho da aplicação, usabilidade, confiabilidade, segurança, disponibilidade, etc...
Portabilidade: capacidade de atuar em diversos sistemas, sendo a principal característica do Java, por conta de ser uma linguagem de baixo nível, mais próximo da máquina.



# Trade Off - Dia 14/8

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

O texto aborda principalmente a questão do tempo na engenharia de software, fator primordial que deve ser considerado na criação dos softwares. Com o texto, aprendemos que devemos distinguir programação e engenharia de software, ambos são diferentes, de modo geral, os dois estão interligados e existem diversas vertentes no meio do caminho da criação, tendo como principal fator o tempo gasto.

Exemplos de Trade Off: 
- 1º Bancos Relacionais: É notório que existem diversos modelos de banco de dados no mercado, porém existem diferenças fundamentais dos seus paradigmas, o banco relacional propõe trabalhar com dados estruturados e "certinhos", o que consequentente exige um sistema mais estruturado e rígido, ou seja, os banco de dados relacionais perdem a capacidade de tratar todos os tipos de dados para entregar uma melhor qualidade dos dados, sendo bem estruturados e normalizados, mesmo que isso faça o sistema ficar mais pesado.
- 2º Bancos Não-Relacionais: Existem diversos tipos de bancos não relacionais, chave-valor, orientado a documentos, colunar, grafo, etc... O que o banco de dados não relacional se propõe a trabalhar com dados semi-estruturados e não estruturados, entregando consistência e agilidade, uma vez que não exige uma estrutura rígida no banco de dados. Por outro lado, temos a questão dos dados serem desnormalizados, o que pode ser um prejuízo em determinadas situações, como por exemplo em um setor financeiro, que precisa de dados normalizados, para evitar inconsistências em suas informações, como a duplicação de dados.
- 3º Python: Por conta de ser uma linguaguem que se propõe a ser de 'alto nível', ou seja, mais próxima do ser humano, o que ocorre é que os códigos são mais simples de serem criados, com uma sintaxe mais simples se comparada com outras linguagens. O que peca na linguagem Python, é a velocidade da mesma, por conta de ser longe da máquina, há uma maior dificuldade na hora da viagem dos comandos entre linguagem e computador, o que afeta também seu desempenho.



# Diagrama de Casos de Uso - 21/8
<div style="Cursive">
<p><h4>Exemplo feito em sala de aula utilizando o sistema UML <br>No sistema abaixo foi feita uma representação das opções que um cliente tem ao utilizar seu app de banco, com a seção investimentos disponível.</p>
</h4>
</div>
<img src="/EngenhariaDeSoftware/Diagrama_Bancario.drawio.png">












