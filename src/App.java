import java.util.Map;
import java.util.TreeMap;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("======================================");
    //Como o tipo String ele ja tem implementado o hicosHedCod
    //e tambem o compertchu eu posso usar o treeMap diretamente
    Map<String, String> cookies = new TreeMap<>();

    cookies.put("Username", "Maria");
    cookies.put("Email", "Maria@gmail.com");
    cookies.put("Phone", "99711122");

    //aki eu to removendo do meu map aquela entrada cuja chave e email
    cookies.remove("Email");

    //aki eu vou enserir no meu map uma entrada cuja a chave e fone e a mesma entrada
    //que tem acima so que agora com outro valor... eu vi na teoria que o mep ele nao adimite repetiçoes
    //da chave entao esse comando abaixo ele vai sobre escrever esse valor que eu tinha antes
    cookies.put("Phone", "99771133");

    System.out.println("Contains 'Phone' key: " + cookies.containsKey("Phone"));
    //aki acima eu fiz um texte se meu map contem a chave chamada fone para verificar se existe essa chave
    //eu vou chamar o cookies.containsKey ("Phone")

    System.out.println("Phone number: " + cookies.get("Phone"));
    //Agora fiz o texte para pegar o valor de uma chave

    System.out.println("Email: " + cookies.get("Email"));
    //agr fix o texte usando o get e to tentando pega um valor que nao existi
    // uma coisa enteresante quando o elemento nao existi o map retorna null

    System.out.println("Size: " + cookies.size());
    //agora vamos textar o Size para ver o tamanho do map

    System.out.println("ALL COOKIES: ");
    for (String key : cookies.keySet()) {
      System.out.println(key + ": " + cookies.get(key));
    }

    System.out.println("======================================");
  }
}
