**CASOS DE USO**

**UC01 CADASTRAR ANIMAL**   
Trata-se do processo inicial de realizar o cadastro do animal para permitir o agendamento da consulta.

**Fluxo principal**

1. A recepcionista escolhe uma opção de cadastrar animal.  
2. O sistema solicita nome, espécie, idade do animal e nome e telefone do tutor.  
3. A recepcionista digita os dados necessários.  
4. O sistema valida as informações digitadas.  
5. O sistema salva as informações e exibe uma confirmação.

**Fluxo alternativo**

1. A Recepcionista deixa um campo obrigatório em branco:  
   1. O sistema informa qual campo precisa e solicita a informação novamente.  
2. A recepcionista digita alguma informação inválida:  
   1. O sistema informa sobre o erro e solicita a informação novamente.  
3. O animal já está cadastrado:  
   1. O sistema informa ao usuário e solicita reinício em fluxo correto.

**UC02 CADASTRAR VETERINÁRIO**   
Trata-se do processo inicial de realizar o cadastro do veterinário para permitir o agendamento da consulta.

**Fluxo principal**

1. A recepcionista escolhe uma opção de cadastrar veterinário.  
2. O sistema solicita nome, e CRMV.  
3. A recepcionista digita os dados necessários.  
4. O sistema valida as informações digitadas e verifica se o CRMV não está cadastrado.  
5. O sistema salva as informações e exibe uma confirmação.

**Fluxo alternativo**

6. A recepcionista digita um CRMV já existente:  
   1. O sistema informa que o veterinário já está cadastrado.  
7. A recepcionista deixa algum campo obrigatório em branco:  
   1. O sistema informa qual campo precisa e solicita a informação novamente.

**UC03 AGENDAR CONSULTA**  
Trata-se do processo principal da aplicação, onde a recepcionista pode realizar o agendamento da consulta do animal.

**Fluxo principal**

1. A recepcionista escolhe a opção de agendar consulta.  
2. O sistema solicita o animal, o veterinário e a data e horário da consulta.  
3. A recepcionista digita os dados necessários.  
4. O sistema valida a data (se já passou, se está dentro do horário de trabalho, se o veterinário está disponível etc)  
5. O sistema exibe um resumo e solicita a confirmação da recepcionista.  
6. A recepcionista confirma as informações.  
7. O sistema grava a consulta como agendada e exibe a confirmação.

**Fluxo alternativo**

1. O animal não está cadastrado:  
   1. O sistema informa que não encontrou animal e oferece cadastro UC01. Concluído o cadastro, volta ao passo 3\.  
2. O veterinário não foi encontrado:  
   1. O sistema informa que não encontrou o veterinário e oferece cadastro UC02. Concluído o cadastro, volta ao passo 3\.  
3. A data e/ou horário estão no passado:  
   1. O sistema informa a violação da regra e volta ao passo 3\.  
4. A consulta está fora do horário de funcionamento:  
   1. O sistema informa a violação da regra e volta ao passo 3\.  
5. O veterinário já tem uma consulta para a data e horário:  
   1. O sistema informa que há conflito no horário e lista outros horários disponíveis.  
6. Tutor não quer confirmar a consulta:  
   1. A recepcionista cancela e o sistema não grava consulta.