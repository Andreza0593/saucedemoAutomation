#language:pt

  Funcionalidade: Compra


    Esquema do Cenario: Realizar compra
    Cenario: Realizar compra
      Dado  que um cliente com usuário cadastrado realize uma compra
      Quando efetuar o login com username "standard_user" e password "secret_sauce"
      E selecionar os itens de nome "Sauce Labs Backpack" e "Sauce Labs Bolt T-Shirt "na página de produtos
      E em seguida conferir os itens na página de carrinho
      E inserir First Name "", Last name"" e zip/postal Code
      Então reberá a mensagem de confirmação finalizando a compra