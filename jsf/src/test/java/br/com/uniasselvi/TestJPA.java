package br.com.uniasselvi;

import javax.persistence.Persistence;

public class TestJPA {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("jsf");
	}
}
