//Сформируйте полный URL, добавив к нему параметры для поиска. Параметры передаются в виде строки, где ключи и значения разделены =, а пары
//ключ-значение разделены &. Если значение null, то параметр не должен
//попадать в URL

class URLBuilder { 
    public static String buildURL(String baseURL, String params) { 
        StringBuilder url = new StringBuilder(baseURL); 
        String[] pairs = params.split("&"); 

        boolean firstParam = true; // Флаг, чтобы правильно добавить первый параметр
        for (String pair : pairs) { 
            String[] keyValue = pair.split("=");
            
            // Если значение параметра не "null" и не пустое, добавляем его в URL
            if (keyValue.length == 2 && keyValue[1] != null && !"null".equals(keyValue[1])) { 
                if (!firstParam) { 
                    url.append("&"); // добавляем амперсанд, если это не первый параметр
                }
                url.append(keyValue[0]).append("=").append(keyValue[1]); 
                firstParam = false; // После первого параметра следующий параметр добавляется с амперсандом
            }
        }
        return url.toString(); 
    } 
    
    public static void main(String[] args) { 
        String baseURL = ""; 
        String params = ""; 
        if (args.length == 0) { 
            baseURL = "https://example.com/search?"; 
            params = "query=java&sort=desc&filter=null"; 
        } else { 
            baseURL = args[0]; 
            params = args[1]; 
        }
        
        URLBuilder ans = new URLBuilder(); 
        System.out.println(ans.buildURL(baseURL, params)); 
    }
}
