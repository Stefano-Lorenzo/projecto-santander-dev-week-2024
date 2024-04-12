package me.dio.sdw24.application;

import me.dio.sdw24.domain.exception.ChampionNotFoundException;
import me.dio.sdw24.domain.model.Champion;
import me.dio.sdw24.domain.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId, String question) {

        /*
            pesquisar o campeão pelo id, porém, sendo que a pesquisa é um "optional"
            ela poderá retornar um NullException; então utiliza-se a função
            "orElseThrow()" para controlar o tratamento de excepção sem usar "try-catch"
        * */

        Champion champion = repository.findById(championId)
                                      .orElseThrow(() -> new ChampionNotFoundException(championId));

        String championContext = champion.generateContextByQuestion(question);

        return championContext;
    }
}
