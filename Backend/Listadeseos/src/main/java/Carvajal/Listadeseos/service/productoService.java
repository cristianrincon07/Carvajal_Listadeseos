package Carvajal.Listadeseos.service;

import Carvajal.Listadeseos.model.producto;
import Carvajal.Listadeseos.repository.productoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class productoService implements productoRepository
{
    @Autowired
    private productoRepository productoRepository;

    //This you might want to get injected by the container
    @Autowired
    protected EntityManager entityManager;

    @Override
    public List<producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<producto> findAll(Sort sort) {
        return productoRepository.findAll(sort);
    }

    public List<producto> findALlByClient(String id)
    {
        return (List<producto>) entityManager.createQuery("Select p from producto p where p.idCliente LIKE :Id").setParameter("Id",id).setMaxResults(10).getResultList();
    }

    @Override
    public Page<producto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<producto> findAllById(Iterable<Long> longs) {
        return productoRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        productoRepository.deleteById(aLong);
    }

    @Override
    public void delete(producto entity) {
        productoRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends producto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends producto> S save(S entity) {

        return productoRepository.save(entity);
    }

    @Override
    public <S extends producto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<producto> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends producto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends producto> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<producto> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public producto getOne(Long aLong) {
        return null;
    }

    @Override
    public producto getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends producto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends producto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends producto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends producto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends producto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends producto> boolean exists(Example<S> example) {
        return false;
    }
}
