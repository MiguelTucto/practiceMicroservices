package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.entities.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
