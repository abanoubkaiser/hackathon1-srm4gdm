package edu.miu.cs.cs425.hackathon1srm4gdm.service.impl;

import edu.miu.cs.cs425.hackathon1srm4gdm.model.Supplier;
import edu.miu.cs.cs425.hackathon1srm4gdm.repository.SupplierRepository;
import edu.miu.cs.cs425.hackathon1srm4gdm.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll(Sort.by("name"));
    }

    @Override
    public Page<Supplier> getAllSuppliersPaged(int pageNo) {
        return supplierRepository.findAll(PageRequest.of(pageNo, 5, Sort.by("name")));
    }
}
