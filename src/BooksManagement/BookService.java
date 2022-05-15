package BooksManagement;

import java.util.Arrays;

public class BookService {
	 public Book[] filterBooksByAuthor(Author author, Book[] books) {
			Book[] returnlist= new Book[books.length];
			int k=0;
			for(int i=0;i<books.length;i++) {
				Author[] authors=books[i].getAuthor();
				for(int j=0;j<authors.length;j++){
					if(authors[j].equals(author))
					returnlist[k++]=books[i];
				}
			}
			Book[] returnlistfiltered= new Book[k];
			for(int i=0;i<k;i++) {
				returnlistfiltered[i]=returnlist[i];
			}
			
			return returnlistfiltered;
		}

		public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
			Book[] returnlist= new Book[books.length];
			int k=0;
			for(int i=0;i<books.length;i++) {
				Publisher bookPublisher=books[i].getPublisher();
				
					if(bookPublisher.equals(publisher))
					returnlist[k++]=books[i];
				
			}
			Book[] returnlistfiltered= new Book[k];
			for(int i=0;i<k;i++) {
				returnlistfiltered[i]=returnlist[i];
			}
			
			return returnlistfiltered;
		}

		public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
			Book[] returnlist= new Book[books.length];
			int k=0;
			for(int i=0;i<books.length;i++) {
				int publishingyear=books[i].getPublishingYear();
				
					if(publishingyear>=yearFromInclusively)
					returnlist[k++]=books[i];
				
			}
			Book[] returnlistfiltered= new Book[k];
			for(int i=0;i<k;i++) {
				returnlistfiltered[i]=returnlist[i];
			}
			
			return returnlistfiltered;
		}
		

}
