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

    System.out.println("ALL COOKIES: ");
    for (String key : cookies.keySet()) {
      System.out.println(key + ": " + cookies.get(key));
    }

    System.out.println("======================================");
  }
}
