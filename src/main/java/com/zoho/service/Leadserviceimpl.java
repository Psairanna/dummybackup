package com.zoho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Lead;
import com.zoho.repository.LeadRepository;

@Service
public class Leadserviceimpl implements Leadservice {

	@Autowired
	private LeadRepository leadrepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		leadrepo.save(lead);
		
	}

	

}
