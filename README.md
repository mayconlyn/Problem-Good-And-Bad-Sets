# Problema: Good And Bad Sets
URI Online Judge | 2087 |
By Gabriel Duarte, UNIFESO BR Brazil
https://www.urionlinejudge.com.br/judge/en/problems/view/2087

# Descrição
In this issue you will find a set of several words, and you have to say if the set is good or bad (Conjunto Bom or Conjunto Ruim, respectively). By definition, a set is bad when one word of this set is a prefix of another word. Otherwise, this is considered a good set.

For example, {abc, dae, abcde} is a bad set, because abc is a prefix of abcde. When two words are equal, we defined that one word is a prefix of the other.

## Entrada
The input contains several test cases. The first line of each test case will an integer N (1 ≤ N ≤ 10⁵) representing the number of words in the set. It follows then N rows each having a word of at most 100 lowercase letters. The entry ends when N = 0 and is not to be processed.

## Saída
For each test case you should print Conjunto Bom or Conjunto Ruim, as explained above.

## Exemplo
| Entrada | Saída |
| ------------ | ------------- |
| 3 | Conjunto Ruim |
| abc | Conjunto Bom |
| dae | |
| abcde | |
|2 | |
|abc | |
|def | |
|0 | |

# Tecnologia
- Java

# Minha Solução
1. Lê a quantidade de palavras
2. Lê e armazena em uma Collection do tipo List o conjunto de palavras
3. Faz a chamada do método goodAndBadSets(List<String> list, List<String> sets)
4. Compara as palavras em um laço de repetição, letra por letra
5. Grava a saída em uma uma Collection do tipo List

# Submission URI
![URI](https://github.com/mayconlyn/assets/blob/master/Desafios/GoodAndBadSets/Submission.png)

# Autor
Maycon Lyncoln Garcia
<p> https://www.linkedin.com/in/maycon-garcia-66a820112/
