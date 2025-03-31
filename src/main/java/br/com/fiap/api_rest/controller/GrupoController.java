package br.com.fiap.api_rest.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/grupo", produces = {"application/json"})
@Tag(name = "api-grupo")
public class GrupoController {
    //PEGAR DO PROFESSOR!
    //@Autowired
    //ClienteRepository clienteRepository;

    //@Autowired
    //ClienteService clienteService;

    //Create, Read, Update, Delete
    //Post, Get, put, Delete

    /*@Operation(summary = "Cria um novo cliente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Endereco Cadastrado com Sucesso",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Endereco.class))}),
            @ApiResponse(responseCode = "400", description = "Atributos informados são inválidos",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    public ResponseEntity<Cliente> createCliente(@Valid @RequestBody ClienteRequest cliente){
        Cliente clienteSalvo = clienteRepository.save(clienteService.requestToCliente(cliente));
        return new ResponseEntity<>(clienteSalvo, HttpStatus.CREATED);
    }*/
}