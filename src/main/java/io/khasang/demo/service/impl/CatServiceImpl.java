package io.khasang.demo.service.impl;

import io.khasang.demo.data.Cat;
import io.khasang.demo.repository.CatRepository;
import io.khasang.demo.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("catService")
public class CatServiceImpl implements CatService {
    @Autowired
    private CatRepository repository;

    @Override
    public List<Cat> getAllCats() {
        return repository.findAll();
    }

    @Override
    public Cat getCatById(long id) {
        return repository.findById(id);
    }

    @Override
    public Cat addCat(Cat cat) {
        return repository.save(cat);
    }

    @Override
    public Cat deleteCat(long id) {
        repository.delete(id);
        return new Cat();
    }

}
