## Proposta de Design

O software que atende essa demanda deve modularizado da seguinte forma:

- Uma **classe** responsável pela leitura do arquivo CSV e pela conversão de seu conteúdo para um objeto manipulável
- Uma **classe** responsável pelo processamento indicado pelos requisitos (alteração do objeto)
- Uma **classe** responsável pela criação de outro arquivo CSV a partir da conversão do objeto manipulável

**Observação:** o arquivo CSV de entrada e o arquivo CSV criado após o processamento devem ser inicializados com o recurso "Try with Resources" da linguagem Java.

Exemplo de uma inicialização do arquivo CSV:

```
try (Scanner scanner = new Scanner(new File("entrada.csv"))) {

  // Conversão do conteúdo do arquivo para um objeto manipulável

}
catch (FileNotFoundException fnfe) {
    fnfe.printStackTrace();
}
```
