
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        // inicializa variáveis de instância
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String getHiddenWord()
    {
        // escreva seu código aqui
        return hiddenWord;
    }
    public String getGuessedWord()
    {
        // escreva seu código aqui
        return guessedWord;
    }
    public int getnumberOfTries()
    {
        // escreva seu código aqui
        return numberOfTries;
    }
    public void showGuessedWord()
    {
    System.out.println(guessedWord);
    }
    
}
