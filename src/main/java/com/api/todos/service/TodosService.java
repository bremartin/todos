package com.api.todos.service;


import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

//import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//import com.api.todos.db.MongoDB;
import com.api.todos.objects.ToDoListVO;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.ConnectionString;
//import com.mongodb.DBCollection;
//import com.mongodb.DBCursor;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

@Service
public class TodosService {
	
	public InsertOneResult addTodos(ToDoListVO listsObject){
		ConnectionString connectionString = new ConnectionString("mongodb+srv://user-1:dN5J1SFmNELFsBnk@testcluster.umpgn.mongodb.net/testCluster?retryWrites=true&w=majority");
		MongoClientSettings settings = MongoClientSettings.builder()
		        .applyConnectionString(connectionString)
		        .build();
		MongoClient mongoClient = MongoClients.create(settings);
		MongoDatabase database = mongoClient.getDatabase("test");

		//convert object to gson string
		Gson gson = new Gson();
		String json =  gson.toJson(listsObject);
		System.out.println(json);
//		
		Document document = Document.parse(json);
		//document.put("_id", listsObject.getUserID());
		//document.append("userTodos", listsObject);
		String id = listsObject.getUserID();
	
		
		InsertOneResult result = database.getCollection("todos").insertOne(document);
		//database.getCollection("todos").i
		return result;
	}
	
	
	
//	private static void selectAllRecordById(DBCollection collection, String id) 
//	{
//	    BasicDBObject whereQuery = new BasicDBObject();
//	    whereQuery.put("_id", id);
//	    DBCursor cursor = collection.find(whereQuery);
//	    while(cursor.hasNext()) {
//	        System.out.println(cursor.next());
//	    }
//	}
}




