package nicol.spring.openbootcampspringej456.service;

import java.util.List;

import nicol.spring.openbootcampspringej456.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import nicol.spring.openbootcampspringej456.domain.Laptop;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    public Laptop findById(Long id) {
        return laptopRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("No se encontró el laptop con ID: " + id));
    }

    public Laptop create(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public Laptop update(Long id, Laptop laptop) {
        Laptop existingLaptop = findById(id);
        existingLaptop.setBrand(laptop.getBrand());
        existingLaptop.setModel(laptop.getModel());
        existingLaptop.setPrice(laptop.getPrice());
        return laptopRepository.save(existingLaptop);
    }

    public void delete(Long id) {
        laptopRepository.delete(findById(id));
    }
}

