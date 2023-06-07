package com.example.project.pharmacy.service;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.pharmacy.entity.Pharmacy;
import com.example.project.pharmacy.repository.PharmacyRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class PharmacyRepositoryService {

	private final PharmacyRepository pharmacyRepository;

	@Transactional
	public void updateAddress(Long id, String address) {
		Pharmacy pharmacy = pharmacyRepository.findById(id).orElse(null);

		if (Objects.isNull(pharmacy)) {
			log.error("[PharmacyRepositoryService updateAddress] not found id: {}", id);
			return;
		}

		pharmacy.changePharmacyAddress(address);
	}

	//for test
	public void updateAddressWithoutTransaction(Long id, String address) {
		Pharmacy pharmacy = pharmacyRepository.findById(id).orElse(null);

		if (Objects.isNull(pharmacy)) {
			log.error("[PharmacyRepositoryService updateAddress] not found id: {}", id);
			return;
		}

		pharmacy.changePharmacyAddress(address);
	}
	
	@Transactional(readOnly = true)
	public List<Pharmacy> findAll() {
		return pharmacyRepository.findAll();
	}
}
