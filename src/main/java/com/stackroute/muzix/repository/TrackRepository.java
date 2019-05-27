package com.stackroute.muzix.repository;

import com.stackroute.muzix.domain.Track;
//import com.sun.org.apache.bcel.internal.generic.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.apache.catalina.User;
//import org.mapstruct.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {

//    @Query(value = "SELECT * FROM MuzixDB  WHERE trackname = ?1", nativeQuery = true)
    @Query(value= "Select * from track where name =?1",nativeQuery = true)

    public  List<Track>  getByName(String name);


}
