<<<<<<< HEAD
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
=======
# ⚙️ LogTrack - Gestão Industrial

Sistema simples de gestão de manutenção industrial desenvolvido em Java Puro. O projeto foi projetado para monitorar custos operacionais, realizar triagem de chamados urgentes e gerar relatórios dinâmicos de paradas críticas por setores da fábrica.

## 🎯 Funcionalidades:
* **Relatório de Custos:** Consolidação automática do custo total de todas as manutenções cadastradas na planta.
* **Triagem de Urgências:** Contador automatizado de chamados marcados com prioridade urgente na fábrica.
* **Detecção de Parada Crítica:** Identificação imediata do equipamento/ocorrência que gerou o maior custo financeiro.
* **Filtro por Setor:** Busca customizada de ordens de serviço filtradas por divisões específicas (Produção, Logística, Refinaria).
* **Segurança de Negócio:** Tratamento de erros integrado que impede a quebra do sistema caso relatórios sejam gerados com dados vazios.

## 🚀 Tecnologias:
* **Java 17 (ou superior):** Linguagem base utilizada para todo o desenvolvimento do sistema.
* **Java Streams API:** Estrutura moderna utilizada para o processamento, filtragem e agregação eficiente de coleções de dados.
* **Expressões Lambda & Method References:** Sintaxe limpa e performática para manipulação das esteiras de dados.
* **Type Safety com Enums:** Uso de enumerações avançadas para centralização e cálculo dinâmico das taxas operacionais.
---
## 📋 Pré-requisitos:
* Java JDK 17 ou superior instalado.
* IDE de sua preferência (IntelliJ IDEA, Eclipse ou VS Code).
* Git instalado para clonagem do repositório.
* Sistema operacional compatível: Windows, Linux ou macOS.
---
## 💾 Instalação:
1. Clone o repositório:
```bash
git clone [https://github.com/seu-usuario/logtrack-pro.git](https://github.com/seu-usuario/logtrack-pro.git)
cd logtrack-pro
```
2. Compile os arquivos do projeto através do terminal:
```Bash
javac -d bin src/com/longtrack/model/*.java src/com/longtrack/exception/*.java src/com/longtrack/service/*.java src/com/longtrack/*.java
```
3. Execute a aplicação:
```Bash
java -cp bin com.longtrack.App
```
---
## ▶️ Como Usar:
1. Classe App (Main): Ao iniciar, o sistema executa automaticamente duas rotinas de testes no terminal.
2. Teste de Resiliência: O sistema tenta gerar um relatório com a base vazia para demonstrar o disparo e a captura controlada da exceção de segurança.
3. Geração de Dados: O sistema popula a memória com manutenções preventivas e paradas críticas em diferentes setores (PRODUCTION, LOGISTICS, REFINERY).
4. Exibição do Dashboard: O terminal exibe o balanço financeiro consolidado, o indicador de urgências e os detalhes específicos da pior parada do período.
---
## 📁 Estrutura do Projeto
```logtrack-pro/
├── src/
│   └── com/
│       └── longtrack/
│           ├── model/
│           │   ├── Maintenance.java              # Interface base / Contrato das manutenções
│           │   ├── PreventiveMaintenance.java    # Implementação de manutenção preventiva
│           │   ├── CriticalStop.java             # Implementação de parada crítica (corretiva)
│           │   └── Sector.java                   # Enum com os setores e suas respectivas taxas horárias
│           │
│           ├── service/
│           │   └── MaintenanceManager.java       # Motor de regras de negócio e consultas (Streams)
│           │
│           ├── exception/
│           │   └── EmptyReportException.java     # Exceção customizada para tratamento de erros
│           │
│           └── App.java                          # Classe principal / Ponto de entrada do sistema
└── README.md                                     # Documentação do projeto
```
---
## 🌐 Integração com Regra de Negócio:
O sistema utiliza os valores indexados no Enum Sector para calcular o prejuízo financeiro gerado por hora de máquina parada na classe ```CriticalStop.```
| SETOR | CUSTO POR HORA PARADA (R$)|
|---|---|
| `PRODUCTION` | R$ 500 |
| `LOGISTICS` |  R$ 400 |
| `REFINARY` | R$ 600 |

## 📊 Tipos de Manutenção Suportados:
| TIPO | ATRIBUTOS PRINCIPAIS | REGRAS DE CUSTO  
|---|---|---|
| `Preventiva` | Descrição, Custo Fixo, Setor  | Retorna o próprio custo fixo agendado.
| `Parada Crítica` | Descrição, Horas Paradas, Setor | Multiplica as horas paradas pela taxa horária do setor correspondente. |
---
## 🛠️ Scripts Disponíveis:
```Bash
# Compilar todo o projeto direcionando os binários para a pasta bin
javac -d bin src/com/longtrack/model/*.java src/com/longtrack/exception/*.java src/com/longtrack/service/*.java src/com/longtrack/*.java

# Executar a aplicação compilada
java -cp bin com.longtrack.App
```
---
## 👥 Autores
- **Pedro Sales**
---
## 🤝 Contribuições

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/NovaFuncionalidade`)
3. Commit suas mudanças (`git commit -m 'Add: nova funcionalidade'`)
4. Push para a branch (`git push origin feature/NovaFuncionalidade`)
5. Abra um Pull Request
---
## 📬 Contato

Para dúvidas, sugestões ou feedbacks sobre a arquitetura do projeto, sinta-se à vontade para abrir uma issue no repositório.

---

**Status: Em Desenvolvimento 🚧**
>>>>>>> 72ef81ff4d258bd8837e209f0de6371fec80f8aa
