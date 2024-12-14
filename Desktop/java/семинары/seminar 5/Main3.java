import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

    /*
    РќР°РїРёСЃР°С‚СЊ РїСЂРѕРіСЂР°РјРјСѓ, РѕРїСЂРµРґРµР»СЏСЋС‰СѓСЋ РїСЂР°РІРёР»СЊРЅРѕСЃС‚СЊ СЂР°СЃСЃС‚Р°РЅРѕРІРєРё СЃРєРѕР±РѕРє РІ РІС‹СЂР°Р¶РµРЅРёРё.
    РџСЂРёРјРµСЂ 1: a+(d*3) - РёСЃС‚РёРЅР°
    РџСЂРёРјРµСЂ 2: [a+(1*3]) - Р»РѕР¶СЊ
    РџСЂРёРјРµСЂ 3: [6+(3*3)] - РёСЃС‚РёРЅР°
    РџСЂРёРјРµСЂ 4: {a}[+]{(d*3)} - РёСЃС‚РёРЅР°
    РџСЂРёРјРµСЂ 5: <{a}+{(d*3)}> - РёСЃС‚РёРЅР°
    РџСЂРёРјРµСЂ 6: {a+]}{(d*3)} - Р»РѕР¶СЊ
     */


public class Main3 {
    public static void main(String[] args) {
        String primer1 = "a+(d*3)";
        String primer2 = "[a+(1*3])";
        String primer3 = "<{a}+{(d*3)}>";
        String primer4 = "{a+]}{(d*3)}";
        System.out.println(checkPrimer(primer1));
        System.out.println(checkPrimer(primer2));
        System.out.println(checkPrimer(primer3));
        System.out.println(checkPrimer(primer4));
    }

    static boolean checkPrimer(String primer){
        Stack<Character> stack = new Stack<>();
        char[] arr = primer.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');

        for (char cur: arr){
            if (map.containsKey(cur)){
                stack.push(cur);
            }
            if (map.containsValue(cur)){
                if (stack.empty() || map.get(stack.pop()) != cur){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}  

