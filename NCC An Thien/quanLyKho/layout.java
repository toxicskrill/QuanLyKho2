package quanLyKho;

import java.util.ArrayList;

public class layout implements ILayoutRender {

    ArrayList<String> content = new ArrayList<>();
	
	public void hien(String out) {
    	System.out.println("------------------------------------");
    	System.out.println(out);
    	System.out.println("------------------------------------");
    }

	@Override
	public void oneLineRender(String out) {
	    content.add(out);
	}

	@Override
	public void addLine(String out) {
		content.add(out);
	}

	@Override
	public void render() {
		System.out.println("------------------------------------");
	    System.out.println(getContent());
		System.out.println("------------------------------------");
	}
	
	@Override
	public String getContent() {
		
		String text = "";
		
		for (int i = 0; i < content.size(); i++) {
			text += content.get(i) + "\n";
		}
		return text;
	}
}