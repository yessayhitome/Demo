package com.helper.files;

import java.io.IOException;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager get_InstanceFRM() {
		
		File_Reader_Manager frm = new File_Reader_Manager();
		
		return frm;

	}
	
	public Test_Data_Reader get_Instance_Reader() throws IOException {
		
		Test_Data_Reader tdr = new Test_Data_Reader();
		
		return tdr;

	}

}
