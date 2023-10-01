# EngenhariaSoftware
1° Singleton: Utilizando o padrão de singleton para que a classe tenha apenas uma instância e fornecer um ponto global de acesso a essa instância, no caso utilizamos para conexão com um banco de dados.
              O funcionamento da aplicação é simples, separado em dois packages diferentes para application(Onde o main está) e db(onde a classe que cuida da tarefa de configurar a instancia do banco de dados)
              é necessário ter uma base de dados MySQL no computador e suas propriedades como a url, senha e usuario para conectar corretamente ao banco de dados. Nisso é só rodar o main.

2° Proxy: Para simular o padrão de Proxy, foi o utilizado o seguinte esquema: Uma comparação pesquisando um filme em uma lista txt e em outra lista menor "cache" que simula o nosso proxy.
          No primeiro passo é preenchida um ArrayList "arquivo" com os nomes de filmes do txt e outro ArrayList "cache" com alguns filmes, simulando que o usuário já tenha pesquisado por eles.
          Então é feita a pesquisa de um filme novamente pelo "cache" que por sua vez é mais rápido que a procura na lista "arquivo" que simula a fonte. Para a pesquisa do filme em ambas as listas,
          incluímos um contador em milissegundos para fazer a comparação e simular que, uma vez que um dado entra no cache, a pesquisa por ele se torna mais rápida do que procurar novamente na fonte.
          Para testar é necessário entrar no projeto proxy>Src e rodar o main.
              
