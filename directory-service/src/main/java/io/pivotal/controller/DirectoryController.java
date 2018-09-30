package io.pivotal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.directory.domain.Directory;
import io.pivotal.directory.repository.DirectoryRepository;

@RestController
public class DirectoryController {

	@Autowired
	DirectoryRepository repo;

	@RequestMapping("/directories")
	public List<Directory> getAllDirectories() {
		return (List<Directory>) repo.findAll();

	}

	@RequestMapping("/directories/{companyCode}")
	public Directory getDirectoryByCompany(@PathVariable String companyCode) {
		return repo.findByCompanyCode(companyCode);

	}

}
