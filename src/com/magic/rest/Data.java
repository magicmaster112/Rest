package com.magic.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Data {
	public ArrayList<Document> GetData(Connection connection) throws Exception {
		ArrayList<Document> docData = new ArrayList<Document>();
		try {

			PreparedStatement ps = connection
					.prepareStatement("SELECT * from data");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Document doc = new Document();
				// 1 2 3 4 <=> title, content, Source, Date
				doc.setTitle(rs.getString(1));
				doc.setContent(rs.getString(2));
				doc.setSource(rs.getString(3));
				doc.setDate(rs.getString(4));
				docData.add(doc);
			}
			return docData;
		} catch (Exception e) {
			throw e;
		}
	}

}
