# Streams
## O que é um Stream?
Stream é uma sequência de elementos disponíveis para um programa. É uma forma de processar coleções de objetos de forma mais simples e concisa.

## Características de um Stream
- **Pipelines**: É possível encadear várias operações em um único comando.
- **Internamente Iterativo**: O Java faz a iteração internamente, sem a necessidade de um loop explícito. 

**toList()** -> cria uma lista imutável(O objeto pode ser mutável)

**collect(Collectors.toList)** -> Cria uma lista mutável

**predicado** -> É básicamente uma função onde eu quero colocar o meu filtro