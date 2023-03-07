package view;

import Controller.ExeController;

public class Principal {

	public static void main(String[] args) {
		for (int j= 0; j < 5 ; j ++) {
		
		ExeController exeController = new ExeController(j);
		exeController.start();
		
		}
	}

}
