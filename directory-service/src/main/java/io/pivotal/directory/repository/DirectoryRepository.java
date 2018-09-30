package io.pivotal.directory.repository;


import io.pivotal.directory.domain.Directory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectoryRepository extends CrudRepository<Directory, Long> {
	
	public Directory findByCompanyCode(String companyCode);

}
