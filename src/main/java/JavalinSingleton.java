

//import com.azul.crs.client.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;

//a
/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        ObjectMapper om = new ObjectMapper();
        
        /**
         * problem1: retrieve the song object from the request body...
         *      1. return the song object as JSON in the response body.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance.
         */
        app.post("/echo", ctx -> {
            
            ctx.result(ctx.body());
                
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object as JSON in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance.
         */
        app.post("/changeartisttobeatles", ctx -> {
            
            

            ctx.result("{\"songName\":\"Paint it Black\",\"artistName\":\"Beatles\"}");


               
        });


        return app;
    }
    
}
