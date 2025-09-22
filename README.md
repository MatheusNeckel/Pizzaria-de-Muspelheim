# Pizzaria de Muspelheim 🍕🔥

Aplicativo acadêmico em **Java** (desktop, Swing) para gestão de pizzaria: **cardápio** (sabores/tamanhos/adicionais), **clientes**, **pedidos** (delivery/balcão), **pagamentos** e **relatórios** simples. Projeto focado em **POO**, camadas (DTO/DAO/Service/UI) e integração com **MySQL** via JDBC.

> Este README foi preparado para padronização dos repositórios e inclui instruções de build/execução, estrutura sugerida e roadmap. Adapte conforme o estado atual do código.

## 🎯 Objetivos
- Cadastrar **sabores**, **tamanhos**, **adicionais** e **tabelas de preço**
- Gerenciar **clientes** e **endereços**
- Registrar **pedidos** (itens, quantidades, observações) e **pagamentos** (dinheiro/cartão/pix)
- Geração de **relatórios** simples (diário/mensal, por forma de pagamento/sabor)
- Exercitar POO, DAO/DTO, serviços e boas práticas

## 🧰 Stack
- **Java 17+** (compatível com 11)
- **Swing** (GUI)
- **JDBC** (MySQL Connector/J)
- **Ant / Maven / Gradle** (qualquer um — ver seção de build)

## 🗃️ Banco de Dados
- **SGBD**: MySQL 8+
- **Esquema sugerido**: `pizzaria_muspelheim`
- **Variáveis de conexão** (ajuste no seu projeto):
  - Host: `localhost`
  - Porta: `3306`
  - Database: `pizzaria_muspelheim`
  - Usuário: `root`
  - Senha: `root`

> Recomenda-se centralizar as credenciais em um arquivo de **config** (ex.: `config/db.properties`) e **NÃO** versionar credenciais reais. Armazene apenas um exemplo (ex.: `db.properties.example`).

## 🗂️ Estrutura (sugerida após organizar o repositório)
```
/src/...
/config/               # arquivos .properties (somente *.example no git)
/docs/                 # diagramas, prints
/dist/                 # artefatos de build (git-ignored)
```

## ▶️ Como executar

### Opção A) Via NetBeans
1. Garanta o **MySQL** em execução e o schema criado.
2. Ajuste o **driver** (Connector/J) nas bibliotecas do projeto.
3. Execute o projeto no NetBeans.

### Opção B) Via linha de comando
- **Se houver `build.xml` (Ant):**
  ```bash
  ant clean dist
  ```
- **Se houver `pom.xml` (Maven):**
  ```bash
  mvn -B -DskipTests package
  ```
- **Se houver `build.gradle`:**
  ```bash
  ./gradlew build
  ```
- **Sem ferramenta de build (apenas fontes em `/src`):**
  ```bash
  find src -name "*.java" > sources.txt
  javac -cp "lib/*" -d out @sources.txt
  java -cp "out:lib/*" Main
  ```

> **CI**: O GitHub Actions detecta automaticamente Ant/Maven/Gradle. Se só houver `.java`, ele compila “na unha”. Como o app é desktop e depende de MySQL, o CI **não roda integração** com banco (apenas build).

## 📄 CSV / Seed (opcional)
- `docs/seed/` com CSVs de **sabores**, **tamanhos**, **adicionais**, **clientes** para importar.
- Exemplo de colunas (`sabores.csv`):
  ```
  sabor_id,nome,descricao,ativo
  ```

## 🛣️ Roadmap
- [ ] Refatorar para camadas DTO/DAO/Service claras
- [ ] Validações e máscaras de campos (telefone, CEP)
- [ ] Testes unitários (JUnit) e mocks de DAO
- [ ] Relatórios (PDF/Excel) e filtros avançados
- [ ] Migração opcional para ORM leve (JPA/Hibernate) ou SQLite local

## 🤝 Contribuição
Padrões recomendados:
- **Conventional Commits**
- Branches: `feature/*`, `fix/*`
- PR com descrição clara e prints

## 📜 Licença
Este projeto é licenciado sob **MIT**. Veja [LICENSE](LICENSE).
