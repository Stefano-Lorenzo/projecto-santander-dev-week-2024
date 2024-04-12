package me.dio.sdw24.domain.model;

/*

porquê da utilização do record: apesar de ser uma classe de DTO
* (data transfer object), apenas para uso temporário e transferência de dados;
* este tipo de implementação permite o encapsulamento automático, pois necessita
* das informações atribuídas já como instância, uma vez que o record permite o
* tráfego de informações de um lado para o outro; informações essas que irão ser
* sempre necessárias.

* Vantagens: tem menos verbosidade da classe java normal

* Desvantagens: segundo as boas práticas de programação Java, não é aconselhável
* que se persista um record na base de dados

 */
public record Champion(
        Long id,
        String name,
        String role,
        String personality,
        String imageUrl
) {

    // método que prepara os dados que serão requisitados via endpoint e os retorna ao utilizador final
    public String generateContextByQuestion(String question) {
        return """
                Questão: %s
                Nome do Campeão: %s
                Função ou Papel: %s
                Histórico ou Personalidade do Campeão: %s
                """.formatted(question, this.name, this.role, this.personality);
    }
}
