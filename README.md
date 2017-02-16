Análise e Projeto de Algoritmos
===================
Ordenação Heurística
-------------
Programa para a atividade 4 de Ordenação da disciplina de Análise e Projeto de Algoritmos.

Implementação em **java** de um heurística para a escolha de algoritmos de ordenação para um dado vetor de entrada.  Os algoritmos de ordenação são *Counting Sort*, *Bucket Sort*, *Radix Sort*, *Quick Sort* e *Heap Sort*.

Uso
-----
A execução é feita pelo script  **run.sh** e recebe como parâmetro um arquivo de texto com os elementos do vetor (sendo o primeiro elemento o tamanho do mesmo) ou um diretório contendo arquivos **.in** (o script acessa **apenas** os arquivos *.in* do diretório).

Os arquivos são passados para o algoritmo por meio de redirecionamento de fluxo.

```
bash run.sh exemplo.in
```
ou
```
bash run.sh diretorio
```
Resultados
----
Os resultados são salvos na pasta **resultados**. Cada ordenação gera um arquivo contendo o algoritmo selecionado pela heurística, seu tempo de ordenação e o vetor ordenado.
