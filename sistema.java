import java.util.Scanner;
import java.util.ArrayList;

public class sistema {
	public static void main(String[] args) {
		Scanner inpt = new Scanner(System.in);

		int matriculados = 0;													// Servira para formar o numero de matricula do aluno
		
		busca_usuario buscador_usuarios = new busca_usuario();
		
		turma turma_A = new turma();
		turma turma_B = new turma();
		turma turma_C = new turma();

		aluno[] Aluno = new aluno[40];
		while(1 == 1){
			// <<<--- COLOCAR UM CLS AQUI <<<--- 
			System.out.println("Alunos(1)     Professores(2)     Turmas(3)");
			System.out.println("Pagamentos(4)     Fechar sistema(-1)");
			int escolha = inpt.nextInt();
			
			if (escolha == -1) {
				break;
			}
			
			else if (escolha == 1) {													// Escolheu ALUNOS	

				while (1 == 1) {						// Cadastrará quantos alunos desejá ate o limite ou ate cancelar o loop pelo "sair"
					System.out.println("Cadastrar aluno(1)     Verificar dados de um aluno(2)     Voltar(-1)");
					int opcao_aluno = inpt.nextInt();

					if (opcao_aluno == -1) {						//condição de parada
						break;
					}

					else if (opcao_aluno == 1) {					//cadastrando aluno
						aluno pessoa = new aluno();
						System.out.println("Digite o nome do aluno");		
						String nome_aluno = inpt.next();
						pessoa.set_nome( nome_aluno );		// seta nome no objeto aluno

						System.out.println("Digite a data de nascimento(sem espacos): ");
						String data = inpt.next();
						pessoa.set_DataNascimento(data);		// seta data de nascimento no objeto aluno

						System.out.println("Digite o nome da mae");						//nome da mae
						String nome_mae = inpt.next();
						pessoa.set_nomemae(nome_mae);		// seta nome da mae no objeto aluno

						System.out.println("Por favor escolha a turma:");	
				
						while(1 == 1) {						// while para escolha de turma
						
							if (turma_A.matriculados() < 40) {							// verifica se a turma ja esta cheia
								System.out.println("Turma A: " + (40 - turma_A.matriculados()) + " vagas disponiveis.");
								System.out.println("Deseja esta turma?  sim(1)   nao(2)");

								int escolha_turma = inpt.nextInt();				

								if (escolha_turma == 1) {				// Aplica o objeto 'pessoa' da classe aluno() no ArrayList do objeto Turma_A
									pessoa.set_turma("Turma_A");
									turma_A.set_aluno(pessoa);
									break;
								}
								
							}			//FIM DO IF A

							if (turma_B.matriculados() < 40) {						// verifica se a turma ja esta cheia
								System.out.println("Turma B: " + (40 - turma_B.matriculados()) + " vagas disponiveis.");
								System.out.println("Deseja esta turma?  sim(1)   nao(2)");

								int escolha_turma = inpt.nextInt();		
			
								if (escolha_turma == 1) {				// Aplica o objeto 'pessoa' da classe aluno() no ArrayList do objeto Turma_B
									pessoa.set_turma("Turma_B");
									turma_B.set_aluno(pessoa);
									break;
								}
								
							}			//FIM DO IF B

							if (turma_C.matriculados() < 40) {						// verifica se a turma ja esta cheia
								System.out.println("Turma C: " + (40 - turma_C.matriculados()) + " vagas disponiveis.");
								System.out.println("Deseja esta turma?  sim(1)   nao(2)");

								int escolha_turma = inpt.nextInt();			

								if (escolha_turma == 1) {				// Aplica o objeto 'pessoa' da classe aluno() no ArrayList do objeto Turma_C
									pessoa.set_turma("Turma_C");
									turma_C.set_aluno(pessoa);
									break;
								}

							}			//FIM DO IF C

						}			// FIM DO WHILE DE ESCOLHA DE TURMA
						
						buscador_usuarios.set_aluno_escola(pessoa);
						System.out.println("Seja bem vindo " + nome_aluno);
						
					}			// FIM DO ELSE (opcao == 1) (CADASTRAR ALUNO)
				
					else if (opcao_aluno == 2) {					//busca alunos
						System.out.println("Por favor, informe o numero de matricula...");
						int numero_de_matricula_aluno = inpt.nextInt();
						buscador_usuarios.get_dados_aluno(numero_de_matricula_aluno);
					}
				
				}			//FIM DO WHILE ALUNOS

			}			//FIM DO IF ALUNOS
			
			else if (escolha == 2) {													// Escolheu PROFESSORES

				while (1 == 1) {
					System.out.println("Cadastrar professor(1)     Verificar dados de um professor(2)     voltar(-1)");
					int opcao_professor = inpt.nextInt();

					if (opcao_professor == -1) {									//Condição de saida
						break;
					}

					else if (opcao_professor == 1) {								//Cadastrando professor
						professor Professor = new professor();
						
						System.out.println("Digite o nome do professor");
						String nome_do_professor = inpt.next();
						Professor.set_nome(nome_do_professor);					// Aplica o nome do professor no objeto Professor
						
						System.out.println("Digite o grau do professor");
						String Grau = inpt.next();
						Professor.set_grau(Grau);								// Aplica o grau do professor
						
						System.out.println("Digite o salario do professor");
						double Salario = inpt.nextFloat();
						Professor.set_salario(Salario);							// Aplica o salario do professor no objeto Professor
						
						buscador_usuarios.set_professor_escola(Professor);
						
					}
					
					else if (opcao_professor == 2) {
						System.out.println("Por favor, informe o numero de matricula...");
						int numero_de_matricula_professor = inpt.nextInt();
						buscador_usuarios.get_dados_professor(numero_de_matricula_professor);
					}
					
				}		// FIM DO WHILE
				
			}										// FIM DA ESCOLHA PROFESSORES
			
			else if (escolha == 3) {													// Escolheu TURMA
				System.out.println("Verificar alunos na turma A(1)     Verificar alunos na turma B(2)     Verificar alunos na turma C(3)");
				
				int choose = inpt.nextInt();
				if (choose == 1) {
					System.out.println("Alunos matriculados na turma A:");
					turma_A.get_lista();					
				}
			
				else if(choose == 2) {
					System.out.println("Alunos matriculados na turma B:");
					turma_B.get_lista();
				}
				
				else if (choose == 3) {
					System.out.println("Alunos matriculados na turma C:");
					turma_C.get_lista();					
				}
				
				else {
					System.out.println("Escolha invalida");
				}
				
			}
			
			else if (escolha == 4) {													// Escolheu Pagamentos
				while (1==1){					
					System.out.println("Novo pagamento(1)     Verificar pagamentos(2)     Voltar(-1)");
					int opcao_pagamento = inpt.nextInt();
					
					if (opcao_pagamento == -1) {					// Condição de quebra
						break;
					}
					
					else if (opcao_pagamento == 1) {				// Gerando um novo pagamento
						Pagamentos boleto = new Pagamentos();
						
						System.out.println("Por favor, digite a referencia do pagamento: ");					
						String exemplo = inpt.next();
						boleto.set_referente(exemplo);
						
						System.out.println("Digite o valor: ");
						double valor = inpt.nextFloat();
						boleto.set_Valor(valor);
						
						System.out.println("Digite a forma de pagamento: ");
						String forma = inpt.next();
						boleto.set_forma(forma);
						
						System.out.println("Digite a data de vencimento");
						String vencimento = inpt.next();
						boleto.set_data_de_vencimento(vencimento);
					}
					
				}
				
			}		//FIM DO IF PAGAMENTO
			
		}
		
	}

} 