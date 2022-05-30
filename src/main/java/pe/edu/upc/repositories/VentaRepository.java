package pe.edu.upc.repositories;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import pe.edu.upc.entities.Venta;

public interface VentaRepository extends JpaAttributeConverter<Venta, Long> {
}
