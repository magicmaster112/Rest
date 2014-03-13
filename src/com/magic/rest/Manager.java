package com.magic.rest;

import java.sql.Connection;
import java.util.ArrayList;

public class Manager {

	public ArrayList<Document> GetFeeds() throws Exception {
		ArrayList<Document> docs = null;
		try {
			DBConnection database = new DBConnection();
			Connection connection = database.Get_Connection();
			Data data = new Data();
			docs = data.GetData(connection);

		} catch (Exception e) {
			throw e;
		}
		return docs;
	}

}
