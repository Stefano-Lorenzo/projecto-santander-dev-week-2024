package me.dio.sdw24.domain.exception;

/* classe que estende a classe RuntimeException e possibilita a criação de exceptions
   personalizadas
 */

public class ChampionNotFoundException extends RuntimeException {
    public ChampionNotFoundException(Long championId) {
        super("Champion id %d not found!".formatted(championId));
    }
}
