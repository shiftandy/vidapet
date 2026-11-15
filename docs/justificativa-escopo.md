**JUSTIFICATIVA DE ESCOPO**

Para a primeira etapa do VidaPet, escolhi implementar três funcionalidades: cadastrar animal, cadastrar veterinário e agendar consulta. Essa escolha foi feita pois considero as principais atividades do sistema como mapeei nos casos de uso, além disso eles estão mais relacionados entre si. Para agendar uma consulta é necessário que se tenha as informações do animal e do veterinário.

A linguagem de programação que eu escolhi para trabalhar foi o Java, sendo executado pelo terminal. Utilizei o switch como estrutura para separar as opções do menu e o do e while para permitir que o programa fique rodando mesmo depois que o usuário termine um fluxo e só finalize de fato quando o usuário escolher sair. 

No cadastro utilizei variáveis para receber informações de tipos primitivos e funções nativas do Java e realizei algumas validações iniciais para garantir que o usuário de fato digite alguma informação nos campos necessários, sendo regra de negócio e validação de idade e da espécie do animal, considerando apenas cão e gato.

Nesta versão, os dados são recebidos e verificados e ficam armazenados temporariamente nas variáveis do programa, permitindo utilizar as informações do animal e do veterinário no agendamento da consulta. Esses dados são perdidos logo que o programa é encerrado e não é possível ainda consultar uma lista de cadastros anteriores. Validações mais complexas de data, horário e disponibilidade ficam para as próximas etapas. O objetivo foi trabalhar os conceitos iniciais solicitados no escopo do projeto, como variáveis, operadores, condições e estruturas de repetição. Com essa estrutura inicial em funcionamento, será possível desenvolver as outras funcionalidades mais facilmente nas próximas etapas.

**SUPOSIÇÕES**

Para desenvolver esta primeira etapa, considero que o usuário vai informar os dados diretamente pelo terminal, como se fosse um caderno mesmo. A idade do animal vai ser cadastrada em anos inteiros aceitando o zero para animais com menos de um ano de idade e para as espécies, conforme mencionado, aceitaremos apenas cães e gatos.