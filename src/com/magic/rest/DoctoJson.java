package com.magic.rest;

import java.util.ArrayList;

import com.google.gson.Gson;

public class DoctoJson {

	public static String transform(ArrayList<Document> docData) {
		String docs = null;
		Gson gson = new Gson();
		docs = gson.toJson(docData);
		return docs;
	}

}
