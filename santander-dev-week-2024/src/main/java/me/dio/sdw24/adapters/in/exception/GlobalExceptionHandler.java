package me.dio.sdw24.adapters.in.exception;

import me.dio.sdw24.domain.exception.ChampionNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //centraliza algumas operações de Controller
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class); //variável para permitir a criação de logs para os erros que forem tratados nesta classe

    /*
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY) //Tipo de erro de HTTP que pretendemos que seja lançado no frontend após à requisição HTTP
    @ExceptionHandler(ChampionNotFoundException.class) //permite ao SpringBoot manusear todas as excepções do tipo "ChampionNotFoundException"
    public ApiError handleDomainException(ChampionNotFoundException domainError) {
        return new ApiError(domainError.getMessage());
    }

     */

    @ExceptionHandler(ChampionNotFoundException.class) //permite ao SpringBoot manusear todas as excepções do tipo "ChampionNotFoundException"
    public ResponseEntity <ApiError> handleDomainException(ChampionNotFoundException domainError) {
        return ResponseEntity.unprocessableEntity()
                             .body(new ApiError(domainError.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity <ApiError> handleInternalServerException(Exception unexpectedError) {
        String message = "Ocorreu um erro inesperado!";
        logger.error(message, unexpectedError); //cria um log, enviando a mensagem de erro inesperado e o tipo de erro inesperado que foi obtido

        return ResponseEntity.internalServerError()
                             .body(new ApiError(message));
    }

    public record ApiError(String message) {}
}
