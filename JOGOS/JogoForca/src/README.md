# 🪓 Jogo da Forca (Java)

Este projeto é uma implementação do clássico **Jogo da Forca**, desenvolvido em **Java** utilizando apenas recursos básicos da linguagem, como controle de fluxo, leitura de arquivos e manipulação de texto no console.

---

## 🎯 Objetivo

O programa lê uma lista de palavras de um arquivo de texto (`palavras.txt`), escolhe uma palavra aleatória e permite que o jogador tente adivinhar as letras.  
A cada erro, o jogador perde uma vida e o desenho da forca é atualizado.

---

## 🧩 Requisitos Funcionais

### 1. Leitura das Palavras
- O jogo carrega uma lista de palavras a partir de um arquivo de texto (`palavras.txt`).
- Cada linha do arquivo representa uma palavra distinta.
- Se o arquivo não existir ou estiver vazio, o jogo exibe uma mensagem de erro e não inicia.

### 2. Seleção da Palavra Secreta
- Uma palavra é escolhida **aleatoriamente** da lista carregada.
- A palavra é convertida para **letras minúsculas**.

### 3. Mecânica do Jogo
- O jogador inicia com **6 vidas**.
- A cada rodada, deve digitar **uma letra**.
- Letras repetidas não são aceitas — o jogador é avisado e deve tentar novamente.
- Se a letra estiver na palavra, ela aparece nas posições corretas.
- Se a letra não estiver, o jogador **perde uma vida** e a forca é atualizada.

### 4. Fim do Jogo
O jogo termina quando:
- ✅ O jogador acerta todas as letras (vitória).
- ❌ O jogador perde todas as vidas (derrota).

Ao final, são exibidos:
- A palavra secreta.
- O resultado (vitória ou derrota).
- O desenho final da forca.

### 5. Exibição da Forca
- A cada erro, uma nova parte do desenho é exibida (simulação ASCII).

### 6. Informações Visuais
Durante o jogo são exibidos:
- A palavra com letras descobertas e ocultas (`_ _ e _ _ a`).
- As letras já tentadas.
- O número de vidas restantes.
- O desenho atual da forca.

---

## 🧠 Estrutura do Projeto

