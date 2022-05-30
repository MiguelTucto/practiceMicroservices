package pe.edu.upc.services.impls;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.entities.Producto;
import pe.edu.upc.repositories.ProductoRepository;
import pe.edu.upc.services.ProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private ProductoRepository productoRepository;

    @Override
    @Transactional
    public Producto save(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() throws Exception {
        return productoRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Producto> findById(Long id) throws Exception {
        return productoRepository.findById(id);
    }

    @Override
    @Transactional
    public Producto update(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) throws Exception {
        productoRepository.deleteById(id);
    }
}
