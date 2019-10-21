package My;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
	String Title;
	
	public Section() {}
	public Section(String t) {
		this.Title = t;
	}
	
	List<Element> lista = new ArrayList<Element>();
	
	public void addSection(Element e) {
		lista.add(e);
	}
	
	public void RemoveSection(Element e) {
		lista.remove(e);
	}
	
	public Element getElement(int index) {
		return lista.get(index);
	}
	
	public void add(Element e) {
		lista.add(e);
	}
	@Override
	public void print() {
		
		
	}
	
	
	
}

