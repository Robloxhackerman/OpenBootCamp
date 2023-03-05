package nicol.spring.openbootcampspringej456.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nicol.spring.openbootcampspringej456.domain.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
