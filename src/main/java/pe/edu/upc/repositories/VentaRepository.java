package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.entities.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
