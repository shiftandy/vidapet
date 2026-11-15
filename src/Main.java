import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicialização da função scanner para utilizar em inputs do usuário
        Scanner exibir = new Scanner (System.in);
        System.out.println("BOAS VINDAS AO VIDA PET!");

        String nomeAnimal = "";
        String especieAnimal = "";
        String nomeTutor = "";
        String telTutor = "";
        String nomeVeterinario = "";
        String cmrvVeterinario = "";
        String confDados = "";
        int idadeAnimal = 0;
        int opcao;

        // O do-while foi utilizado para mostrar o menu inicialmente e após a interação do usuário, reapresentar o menu sem fechá-lo, assim o atendente pode usar mais de uma vez o programa.
        do {
            // Menu do usuário
            System.out.println("\nVIDAPET - Consultas Veterinárias");
            System.out.println("\n1 - Cadastrar animal");
            System.out.println("2 - Cadastrar veterinário");
            System.out.println("3 - Agendar Consulta");
            System.out.println("4 - Sair");

            System.out.print("\nInforme a opção desejada: ");
            opcao = exibir.nextInt();

            // Os fluxos escolhidos para a etapa inicial são Cadastrar animal, Cadastrar veterinário e Agendar Consulta.
            // Ambos os fluxos fazem rotinas básicas de armazenamento de dados primitivos e strings, além de validação, para checar se o usuário não esqueceu de alguma informação.
            // Os fluxos foram determinados por serem as principais rotinas da aplicação. e ambos necessitam um do outro para serem concluidos.

            switch (opcao) {
                case 1:
                {
                    // Exibição das opção e coleta de dados do animal
                    System.out.println("CADASTRO DO ANIMAL\n");
                    exibir.nextLine();
                    System.out.println("Informe o nome do animal:");
                    nomeAnimal = exibir.nextLine();
                    System.out.println("Informe a espécie do animal:");
                    especieAnimal = exibir.nextLine();
                    System.out.println("Informe a idade do animal:");
                    idadeAnimal = exibir.nextInt();
                    System.out.println("\nINFORMAÇÕES DE CONTATO");
                    exibir.nextLine();
                    System.out.println("\nInforme o nome do tutor do animal:");
                    nomeTutor = exibir.nextLine();
                    System.out.println("Informe o telefone do tutor do animal:");
                    telTutor = exibir.nextLine();

                    // Processamento dos dados
                    boolean idadeValida = idadeAnimal >= 0;
                    boolean especieValida = especieAnimal.equals("cao") || especieAnimal.equals("gato");

                    // Validação dos dados
                    // Verifica se os dados foram preenchidos e se algumas das informacoes são válidas com as regras de negócio
                    if (!nomeAnimal.isBlank() && !nomeTutor.isBlank() && !telTutor.isBlank() && idadeValida && especieValida) {
                        System.out.println("Animal cadastrado com sucesso " + nomeAnimal + " - " + especieAnimal + " - " + idadeAnimal + " anos.");
                    } else {
                        System.out.println("Cadastro inválido. Tente novamente.");
                    }
                    break;
                }
                case 2:
                {
                    // Exibição das opção e coleta de dados do veterinário
                    System.out.println("CADASTRO DE VETERINÁRIO\n");
                    exibir.nextLine();
                    System.out.println("Informe o nome do veterinário:");
                    nomeVeterinario = exibir.nextLine();
                    System.out.println("Informe o CRMV do veterinário:");
                    cmrvVeterinario = exibir.nextLine();

                    // Validação dos dados
                    // Verifica se os dados foram preenchidos
                    if (!nomeVeterinario.isBlank() && !cmrvVeterinario.isBlank()) {
                        System.out.println("Veterinário cadastrado com sucesso " + nomeVeterinario + " - CMRV: " + cmrvVeterinario + ".");
                    } else {
                        System.out.println("Cadastro inválido. Tente novamente.");
                    }
                    break;

                }

                case 3:
                {
                    if (nomeAnimal.isBlank() || nomeVeterinario.isBlank()) {
                        System.out.println("\nÉ necessário cadastrar um animal e um veterinário. Tente novamente.");
                        break;

                    } else {
                        // Exibição das opção e coleta de dados do veterinário
                        System.out.println("AGENDAMENTO DE CONSULTA");
                        exibir.nextLine();

                        System.out.println("\nDados do Paciente:");
                        System.out.println("Nome: " + nomeAnimal);
                        System.out.println("Espécie: " + especieAnimal);
                        System.out.println("Idade do animal: " + idadeAnimal);

                        System.out.println("\nDados do Tutor:");
                        System.out.println("Nome: " + nomeTutor);
                        System.out.println("Telefone: " + telTutor);

                        System.out.println("\nDados do Veterinário:");
                        System.out.println("Nome: " + nomeVeterinario);
                        System.out.println("CRMV: " + cmrvVeterinario);
                    }

                    System.out.println("\nOs dados estão corretos? (S/N)");
                    confDados = exibir.nextLine();

                    if (!confDados.equals("S") && !confDados.equals("s")) {
                        System.out.println("\nVocê está sendo direcionado ao menu para recadastrar as informações");
                        System.out.println("Até logo!");
                        break;
                    }

                    System.out.println("AGENDAMENTO DE CONSULTA");
                    System.out.println("Por favor, informe a data e horário para finalização do agendamento.");

                    System.out.println("\nQual é a data da consulta?");
                    String dataConsulta = exibir.nextLine();
                    System.out.println("\nQual é o horário da consulta?");
                    String horaConsulta = exibir.nextLine();

                    // Processamento de dados
                    // Por enquanto, verifica se os dados estão vazios
                    if (!dataConsulta.isBlank() && !horaConsulta.isBlank()) {
                        System.out.println("\nConsulta cadastrada com sucesso!");
                        System.out.println("\nAnimal: " + nomeAnimal);
                        System.out.println("Veterinário: " + nomeVeterinario);
                        System.out.println("Data: " + dataConsulta);
                        System.out.println("Horário: " + horaConsulta);
                        System.out.println("Situação: Agendada\n");
                    }
                    else {
                        System.out.println("Alguma das informações é inválida. Tente novamente.\n");
                    }

                    break;
                }
                case 4:
                {
                    System.out.println("\nSaindo do programa...");
                    break;
                }
        }
        // Programa deve rodar inicialmente enquanto a opção for diferente de 4 - sair
        } while  (opcao != 4);
    }
}
