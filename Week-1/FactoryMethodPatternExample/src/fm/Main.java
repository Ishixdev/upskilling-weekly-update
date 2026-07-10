package fm;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What document do you want to make?");
		String d_type = sc.next();
		DocumentFactory factory;
		sc.close();
		if(d_type.equals("Word")) {
			factory = new WordDocumentFactory();
		}
		else if(d_type.equals("Excel")) {
			factory = new ExcelDocumentFactory();
		}
		else if(d_type.equals("PDF")) {
			factory = new PDFDocumentFactory();
		}
		else {
		    throw new IllegalArgumentException("Invalid document type: " + d_type);
		    
		}
		Document doc = factory.createDocument();
		doc.open();
		
	}
	
	

}
