# Pac-Mac Orientado a Objetos

Você foi contratado por uma empresa de jogos para desenvolver o melhor jogo de Pac-Mac da história do videogame! Inicialmente, para ter uma ideia inicial de como seria a arquitetura de software desse jogo, seu chefe pediu para você criar um diagrama de classes UML representando os principais elementos do jogo.

Para tornar o jogo mais interessante, você deverá:

1) Usar o padrão Estratégia (Strategy) para implementar diferentes comportamentos para os fantasmas. Por exemplo, fantasmas vermelhos perseguem o Pac-Man, fantasmas rosas tentam se posicionar na frente da boca do Pac-Man, fantasmas laranjas são completamente aleatórios, fantasmas brancos fogem do Pac-Man e assim por diante.

2) Usar o padrão Fábrica Abstrata para oferecer diferentes aparências ("look-and-feels"). Assim, facilmente, o jogador poderá escolher se o espaço do jogo terá uma aparência de supermercado em tempos de covid, velho oeste, espaço sideral ou os corredores de uma empresa, por exemplo. Quando o usuário selecionar uma nova aparência, todos os elementos gráficos do jogo devem se redesenhar imediatamente.

Note que, neste exercício, você não precisa implementar nenhuma linha de código. Você deverá apenas criar um diagrama de classes UML representando as principais abstrações da sua arquitetura de software, por exemplo, as principais classes que você utilizaria para, num outro momento, implementar tal jogo.

Sugerimos que antes de fazer este exercício que você assista novamente aos vídeos de UML, do padrão Estratégia e do padrão Fábrica Abstrata.

Caso você não conheça muito bem o jogo Pac-Man e quiser aprender mais sobre ele, veja https://pt.wikipedia.org/wiki/Pac-Man

**O que entregar**

1) Você deverá submeter pela um arquivo de imagem contendo o seu diagrama UML de forma que ele seja bem legível e claro. Para gerar um diagrama UML, você pode baixar algum dos diversos programas gratuitos que existem disponíveis na Web para isso, por exemplo [draw.io](https://drawio-app.com/) e [Lucidchart](https://www.lucidchart.com/), caso prefira um software com versão para Desktop, você pode utilizar o [Dia](http://dia-installer.de/) ou o plugin [Papyrus](https://www.eclipse.org/papyrus/) para a IDE Eclipse. Alternativamente, você pode desenhar o diagrama claramente no papel e tirar uma foto (neste caso, por favor, garanta que a qualidade da imagem, foco e iluminação estejam ótimas).

2) Após entregar a sua solução, você deve avaliar criticamente a solução dada por pelo menos 2 de seus colegas de curso. Tente fazer uma análise criteriosa e construtiva. A ideia é que você aprenda também a criticar arquiteturas de software projetadas por outras pessoas e pratique dar um feedback construtivo para seus colegas.

**Dica**

Pense nas principais abstrações que você precisará representar: Tabuleiro, PacMan, Fantasma, tipos específicos de fantasma, pontos, placar, entrada dos movimentos do jogador via teclado ou joystick, etc. Verifique se você está usando herança e agregação apropriadamente e se as associações entre os objetos estão adequadas.

**Observação: Apenas PDFs e imagens serão aceitos!***
