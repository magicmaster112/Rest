package com.magic.rest;

import java.util.ArrayList;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("service")
public class Service {

	@GET
	@Path("get")
	@Produces("application/json")
	public String messageFeed() {
		String docs = null;
		try {
			ArrayList<Document> docData = null;
			Manager manager = new Manager();
			docData = manager.GetFeeds();
			docs = DoctoJson.transform(docData);
		} catch (Exception e) {
			System.out.println("error");
		}
		return docs;
	}

}