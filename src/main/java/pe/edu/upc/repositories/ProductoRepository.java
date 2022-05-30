package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
