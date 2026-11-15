**LEVANTAMENTO DE REQUISITOS**

**ATORES**

1. Recepcionista \- Cadastrar animais e veterinários; agendar e cancelar consultas  
2. Veterinário \- Consultar sua agenda do dia; registrar consultas como realizadas, fazer observações.

**REQUISITOS FUNCIONAIS (RF)**

| RF01 | Cadastrar animal com seus respectivos dados, nome e telefone do tutor. |
| :---- | :---- |
| RF02 | Listar e buscar animais cadastrados pelo nome do animal ou do tutor. |
| RF03 | Cadastrar veterinário com nome e CRMV. |
| RF04 | Listar veterinários cadastrados. |
| RF05 | Agendar consulta informando animal, tutor, veterinário, data e horário. |
| RF06 | Listar consultas filtrando com as datas, o veterinário, o animal e a situação. |
| RF07 | Exibir agenda do veterinário, listando consultas do dia. |
| RF08 | Alterar a situação das consultas. |
| RF09 | Permitir comentários/anotações do veterinário. |
| RF10 | Exibir agenda com horários livres por veterinário. |
| RF11 | Listar consultas por data, veterinário e situação |
| RF12 | Cadastrar recepcionistas. |
| RF13 | Listar recepcionistas cadastrados. |
| RF14 | Registrar logs para auditoria. |

**REQUISITOS NÃO FUNCIONAIS (RNF)**

| RNF01 | Restrição técnica | Começa como um programa standalone orientado a objetos. |
| :---- | :---- | :---- |
| RNF02 | Restrição técnica | Será publicado em Java com Spring Boot ou em C\# com ASP.NET. |
| RNF03 | Restrição técnica | Serviço web com persistência de dados. |
| RNF04 | Restrição técnica | Deve ter autenticação com tela de login. |
| RNF05 | Desempenho | O sistema precisa ser rápido. |
| RNF06 | Usabilidade | É fácil navegar pelo sistema. |
| RNF07 | Restrição técnica | Armazenar informações sensíveis do tutor do animal. |

**REGRAS DE NEGÓCIO (RN)**

| RN01 | As consultas duram 30 minutos. |
| :---- | :---- |
| RN02 | Marcações apenas de segunda a sexta feira, das 08h às 18h. |
| RN03 | Um veterinário não pode ter duas consultas agendadas no mesmo horário. |
| RN04 | Não é possível agendar consultas em datas que já passaram. |
| RN05 | Uma consulta só pode ser cancelada se estiver como agendada. |
| RN06 | Uma consulta só pode ser realizada se estiver como agendada. |
| RN07 | Espécie do animal limitado a cão ou gato. |
| RN08 | Situação de consultas: agendada, realizada ou cancelada. |

