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
	chpOneOne.createImage("Image 1");
	chpOneOne.createParagraph("Paragraph 4");
	chpOneOne.createTable("Table 1");
	chpOneOne.createParagraph("Paragraph 5");	
	
	
	chpOneOne.print();
}
	
	/*public static void main(String[] args) throws Exception {
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila......"));
		noapteBuna.addContent(cap1);

		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from subchapter 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Image("Image subchapter 1.1.1.1"));
}*/

}