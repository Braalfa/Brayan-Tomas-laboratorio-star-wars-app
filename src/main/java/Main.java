import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {
    private static ObjectMapper mapper = new ObjectMapper();
    private static final Logger logger
            = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet request = new HttpGet("https://swapi.dev/api/people");
            CloseableHttpResponse response = httpClient.execute(request);
            try {
                System.out.println("Hola Mundo");
                System.out.println("cambio para el workflow");
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    var result = EntityUtils.toString(entity);
                    ApiResponse<Character> parsedResponse = mapper.readValue(
                            result, mapper.getTypeFactory().constructParametricType(ApiResponse.class, Character.class));
                    new Interface(parsedResponse.getResults());
                }
                Integer a =6;
                a = null;
                a+=1;
            }catch(Exception e){
                logger.info(e.getMessage(), Main.class.getSimpleName());
            } finally {
                response.close();
            }
        }catch(Exception e){
            logger.info(e.getMessage(), Main.class.getSimpleName());
        } finally {
            httpClient.close();
        }
    }
}
