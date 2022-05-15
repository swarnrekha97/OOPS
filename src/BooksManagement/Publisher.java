package BooksManagement;

import java.util.Objects;

public class Publisher {

	int id;
	String publisherName;
	
	
	public Publisher() {
		
	}
	 
	public Publisher(int id) {
		this.id=id;
		
	}
	
	public Publisher(int id, String publisherName) {
		super();
		this.id = id;
		this.publisherName = publisherName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, publisherName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return id == other.id && Objects.equals(publisherName, other.publisherName);
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}
	
	
	
}
