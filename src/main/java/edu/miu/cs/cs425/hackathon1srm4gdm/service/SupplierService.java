package edu.miu.cs.cs425.hackathon1srm4gdm.service;

import edu.miu.cs.cs425.hackathon1srm4gdm.model.Supplier;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SupplierService {

    public abstract List<Supplier> getAllSuppliers();
    public abstract Page<Supplier> getAllSuppliersPaged(int pageNo);

}
