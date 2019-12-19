package com.class29;

public abstract class File {

	public  void open() {
	}
	
	
	
	public  void edit() {
		System.out.println("I can edit");
	}
	public void close() {
		System.out.println("I can open");
	}
}
class JavaFile extends File{
	@Override
	public void open() {
		
	}

	}

class WorFile extends File{
	@Override
	public void open() {
		
	}

	
}
class PDFFile extends File{
	@Override
	public void open() {
		
	}	
}





