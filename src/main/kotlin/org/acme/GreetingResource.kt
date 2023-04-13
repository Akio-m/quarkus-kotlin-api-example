package org.acme

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource(private val greetingService: GreetingService) {

    @GET
    fun hello() = Greeting("Hello")

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    fun greeting(name: String): String {
        return greetingService.greeting(name)
    }
}