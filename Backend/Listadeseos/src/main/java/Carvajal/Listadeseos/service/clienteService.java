package Carvajal.Listadeseos.service;

import Carvajal.Listadeseos.model.cliente;
import Carvajal.Listadeseos.repository.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class clienteService implements clienteRepository
{
    @Autowired
    private clienteRepository clienteRepository;

    @Override
    public List<cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<cliente> findAll(Sort sort) {
        return clienteRepository.findAll(sort);
    }

    @Override
    public Page<cliente> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<cliente> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(cliente entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends cliente> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends cliente> S save(S entity) {
        return null;
    }

    @Override
    public <S extends cliente> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<cliente> findById(Long aLong) {
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
    public <S extends cliente> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends cliente> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<cliente> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public cliente getOne(Long aLong) {
        return null;
    }

    @Override
    public cliente getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends cliente> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends cliente> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends cliente> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends cliente> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends cliente> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends cliente> boolean exists(Example<S> example) {
        return false;
    }
}
