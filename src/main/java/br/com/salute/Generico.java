package br.com.salute;

import br.com.salute.dto.IsbnDTO;
import br.com.salute.interfaces.Connector;

public class Generico implements Connector {
    public IsbnDTO recuperarIsbn(String codigoIsbn) {
        IsbnDTO dto = new IsbnDTO();
        dto.setCodigoIsbn(codigoIsbn);
        dto.setObservacao("Essa informação foi definida pelo provedor genérico");
        return dto;
    }
}
