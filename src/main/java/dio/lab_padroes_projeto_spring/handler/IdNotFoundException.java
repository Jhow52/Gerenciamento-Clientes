package dio.lab_padroes_projeto_spring.handler;


public class IdNotFoundException extends RuntimeException {

    public IdNotFoundException(Long id) {
        super("Recurso com ID " + id + " não encontrado.");
    }

    public IdNotFoundException(String message) {
        super(message);
    }
}
