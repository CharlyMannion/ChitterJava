package com.charlymannion.ChitterJava;

import com.charlymannion.ChitterJava.Peep;
import org.springframework.data.repository.CrudRepository;

public interface PeepRepository extends CrudRepository<Peep, Long> {

}