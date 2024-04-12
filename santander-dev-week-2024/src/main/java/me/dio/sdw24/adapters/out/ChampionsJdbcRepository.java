package me.dio.sdw24.adapters.out;

import me.dio.sdw24.domain.model.Champion;
import me.dio.sdw24.domain.ports.ChampionsRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //inversão de controlo permitindo ao Spring lidar com as instâncias de repositório
public class ChampionsJdbcRepository implements ChampionsRepository {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper <Champion> championRowMapper; //responsável por fazer a conversão de um resultSet (consulta nativa JDBC) na BD para o record (modelo ou entidade)

    public ChampionsJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.championRowMapper = (rs, rowNum) -> new Champion(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("role"),
                rs.getString("personality"),
                rs.getString("image_url")
        );
    }

    @Override
    public List <Champion> findAll() {
        return jdbcTemplate.query("SELECT * FROM CHAMPIONS", championRowMapper);
    }

    /*
        Por norma, o tipo de chamada "queryForObject" é mais indicado quando a
        query a efectuar é por ID, para que não retorne uma lista, mas sim um
        vector de objectos.

        Porém, devido ao tipo de retorno que é um "Optional", se não for dado
        um tratamento para excepções, a possibilidade de se obter um
        "EmptyResultSetException" é muito maior.

    * */

    /**

    @Override
    public Optional<Champion> findById(Long id) {
        String sql = "SELECT * FROM CHAMPIONS WHERE ID = ?";
        Champion champion = jdbcTemplate.queryForObject(sql, championRowMapper, id);
        return Optional.ofNullable(champion);
    }

    **/

    /*
        Por norma, o tipo de chamada "queryForObject" é mais indicado quando a
        query a efectuar é por ID, para que não retorne uma lista, mas sim um
        vector de objectos.

        Porém, devido ao tipo de retorno que é um "Optional", se não for dado
        um tratamento para excepções, a possibilidade de se obter um
        "EmptyResultSetException" é muito maior.

        Logo, surge a necessidade de se alterar o tipo de chamada e utilizar a
        função "query", porém alterando o tipo de retorno, utilizando a função
        do tipo Optional "findFirst", de modo a chamar a excepção criada para
        este tipo de query
    * */

    @Override
    public Optional<Champion> findById(Long id) {
        String sql = "SELECT * FROM CHAMPIONS WHERE ID = ?";
        List <Champion> champion = jdbcTemplate.query(sql, championRowMapper, id);
        return champion.stream().findFirst();
    }
}
