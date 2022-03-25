package RATests;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class FirstTest {
    // this is the test
    @Test
    public void shouldRun(){
        given()
                .baseUri("https://api.trello.com/1/")
                .when()
                .get("members/agatakaraskiewicz2")
                .then()
                .statusCode(200);
    }
}
