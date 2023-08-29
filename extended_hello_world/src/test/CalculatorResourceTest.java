package ch.zli.m223;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Response;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class CalculatorResourceTest {

    @Test
    public void testAddNumbers() {
        int num1 = 12;
        int num2 = 30;
        int expectedSum = num1 + num2;

        Client client = ClientBuilder.newClient();
        Response response = client.target("/calculator/add/" + num1 + "/" + num2).request().get();
        int result = response.readEntity(Integer.class);

        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(expectedSum, result);
    }
}