package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("/calculator")
public class CalculatorResource {

    @GET
    @Path("/add/{num1}/{num2}")
    public Response addNumbers(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        int sum = num1 + num2;
        return Response.ok(sum).build();
    }
}
