package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Connection conn = DB.getInstanceDB();	//Fazendo a instancia única para conexão do banco de dados
		DB.closeConnection();
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}

	}

}
