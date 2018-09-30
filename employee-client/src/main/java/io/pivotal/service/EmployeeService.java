package io.pivotal.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.pivotal.domain.Company;
import io.pivotal.domain.Employee;

@Service
public class EmployeeService {

	private String directoryServiceURI = "http://localhost:8080/directories/CTS";

	private RestTemplate restTemplate = new RestTemplate();

	public List<Employee> getEmployees(String companyCode) {

		ParameterizedTypeReference<Resource<Company>> emp = new ParameterizedTypeReference<Resource<Company>>() {
		};

		ResponseEntity<Resource<Company>> response = restTemplate
				.exchange(RequestEntity.get(URI.create(directoryServiceURI)).accept(MediaTypes.HAL_JSON).build(), emp);

		assert response != null;
		if (response.getStatusCode() == HttpStatus.OK) {
			System.out.println(response);
			Company company = response.getBody().getContent();
			System.out.println(company.getEmployees());
			assert company != null;
			return company.getEmployees();
		} else {
			System.out.println(response);
			return Collections.emptyList();

		}
	}

}
