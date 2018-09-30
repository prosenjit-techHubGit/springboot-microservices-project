package io.pivotal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.pivotal.directory.domain.Directory;
import io.pivotal.directory.domain.Person;
import io.pivotal.directory.repository.DirectoryRepository;

@SpringBootApplication
public class DirectoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectoryServiceApplication.class, args);

	}

	@Bean
	CommandLineRunner addPersons(DirectoryRepository repo) {

		return args -> {

			List<Person> people = new ArrayList<Person>() {

				private static final long serialVersionUID = -6851604214661500516L;
				{
					add(new Person("John", "Doe", "Managers"));
					add(new Person("Carl", "Doe", "Employees"));
					add(new Person("Trish", "Doe", "Employees"));
				}
			};

			repo.save(new Directory("CTS", people));

			List<Person> people1 = new ArrayList<Person>() {

				private static final long serialVersionUID = -6851604214661500516L;
				{
					add(new Person("John1", "Doe", "Managers"));
					add(new Person("Carl1", "Doe", "Employees"));
					add(new Person("Trish1", "Doe", "Employees"));
				}
			};

			repo.save(new Directory("TCS", people1));
		};

	}

}
