package io.khasang.demo.service;

import io.khasang.demo.data.Cat;

import java.util.List;

public interface CatService {

    List<Cat> getAllCats();

    Cat getCatById(long id);
    Cat addCat(Cat cat);
    Cat deleteCat(long id);
}
