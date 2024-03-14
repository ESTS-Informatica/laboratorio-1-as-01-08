import java.util.ArrayList;
import java.util.Random;

/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGenerator
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<String> words;

    /**
     * Construtor para objetos da classe WordGenerator
     */
    public WordGenerator()
    {
        // inicializa variáveis de instância
        words = new ArrayList();
        fillArrayList();
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void fillArrayList()
    {
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    public ArrayList<String> getWords() {
        return words;
    }
    public String generateWord() {
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }
    public void addWords(String word) {
        words.add(word);
    }
}
