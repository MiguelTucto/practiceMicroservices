package pe.edu.upc.services.impls;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.entities.Venta;
import pe.edu.upc.repositories.VentaRepository;
import pe.edu.upc.services.VentaService;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {

    private VentaRepository ventaRepository;

    @Override
    @Transactional
    public Venta save(Venta entity) throws Exception {
        return ventaRepository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Venta> findAll() throws Exception {
        return ventaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Venta> findById(Long id) throws Exception {
        return ventaRepository.findById(id);
    }

    @Override
    @Transactional
    public Venta update(Venta entity) throws Exception {
        return ventaRepository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) throws Exception {
        ventaRepository.deleteById(id);
    }
}
