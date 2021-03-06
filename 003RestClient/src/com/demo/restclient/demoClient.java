package com.demo.restclient;




import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;


public class demoClient {

	public static void main(String[] args) {
		
		ClientConfig config = new ClientConfig();
		
		Client client = ClientBuilder.newClient(config);
		
		WebTarget webTarget = client.target(getCustomURI());
		
		String response = webTarget.path("rest")
									.path("friends")
									.path("getall")
									.request()
									.accept(MediaType.APPLICATION_JSON)
									.get(Response.class)
									.toString();
		
		System.out.println(response);
		
		String message = webTarget.path("rest")
									.path("friends")
									.path("getall")
									.request()
									.accept(MediaType.APPLICATION_JSON)
									.get(String.class)
									.toString();
		
		System.out.println(message);
		
		String response1 = webTarget.path("rest")
									.path("friends")
									.path("1")
									.request()
									.accept(MediaType.APPLICATION_JSON)
									.get(Response.class)
									.toString();
		
		System.out.println(response1);

		String message1 = webTarget.path("rest")
									.path("friends")
									.path("1")
									.request()
									.accept(MediaType.APPLICATION_JSON)
									.get(String.class)
									.toString();
		System.out.println(message1);
		
		
		Response response2 = webTarget.path("rest")
									.path("friends")
									.path("remove")
									.path("1")
									.request()
									.accept(MediaType.APPLICATION_JSON)
									.delete(Response.class);
		System.out.println(response2);
		
		String message2 = webTarget.path("rest")
									.path("friends")
									.path("remove")
									.path("1")
									.request()
									.accept(MediaType.APPLICATION_JSON)
									.delete(String.class);
		System.out.println(message2);
		
		
		Response response3 = webTarget.path("rest")
									.path("friends")
									.path("update")
									.request()
									.accept(MediaType.APPLICATION_JSON)
									.post(Entity.entity(
								       )
		System.out.println(response3);
					
		String message3 = webTarget.path("rest")
									.path("friends")
									.path("update")
									.request()
									.accept(MediaType.APPLICATION_JSON)
									.
		System.out.println(message3);

		
		
	}

	private static  URI getCustomURI() {

		return UriBuilder.fromUri("http://localhost:8080/004CRUDJerseyFriends").build();
	}

}
