package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//Usar Query para otros metodos o SQl native
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Obetener por un id
    List<Producto> findByIdCategoria(int idCategoria);

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    /*
    //Usamos el lenguaje nativo de sql, y podemos llamar al metodo de otro nombre
    @Query(value = "select * from productos where id_categoria=?", nativeQuery = true)
    List<Producto> getByCategoria(int idCategoria);
     */
}