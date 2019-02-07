package stackExample;

public class StackNode {
	private String data;
	private StackNode link;
	
	public StackNode() {
		this.data = "";
		this.link = null;
	}
	
	public StackNode(String data) {
		this.data = data;
		this.link = null;
	}
	
	public StackNode(String data, StackNode link) {
		this.data = data;
		this.link = link;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public StackNode getLink() {
		return link;
	}
	
	public void setLink(StackNode link) {
		this.link = link;
	}
}
