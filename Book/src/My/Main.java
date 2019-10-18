package My;
//import java.util.ArrayList;

public class Main {
	public static void main(String []args) {
	

	Book diseaTitanic = new Book("Disea Titanic");
	Author OnetiuBogdan = new Author("Onetiu Bogdan");
	diseaTitanic.addAuthor(OnetiuBogdan);
	int indexOfChapter = diseaTitanic.createChapter("Chapter1");
	Chapter chpOne = diseaTitanic.getChapter(indexOfChapter);
	int IndexOfSubchapter = chpOne.createSubChapter("Chapter One One");
	SubChapter chpOneOne = chpOne.getSubChapter(IndexOfSubchapter);
	//int IndexOfParagraph = chpOneOne.createParagraph("Paragraph1");
	//int IndexOfImage = chpOneOne.createImage("Image1");
	//int IndexOfTable = chpOneOne.createTable("Table1");
	
	chpOneOne.createParagraph("Paragraful 1");
	chpOneOne.createParagraph("Paragraful 2");
	chpOneOne.createParagraph("Paragraful 3");
	chpOneOne.createParagraph("Paragraful 4");
	chpOneOne.createParagraph("Paragraful 5");
	
	
	chpOneOne.print();

	
	}
}

