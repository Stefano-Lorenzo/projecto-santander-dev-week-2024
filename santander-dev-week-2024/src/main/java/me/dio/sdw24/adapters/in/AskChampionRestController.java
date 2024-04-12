package me.dio.sdw24.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.dio.sdw24.application.AskChampionUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/champions") //mapeamento do endpoint que será exposto ao frontend

@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do jogo League of Legends") //para alterar o nome da classe Controller e apresentar uma descrição precisa no acto de documentação da API
public record AskChampionRestController(AskChampionUseCase championUseCase) {

    @PostMapping("/{championId}/ask") //mapeamento do endpoint "POST" para submeter uma requisição ao servidor
    public AskChampionResponse askChampion(
            @PathVariable Long championId, //conforme definido no mapeamento POST
            @RequestBody AskChampionRequest request) {

        String answer = championUseCase.askChampion(championId, request.question()); //resposta a ser dada ao utilizador final após à questão efectuada ao campeão

        return new AskChampionResponse(answer);
    }

    public record AskChampionRequest(String question){}

    public record AskChampionResponse(String answer){}

}
