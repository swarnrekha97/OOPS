package BooksManagement;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
	int id;
	String name;
	Author[] author;
	Publisher publisher;
	int publishingYear;
	int amountOfPages;
	BigDecimal price;
	CoverType coverType;
	
	public Book() {
		
	}
	
	public Book(int id, String name, Author[] author, Publisher publisher, int publishingYear, int amountOfPages,
			BigDecimal price, CoverType coverType) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = coverType;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + Arrays.toString(author) + ", publisher=" + publisher
				+ ", publishingYear=" + publishingYear + ", amountOfPages=" + amountOfPages + ", price=" + price
				+ ", coverType=" + coverType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(author);
		result = prime * result + Objects.hash(amountOfPages, coverType, id, name, price, publisher, publishingYear);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return amountOfPages == other.amountOfPages && Arrays.equals(author, other.author)
				&& coverType == other.coverType && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) && Objects.equals(publisher, other.publisher)
				&& publishingYear == other.publishingYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author[] getAuthor() {
		return author;
	}
	public void setAuthor(Author[] author) {
		this.author = author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public int getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}
	public int getAmountOfPages() {
		return amountOfPages;
	}
	public void setAmountOfPages(int amountOfPages) {
		this.amountOfPages = amountOfPages;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public CoverType getCoverType() {
		return coverType;
	}
	public void setCoverType(CoverType coverType) {
		this.coverType = coverType;
	}
	
	

}
