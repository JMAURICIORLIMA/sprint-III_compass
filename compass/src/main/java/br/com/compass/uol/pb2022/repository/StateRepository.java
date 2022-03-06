package br.com.compass.uol.pb2022.repository;

import br.com.compass.uol.pb2022.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

    @Query("Select st From State st where upper(st.regiao) = upper(:region)")
    public List<State> findByRegion(@Param("region") String region);

    @Query("Select st From State st where st.populacao = (select max(populacao) from State)")
    public List<State> findByLargestPopulation();

    @Query("Select st From State st where rownum <= 5 order by st.area desc")
    public List<State> findByMaxArea();
}
