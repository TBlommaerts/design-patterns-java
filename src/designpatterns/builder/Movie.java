package designpatterns.builder;

import java.time.LocalDate;

public class Movie {
	
	private final String title;
	private final Genre genre;
	private final String director;
	private final LocalDate releaseDate;
	private final String description;
	
	// Bad design -> telescoping constructors
	public Movie(String title) {
		this(title, null);
	}
	
	public Movie(String title, Genre genre) {
		this(title, genre, null);
	}
	
	public Movie(String title, Genre genre, String director) {
		this(title, genre, director, null);
	}
	
	public Movie(String title, Genre genre, String director, LocalDate releaseDate) {
		this(title, genre, director, releaseDate, null);
	}
	
	public Movie(String title, Genre genre, String director, LocalDate releaseDate, String description) {
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.releaseDate = releaseDate;
		this.description = description;
	}
	
	// We can not create a constructor for every scenario, below code would lead to errors because of a duplicate method signature.
//	public Movie(String title, String director);
//	public Movie(String title, String description);
	
	public String getTitle() {
		return title;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public String getDirector() {
		return director;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	
	public String getDescription() {
		return description;
	}
}

