package me.dio.sdw24.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.dio.sdw24.application.ListChampionsUseCase;
import me.dio.sdw24.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions") //mapeamento do endpoint que será exposto ao frontend

@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do jogo League of Legends") //para alterar o nome da classe Controller e apresentar uma descrição precisa no acto de documentação da API
public record ListChampionsRestController(ListChampionsUseCase championsUseCase) {

    @GetMapping
    public List <Champion> findAllChampions() {
        return championsUseCase.repository().findAll();
    }
}
