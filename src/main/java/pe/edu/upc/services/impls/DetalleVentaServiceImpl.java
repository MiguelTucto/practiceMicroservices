package pe.edu.upc.services.impls;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.entities.DetalleVenta;
import pe.edu.upc.repositories.DetalleVentaRepository;
import pe.edu.upc.services.DetalleVentaService;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    private DetalleVentaRepository detalleVentaRepository;

    @Override
    @Transactional
    public DetalleVenta save(DetalleVenta entity) throws Exception {
        return detalleVentaRepository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DetalleVenta> findAll() throws Exception {
        return detalleVentaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<DetalleVenta> findById(Long id) throws Exception {
        return detalleVentaRepository.findById(id);
    }

    @Override
    @Transactional
    public DetalleVenta update(DetalleVenta entity) throws Exception {
        return detalleVentaRepository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) throws Exception {
        detalleVentaRepository.deleteById(id);
    }
}
