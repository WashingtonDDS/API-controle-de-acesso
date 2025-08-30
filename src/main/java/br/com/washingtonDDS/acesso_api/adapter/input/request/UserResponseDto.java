package br.com.washingtonDDS.acesso_api.adapter.input.request;

public record UserResponseDto(Long id, String email, Boolean administrator, PersonResponseDto person) {
}
