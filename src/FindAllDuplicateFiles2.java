import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateFiles2 {

	public static void main(String[] args) {
		 File f = new File("/Users/mraleraskar/Priyanka/workspace/Interview/src");
		 if(!f.exists()){
			 return;
		 }
//		 String[] list = f.list();
//		 List<String> newlist = new ArrayList<String>();
//		 
//		 for(String filename : list){
//			 	//newlist.
//				 System.out.println(filename); 
//		 }
		 
		 getlist(f.toString());
		 
		 
	}
	
	static void getlist(String dir){
		File f = new File(dir);
		File[] files = f.listFiles();
		 for (File file : files) {
		        if (file.isFile()) {
		            System.out.println(file.getAbsolutePath());
		        } else if (file.isDirectory()) {
		            getlist(file.getAbsolutePath());
		        }
		    }
		    //System.out.println(fList);
	}

}
